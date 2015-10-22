package tenta2010_1;

import java.util.ArrayList;

import tenta2012.Instruction;

public class Save implements Operation{
	private ArrayList<Instruction> logs = new ArrayList<Instruction>();
	
	@Override
	public void logInstruction(Instruction instruction) {
		logs.add(instruction);
	}

}
