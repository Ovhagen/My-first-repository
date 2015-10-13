import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

public class Sheet extends Observable implements Environment {
	private SlotFactory slotFactory = new SlotFactory();
	private Map<String, Slot> map = new HashMap<String, Slot>();

	public void clear(String address) {
		// code omitted
	}

	public void set(String address, String string) {
		Slot newSlot = slotFactory.build(string);
		map.put(address, newSlot);
		setChanged();
		notifyObservers();
	}

	public String toString(String address) {
		Slot slot = map.get(address);
		return (slot == null) ? "" : slot.toString();
	}
}
