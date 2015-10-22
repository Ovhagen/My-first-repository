package uppg3_tenta_2013_10_24;

public interface CommunicationChannel {
    public void send (String text) ;
	public String receive();
}

