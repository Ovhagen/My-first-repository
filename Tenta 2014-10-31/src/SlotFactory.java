
public class SlotFactory {
	private ImplementationOfSlotFactory fc;

	public SlotFactory(){
		fc = new ImplementationOfSlotFactory();
	}

	public Slot build(String s){
		return fc.makeSlot(s);
	}

}
