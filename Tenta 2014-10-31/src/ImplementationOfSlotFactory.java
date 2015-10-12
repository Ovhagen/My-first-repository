
public class ImplementationOfSlotFactory {

	public ImplementationOfSlotFactory() {
	}

	public Slot makeSlot(String s) {
		if (s.toString() == "") {
			throw new IllegalArgumentException();
		}

		Slot slot;
		char c = s.charAt(0);
		if (Character.isDigit(c)) {
			slot = new DigitSlot(Integer.parseInt(s));
		} else {
			slot = new TextSlot(s);
		}

		return slot;
	}

}
