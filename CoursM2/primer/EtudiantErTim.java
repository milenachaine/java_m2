package primer;
/**
 * mettre ici la doc de la classe
 * cette classe représente la modélisation d'un étudiant du département ER-TIM
 * dernier update : rendre les objets EtudiantErTim comparables
 * @author milena
 * 
 */
public class EtudiantErTim implements Comparable<EtudiantErTim> {

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
	public EtudiantErTim( String n, int num) {
		number = num;
		name=n;
	}

	@Override
	public boolean equals(Object o) {
		System.out.println("Test equals dans EtudiantErTim");
		EtudiantErTim e = (EtudiantErTim)o; //transtypage en un type + spécialisé
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

	@Override
	public int compareTo(EtudiantErTim etudiant) {
		// ici on compare par numéro d'étudiant
		System.out.println("Test compareTo dans EtudiantErTim");
		int etd_num = etudiant.getNumber();
		
		if (this.number < etd_num) {
			return -1;
		}
		else if (this.number > etd_num) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	//si on voulait comparer par nom
/*    @Override
    public int compareTo(EtudiantErTim arg0) {
            int trialpha = name.compareTo(arg0.getName());
            if(trialpha > 0) {
                    return 1;
            }
            else if (trialpha < 0) {
                    return -1;
            }
            else {
                    return 0;
            }
    }*/

}