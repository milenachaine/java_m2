package sandbox;

import java.util.ArrayList;
import java.util.TreeMap;

import primer.EtudiantTrad;

public class Etudiants {

	public static void main(String[] args) {
		/*
		 * Étant donnée une liste* d' EtudiantTrad, on souhaite savoir pour une langue
		 * donnée quel(le)s sont les étudiant(e)s qui l'ont choisie comme langue de
		 * spécialité**
		 * 
		 * 1. Proposez un type de collection permettant de répondre à cette question.
		 * (On ne veut pas parcourir toute la liste des étudiants à chaque
		 * interrogation.) 2. Implémenter et tester.
		 * 
		 * (* : La liste des étudiants vous est fournie ) (** : Il est nécessaire de
		 * disposer d'un getter retournant cette information )
		 */
		ArrayList<EtudiantTrad> liste = new ArrayList<EtudiantTrad>();
		liste.add(new EtudiantTrad("John Balboa", 123, "Chinese"));
		liste.add(new EtudiantTrad("Marie Dowland", 234, "Japanese"));
		liste.add(new EtudiantTrad("Zang Xianfan", 345, "Arabic"));
		liste.add(new EtudiantTrad("Edgar Livius", 456, "Spanish"));
		liste.add(new EtudiantTrad("Faïna Souabi", 567, "French"));
		liste.add(new EtudiantTrad("Pedro Alcazar", 678, "Chinese"));
		liste.add(new EtudiantTrad("Tchang Tchong-Jen", 789, "Arabic"));
		liste.add(new EtudiantTrad("John Balboa", 890, "Spanish"));
		liste.add(new EtudiantTrad("Allan Thompson", 321, "Japanese"));
		liste.add(new EtudiantTrad("Ramon Bada", 432, "Chinese"));
		liste.add(new EtudiantTrad("Barnabé Boullu", 543, "Chinese"));
		liste.add(new EtudiantTrad("John Baxter", 654, "Arabic"));
		liste.add(new EtudiantTrad("Basil Bazaroff", 765, "Spanish"));
		System.out.println("Longueur de la liste : " + liste.size());

		// création de la map
		TreeMap<String, ArrayList<EtudiantTrad>> langs = new TreeMap<String, ArrayList<EtudiantTrad>>();

		// liste à parcourir
		for (EtudiantTrad etd : liste) {

			String lg = etd.getLangspec(); // récupérer langue
			ArrayList<EtudiantTrad> l = new ArrayList<EtudiantTrad>(); // liste vide

			if (langs.containsKey(lg)) { // si cette langue est déjà dans la Map
				l = langs.get(lg); // on récupère la liste d'élèves déjà présents
			}

			l.add(etd); // on ajoute l'élève
			langs.put(lg, l);
		}

		// tests
		System.out.println(langs);
		System.out.println("Nb de langues : " + langs.size());
		for (EtudiantTrad e : langs.get("Arabic")) {
			System.out.println(e.getName());
		}
		for (EtudiantTrad e : langs.get("Spanish")) {
			System.out.println(e.getNumber());
		}
	}
}
