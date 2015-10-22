package uppg3_tenta_2013_10_24;

public class Client {
	protected CommunicationChannel myCC = new FastCommunicationChannel();
	private void send(String text) {
		myCC.send(text);
	}
	
	public void startLog(DB loggDb){
		this.myCC = new LogedCommunicationChannel(myCC, loggDb);
	}
	
	public void stopLog(){
		if(myCC instanceof LogedCommunicationChannel){
			myCC = ((LogedCommunicationChannel)myCC).getOrigCC();
		}
	}

	private String recieve() {
		return myCC.receive();
	}

}
