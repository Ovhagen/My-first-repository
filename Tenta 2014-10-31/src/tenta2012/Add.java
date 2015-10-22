package tenta2012;

public class Add implements Instruction {
	private Word word1, word2, word3;
	public Add(Word word1, Word word2, Word word3){
		this.word1 = word1;
		this.word2 = word2;
		this.word3 = word3;
	}

	public void execute() {
		word3.add(word1, word2);
	}
}
