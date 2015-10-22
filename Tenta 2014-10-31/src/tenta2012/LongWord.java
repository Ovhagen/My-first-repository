package tenta2012;

public class LongWord extends Word{
	private long value;
	
	public LongWord(long value){
		this.value = value;
	}

	@Override
	public void add(Word word1, Word word2) {
		value = (((LongWord) word1).value + ((LongWord)word2).value);
	}

}
