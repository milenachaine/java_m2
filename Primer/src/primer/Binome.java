package primer;

public class Binome {
	
	protected EtudiantIM etudiant1;
	protected EtudiantIM etudiant2;
	protected String sujet;
	protected Integer note;
	
	//constructeur
	public Binome(EtudiantIM e1, EtudiantIM e2, String s) {
		etudiant1 = e1;
		etudiant2 = e2;
		sujet = s;
		note = null;
	}
	
	//setter pour récupérer la note
	public void setNote(Integer note) {
		this.note = note;
	}
	
	//impression
	public void print() {
		System.out.println("Les étudiants " + etudiant1.getName() + " et " + etudiant2.getName() + " ont fait un exposé sur " + sujet + " et ont obtenu la note de " + note);
	}

}
