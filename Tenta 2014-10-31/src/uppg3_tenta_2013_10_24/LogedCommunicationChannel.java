package uppg3_tenta_2013_10_24;

public class LogedCommunicationChannel implements CommunicationChannel {
	private CommunicationChannel origCC;
	private DB db;

	public LogedCommunicationChannel(CommunicationChannel origCC, DB db) {
		this.origCC = origCC;
		this.db = db;
	}
	
	public CommunicationChannel getOrigCC(){
		return origCC;
	}

	@Override
	public void send(String text) {
		db.appendSent(text);
		origCC.receive();
	}

	@Override
	public String receive() {
		String rec = origCC.receive();
		db.appendReceived(rec);
		return rec;
	}

}
