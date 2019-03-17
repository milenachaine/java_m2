package sandbox;

import java.util.ArrayList;
import java.util.List;

public class MiniXtract {
	
	protected ArrayList<String> liste;

	public MiniXtract(ArrayList<String> l) {
		
		liste = l;
		
	}
	
	public String join(int from, int to, String sep) {
		
	List<String> sousliste = liste.subList(from, to);
	String retour = sousliste.toString();	
	return retour;
	}

}
