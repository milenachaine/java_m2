package primer;

public class EtudiantTrad extends EtudiantErTim {
	
	String langspec;
	
	public String getLangspec() {
		return langspec;
	}

	public EtudiantTrad(String n, int num, String lg) {
		super(n, num); //appelle constructeur classe mère
		langspec = lg;
	}
	
	public EtudiantTrad(String n1, String n2, int num, String lg) {
		super(n1, n2, num); //appelle constructeur classe mère
		langspec = lg;
	}
	
	@Override
	public void print() {
		System.out.println("Je suis en Trad !");
	}
	
	@Override
	public int nombreHeuresDeCours() {
		return 90;	
	}
	
	@Override
	public String typeEtudiant() {
		return "Trad";
	}
}
