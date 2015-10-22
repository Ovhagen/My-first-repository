package tenta2010_1;

public class Computer {
	private Memory memory;
	private Program program;
	private ProgramCounter programCounter;
	private Operation op;

	public Computer(Operation op) {
		this.op = op;
		setOperation(new Empty());
	}
	
	public void setOperation(Operation newOperation){
		this.op = newOperation;
	}

	public void run() {
		programCounter.setCounter(0);
		while (programCounter.getCounter() >= 0) {
			Instruction instruction = program.get(programCounter.getCounter());
			op.logInstruction(instruction);
			programCounter.increment();
			instruction.execute(memory, programCounter);
		}
	}

}
