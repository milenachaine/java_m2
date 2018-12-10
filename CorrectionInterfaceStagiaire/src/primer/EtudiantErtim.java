package primer;
/**
 * mettre ici la doc de la classe
 * cette classe représente la modélisation d'un étudiant du département ER-TIM
 * @author milena
 * 
 */
public class EtudiantErtim {

	protected int number;
	protected String name;

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}
	/**
	 * mettre documentation méthode ci-dessous (documenter paramètres)
	 * constructeur d'un EtudiantErtim
	 * @param n nom de l'étudiant
	 * @param num numéro étudiant
	 */
	public EtudiantErtim( String n, int num) {
		number = num;
		name=n;
	}

	@Override
	public boolean equals(Object o) {
		System.out.println("Test equals dans EtudiantErtim");
		EtudiantErtim e = (EtudiantErtim)o; //transtypage en un type + spécialisé
		String stim = e.getName();
		if (name.equals(stim)) { // la méthode equals du type String
			if (number == e.getNumber()) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;			
		}
	}

}