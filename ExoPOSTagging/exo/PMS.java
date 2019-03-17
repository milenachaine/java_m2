package exo;

import java.util.List;

public class PMS {
	
	protected String pms;
	protected int nb_args;
		
	public PMS(String... args) {
		
    	pms = "";
    	
	    for (String arg : args) {
	    	
	        nb_args = nb_args +1;
			pms = pms.concat(arg).concat("/");

		}
	    
	    pms = pms.substring(0, pms.length() - 1);
		
	}
	
	@Override
	public String toString() {
		//System.out.println("passage par PMS");
		return pms;
	}
	
	public int size() {
		return nb_args;
	}
	

	public boolean matches(List<TaggedWord> l) {
		
		boolean corr = true;
		
		for (int i = 0; i < l.size(); i++) {
			TaggedWord mot = l.get(i);
			String terme = pms.split("/")[i].replace("%", "");
			if ( (! mot.getPOS().equals(terme)) && (! mot.getWord().equals(terme)) ) {
				corr = false;
			}
		}
		
		return corr;

	}
	
}
