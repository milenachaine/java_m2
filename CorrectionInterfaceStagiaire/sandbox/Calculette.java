package sandbox;

public class Calculette {

	public static void main(String[] args) {
		Calculette x = new Calculette(0);
		String res = x.plus(10).fois(2).moins(1).toString();
		System.out.println(res);
		// ou encore
		Calculette y = new Calculette(0);
		System.out.println(y.plus(10).fois(2).moins(1));
	}
	
/*	1) Écrire une classe Calculette, ayant un constructeur Calculette().
	Ce constructeur initialise un champ resultat de type Integer à 0 .
	2) Ajouter une méthode Calculette plus(Integer i) qui ajoute au champ resultat la valeur
	passée en argument. Cette méthode devra retourner comme résultat l'instance courante.
	3) Idem que 2) mais avec les méthodes fois(Integer i), moins(Integer i), div(Integer i),
	qui font (resp) une multiplication, soustraction et division .
	4) Redéfinir la méthode toString() qui retournera une String contenant le champ resultat.*/
	
	Integer resultat;
	
	public Calculette() {
		resultat = 0;
	}
	
	public Integer getResultat() {
		return resultat;
	}

	public Calculette(Integer r) {
		resultat = r;
	}
	
	public Calculette plus(Integer i) {
		resultat = resultat + i;
		Calculette calc = new Calculette(resultat);
		return calc;
		}
	
	public Calculette moins(Integer i) {
		resultat = resultat - i;
		Calculette calc = new Calculette(resultat);
		return calc;
		}
	
	public Calculette fois(Integer i) {
		resultat = resultat * i;
		Calculette calc = new Calculette(resultat);
		return calc;
		}
	
	public Calculette div(Integer i) {
		resultat = resultat / i;
		Calculette calc = new Calculette(resultat);
		return calc;
		}
	
	@Override
	public String toString() {
		System.out.println("Test toString dans Calculette");
		return getResultat().toString();
	}

}
