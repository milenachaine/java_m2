package primer;

public class EtudiantTrad extends EtudiantErTim {

	String langspec;
	
	public EtudiantTrad( String n, int num, String lng) {
		super( n , num);
		langspec=lng;
	}

	public String getLangspec() {
		return langspec;
	}

}
