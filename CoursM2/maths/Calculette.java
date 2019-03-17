package maths;

public class Calculette {

	public static void main(String[] args) {
		Calculette x = new Calculette(0);
		String res = x.plus(10).fois(2).moins(1).toString();
		System.out.println(res);
		
		// ou encore
		Calculette y = new Calculette(0);
		System.out.println(y.plus(10).fois(2).moins(1));
		
		Calculette z = new Calculette(8);
		System.out.println(z.div(4));
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
	
	public Calculette(Integer r) {
		resultat = r;
	}
	
	public Integer getResultat() {
		return resultat;
	}
	
	public Calculette plus(Integer i) {
		resultat = resultat + i;
		return new Calculette(this.resultat);
		}
	
	public Calculette moins(Integer i) {
		resultat = resultat - i;
		return new Calculette(this.resultat);
		}
	
	public Calculette fois(Integer i) {
		resultat = resultat * i;
		return new Calculette(this.resultat);
		}
	
	public Calculette div(Integer i) {
		resultat = resultat / i;
		return new Calculette(this.resultat);
		}
	
	@Override
	public String toString() {
		System.out.println("Test toString dans Calculette");
		return getResultat().toString();
	}

}
