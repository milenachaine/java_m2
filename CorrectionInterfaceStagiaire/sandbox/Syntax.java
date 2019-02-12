package sandbox;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import primer.EtudiantErTim;
import primer.EtudiantIM;
import primer.EtudiantTrad;

public class Syntax {
	
	public static String reverse(String s) {
		String txt = s;
		String[] tab = txt.split("");
		String resultat = "";
        for (int i = tab.length - 1; i >= 0; i--) {
        	resultat = resultat.concat(tab[i]);
        }
		return resultat;
	}
	
	//version récursive !
	public static String reverse2(String s) {
		String txt = s;
		if (txt.isEmpty()) {
			return txt;
		}
		return reverse2(txt.substring(1)) + txt.substring(0,1);
	}

	public static void main(String[] args) {
		System.out.println("Tests!");
		
		String test1 = "Longtemps je me suis levé de bonne heure";
		String test2 = test1.replaceFirst("levé", "couché");
		System.out.println(test2);
		
        int nombreDe = test2.length()-test2.replaceAll("(e|é)", "").length();
        System.out.println("Nombre de e : " + nombreDe);
        
        //transformer une String en int (vice-versa)        
        int nombre = 123;
        //String chaine = Integer.toString(nombre);
        String chaine = String.valueOf(nombre);
        System.out.println(chaine.getClass());
        
        //exercice de split
        
        String exo = "Dummy, John, 28 ans, 14 Balboa Avenue, 2300$";
        String[] tableau = exo.split(", ");
        String nom = tableau[0];
        String prenom = tableau[1];
        String age = tableau[2];
        String adresse = tableau[3];
        Integer salaire = Integer.valueOf(tableau[4].replace("$", ""));
        salaire = salaire*2;
        Integer salaireEuro = (int)(salaire/2.3);
        
        System.out.println(prenom + " " + nom + " habite au " + adresse + " et gagne déjà " + salaire + "$ par mois à " + age + " soit " + salaireEuro + " euro en 15 jours");    

        //extraire les variables de la chaîne suivante : a, b, x, p, q, m, y
        
        String expression = "if{a==(b-2)/4}{x=p/2;} else {q=4*m+y;}";
        String expression2 = expression.replaceAll("([^a-z])|(else)|(if)", "");
        String[] variables = expression2.split("");
        for (int i = 0; i < variables.length; i++) {
        	System.out.println(variables[i]);
        }
        
        //coder une méthode (récursive) String reverse(String s) qui renvoie s dans l'ordre inverse e.g. reverse(« abc ») → « cba »
        String palindrome = "kayak";
        String not_palindrome = "abc";
        
        System.out.println(palindrome + " : " + reverse(palindrome));
        System.out.println(not_palindrome + " : " + reverse(not_palindrome));
        
        String palindrome2 = "kayak";
        String not_palindrome2 = "abcdefgh";
        
        System.out.println(palindrome + " : " + reverse2(palindrome2));
        System.out.println(not_palindrome + " : " + reverse2(not_palindrome2));
        
        //types paramétrés
		EtudiantErTim[] promo = new EtudiantErTim[5];
		promo[0] = new EtudiantTrad ( "Jack" , 12345, "roumain");
		promo[1] = new EtudiantIM ("Jill", 594579, 4);
		promo[2] = new EtudiantTrad ("John", 57456844, "estonien");
		promo[3] = new EtudiantIM ("Jane", 35589567, 2);
		promo[4] = new EtudiantTrad ("Jill", 657465, "japonais");
		
		EtudiantErTim leaderpromo = new EtudiantIM("Jane", 359567, 2);
		boolean yEst = false;
		for (int i = 0; i < promo.length; i++) {
			if (leaderpromo.equals(promo[i])) {
				yEst = true;
				break;
			}
		}
		
		if (yEst == true) {
			System.out.println(":)");
		}
		else {
			System.out.println(":(");
		}
		
		//regexp, pattern, matcher
		
		Pattern nom_regexp = Pattern.compile("(\\w+ \\w+) (\\(\\d{2}\\))");
		Matcher f = nom_regexp.matcher("Anne Solr (14)");
		if (f.matches()) {
			System.out.println("Groupes: " + f.groupCount());
			System.out.println("1 : " + f.group(1));
			System.out.println("2 : " + f.group(2));

		}
		
		Pattern regexp2 = Pattern.compile("(\\w+/\\w+)\\((\\w+ \\w+) & (\\w+ \\w+)\\)");
		Matcher f2 = regexp2.matcher("Nutch/Solr(Julius Sasoude & Tim Ochoa)");
		if (f2.matches()) {
			System.out.println("Groupes: " + f2.groupCount());
			System.out.println("1 : " + f2.group(1));
			System.out.println("2 : " + f2.group(2));
			System.out.println("3 : " + f2.group(3));

		}
		
		String pi = "Pi dont la valeur avec 6 décimales est 3.141592 peut s'approximer avec la série de fractions " + 
				"suivantes : 3/1 , 22/7, 333/106, 355/113, 103993/33102. Al-Khawarizmi, au IXe siècle, est " + 
				"persuadé que PI est irrationnel. Moïse Maïmonide fait également état de cette idée durant le XIIe " + 
				"siècle";
		//0) Extraire la valeur de Pi mentionnée dans la chaîne
		Pattern findpi = Pattern.compile("\\d\\.\\d+");
		Matcher fp = findpi.matcher(pi);
		while (fp.find()) {
			int from = fp.start();
			int to = fp.end();
			System.out.println("Pi : " + pi.substring(from,to));
		}
		
		//1) Effectuez les divisions mentionnées et afficher les résultats correspondants.
		Pattern divisions = Pattern.compile("(\\d+)/(\\d+)");
		Matcher div = divisions.matcher(pi);
		while (div.find()) {
			int from = div.start();
			int to = div.end();
			System.out.println("Division : " + pi.substring(from,to) + " -- Résultat : " + Integer.valueOf(div.group(1))/Integer.valueOf(div.group(2)));
		}
		
		//2) Récupérez les noms propres
		// qu'on définit par au moins deux tokens commençant par une majuscule mais non entièrement en majuscules, séparés par une espace ou un tiret
		Pattern findnp = Pattern.compile("[A-Z][^A-Z ]+( |-)[A-Z][^A-Z \\p{Punct}]+");
		Matcher fnp = findnp.matcher(pi);
		while (fnp.find()) {
			int from = fnp.start();
			int to = fnp.end();
			System.out.println("Nom : " + pi.substring(from,to));
		}
		
		//3) Récupérez les numéros de siècle
		//càd ces lettres en majuscule : I, V, X (suffisant pour les siècles ici)
		Pattern findcenturies = Pattern.compile("[XIV]{2,}");
		Matcher fc = findcenturies.matcher(pi);
		while (fc.find()) {
			int from = fc.start();
			int to = fc.end();
			System.out.println("Siècle : " + pi.substring(from,to));
		}
	}
}
