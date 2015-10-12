import java.util.Observable;
import java.util.Observer;

import javax.swing.JTextField;

public class Editor extends JTextField implements Observer{

	private String currentAddress;
	private Sheet sheet;

	public Editor(Sheet sheet) {
		this.sheet = sheet;
		sheet.addObserver(this);
	}

	public void update(Observable observable, Object object) {
		setText(sheet.toString(currentAddress));
	}

}
