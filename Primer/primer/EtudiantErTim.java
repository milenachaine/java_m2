package primer;

public abstract class EtudiantErTim {


	protected String name;
	protected int number; // clic droit + refactor > rename pour changer nom partout
	
	public abstract int nombreHeuresDeCours(); //méthode abstraite
	public abstract String typeEtudiant();
	
	public double fraisDeScolarite() {		
		return 70*nombreHeuresDeCours();		
	}
	
	public void print() { //void prcq ø retour
		System.out.println("Je m'appelle "+ name + ", je suis un.e étudiant.e "+ typeEtudiant() + ", mes frais de scolarité s'élèvent à " + fraisDeScolarite());
	}

	public EtudiantErTim(String n , int num ) { //même nom que la classe ; qualifieur public : utilisable partout
		name = n;
		number = num;
	}

	public EtudiantErTim(String n1 , String n2 , int num ) { //signature d'un constructeur = ensemble de la ligne
		name = concat(n1, n2);
		number = num;
	}
	
	public String concat(String s1, String s2) { //concatène deux chaînes de caractères
		return s1+"-"+s2;
	}
		
	@Override
	public String toString() {
		String x = name + " " + number;
		return x;
	}
	
	public String getName() { // généré avec Generate Getters and Setters; on accède au champ des fonctions par des méthodes
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumero() {
		return number;
	}

	public void setNumero(int numero) {
		this.number = numero;
	}

}
