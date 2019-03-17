package exo;

public class TaggedWord {
	
	protected String word;
	protected String POS;
	
	public TaggedWord(String w, String p) {
		word = w;
		POS = p;
	}

	public String getWord() {
		return word;
	}

	public String getPOS() {
		return POS;
	}
	
	@Override
	public String toString() {
		return "[word=" + word +" ; pos=" + POS +"]";
	}
}
