
public class DigitSlot implements Slot {
	private int value;

	public DigitSlot(int value) {
		this.value = value;
	}
	
	public String toString(){
		return String.valueOf(value);
	}

}
