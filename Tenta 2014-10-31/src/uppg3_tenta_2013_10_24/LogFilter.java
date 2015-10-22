package uppg3_tenta_2013_10_24;

import java.util.ArrayList;

public class LogFilter implements DB {
	private ArrayList<String> sentLogs = new ArrayList<String>();
	private ArrayList<String> receivedLogs = new ArrayList<String>();

	@Override
	public void appendSent(String text) {
		sentLogs.add(text);
	}

	@Override
	public void appendReceived(String text) {
		receivedLogs.add(text);
	}
}
