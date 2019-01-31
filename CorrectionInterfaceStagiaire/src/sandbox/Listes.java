package sandbox;

import java.util.ArrayList;
import primer.EtudiantErTim; //importer primer
import primer.EtudiantIM;
import primer.EtudiantTrad;

public class Listes {

	public static void main(String[] args) {

		String transition = "---------------------";
		ArrayList<String> l = new ArrayList<String>();
		l.add("ophelia");
		l.add("juliet");
		l.add("hermione");
		l.add("beatrice");
		//l.add(40) ne fonctionne pas !
		System.out.println(l);
		System.out.println("Taille de la liste : " + l.size());
		System.out.println("Index 3 : " + l.get(3));
		System.out.println("Premier élément de la liste : " + l.get(0));

		String s = l.toString();
		System.out.println(s);

		//boucle v1
		for (int cpt_index = 0; cpt_index < l.size(); cpt_index++) {
			System.out.println("Elément " + cpt_index + " : " + l.get(cpt_index));
		}

		//foreach (ctrl+space)
		for (String nom : l) {
			System.out.println("Elément " + l.indexOf(nom) + " : " + nom);
		}

		//variation sur thème
		int cpt = 0;
		for (String nom : l) {
			System.out.println("Elément " + cpt + " : " + nom);
			cpt ++;
		}

		System.out.println(transition);

		//test de présence
		boolean pst = false;
		if (l.contains("balboa")) {
			pst = true;
		}
		System.out.println(pst);

		pst = false;
		if (l.contains("ophelia")) {
			pst = true;
		}
		System.out.println(pst);

		//retirer elmts liste
		System.out.println(l);
		l.remove("ophelia"); //plus compliqué si on utilise des types plus complexes que String
		System.out.println(l);
		l.remove(0);
		System.out.println(l);

		l.clear(); //removeAll est différent parce qu'on peut lui donner comme argument une Collection
		System.out.println(l);
		if (l.isEmpty()) {
			System.out.println("yeeeet");
		}

		System.out.println(transition);

		//comment faire pour parcourir une liste par bi-grammes, n-grammes ?
		//création liste
		ArrayList<String> liste = new ArrayList<String>();
		liste.add("a");
		liste.add("b");
		liste.add("c");
		liste.add("d");
		liste.add("e");
		liste.add("f");
		System.out.println(liste);

		//boucle simple
		//on pourrait aussi créer une variable n qui définit la longueur des n-grammes
		for(int i = 0; i < liste.size()-1; i++) {
			System.out.println(liste.get(i) + " " + liste.get(i+1));
		}

		//test subList
		System.out.println(liste.subList(1, 4)); //from est inclusif, to est exclusif

		System.out.println(transition);

		//boucle foreach
		for (String elmt : liste) {
			String x = elmt;
			System.out.println(x); //note : x n'existe que dans la boucle
		}

		System.out.println(transition);

		//créons des étudiants
		ArrayList<EtudiantErTim> promo = new ArrayList<EtudiantErTim>();
		promo.add(new EtudiantIM("Marie Du Mortier", 12301, 1));
		promo.add(new EtudiantTrad("John Balboa", 15678, "x"));
		promo.add(new EtudiantIM("Judd Wasthere", 5678, 1));
		promo.add(new EtudiantTrad("Yolanda Forbes", 9876, "Y"));
		promo.add(new EtudiantTrad("Rodrigo Valdes",9877, "Z"));

		//parcourir la liste et afficher le numéro étudiant des étudiants Trad
		for (EtudiantErTim etdt : promo) {
			if (etdt instanceof EtudiantTrad) {
				System.out.println(etdt.getNumber());
			}
		}
		System.out.println(transition);

		//tester si l'étudiant ci-dessous est dans promo
		//attention à equals !
		EtudiantErTim leaderpromo = new EtudiantIM("Judd Wasthere", 5678, 1);

		if (promo.contains(leaderpromo)) {
			System.out.println(promo.indexOf(leaderpromo));
		}

		System.out.println(transition);

		//correction

		ArrayList<String> ll = new ArrayList<String>();
		ll.add("a");ll.add("b");ll.add("c");ll.add("d");ll.add("e");ll.add("f");

		System.out.println( " list size = " + ll.size());
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(i + " >  " + ll.get(i) );
		}
		System.out.println("______un element et son suivant________");
		for (int i = 0; i < ll.size()-1 ; i++) {
			System.out.println(i + " >  " + ll.get(i) +"|" +ll.get(i+1));
		}
		System.out.println("______la sous liste de 2 elems 2-gram________");
		for (int i = 0; i < ll.size()-1 ; i++) {
			System.out.println(i + " >  " + ll.subList(i, i+1+1));
		}

		System.out.println("_______3-gram_______");
		for (int i = 0; i < ll.size()-2 ; i++) {
			System.out.println(i + " >  " + ll.subList(i, i+2+1));
		}


		int p=2;
		System.out.println("_______3-gram parametre p=2_______");
		for (int i = 0; i < ll.size()-p ; i++) {
			System.out.println(i + " >  " + ll.subList(i, i+p+1));
		}
		p=3;
		System.out.println("_______4-gram parametre p=3_______");
		for (int i = 0; i < ll.size()-p ; i++) {
			System.out.println(i + " >  " + ll.subList(i, i+p+1));
		}
		p=5;
		System.out.println("_______etc.. p=5_______");
		for (int i = 0; i < ll.size()-p ; i++) {
			System.out.println(i + " >  " + ll.subList(i, i+p+1));
		}
		p=6;
		System.out.println("_______etc.. p=6_______");
		for (int i = 0; i < ll.size()-p ; i++) {
			System.out.println(i + " >  " + ll.subList(i, i+p+1));
		}
		System.out.println(transition);
		
		ArrayList<String> maliste = new ArrayList<String>();
		maliste.add("a"); maliste.add("b"); maliste.add("c"); maliste.add("d"); maliste.add("e");
		MiniXtract mx = new MiniXtract(maliste);
		String result = mx.join(1,3,"_");
		System.out.println(result);

	}

}
