package sandbox;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapOfFriends {

	public static void main(String[] args) {
		
		String transition = "---------------------";
		
		System.out.println(transition + "HashMap" + transition);

		HashMap<String, Integer> m = new HashMap<String, Integer>();
		m.put("Zoe", 26);
		m.put("Claire", 24);
		m.put("Faïna", 22);
		m.put("Jeanne", 29);
		m.put("Anne", 28);
		
		//appliquer la méthode toString sur la Map
		System.out.println(m.toString());
		
		//1. KeySet : parcourir via les clés dans un Set
		Set<String> prenoms = m.keySet();
		for (String prenom : prenoms) {
			System.out.println("Prénom : " + prenom + " / Âge : " + m.get(prenom));
		}
		
		System.out.println(transition);

		//2. EntrySet : créer un Set d'entries pour pouvoir parcourir la Map par entrées
		Set<Entry<String,Integer>> assocs = m.entrySet();
		
		for (Entry<String, Integer> entry : assocs) {
			System.out.println("Prénom : " + entry.getKey() + " / Âge : " + entry.getValue());
		}
		
		System.out.println(transition);

		//tester si une clé appartient à la map
		String test = "Claire";
		if (m.containsKey(test)) {
			System.out.println("clé présente, valeur : " + m.get(test));
		}
		else {
			System.out.println("clé non présente");
		}
		
		System.out.println(transition);

		//afficher le nombre d'éléments de la map
		System.out.println(m.size() + " clés dans la map");
		
		//retirer un élément de la map
		m.remove(test);
		System.out.println(m.toString());
		
		System.out.println(transition + "LinkedHashMap" + transition);

		//bis avec LinkedHashMap
		LinkedHashMap<String, Integer> m2 = new LinkedHashMap<String, Integer>();
		m2.put("Zoe", 26);
		m2.put("Claire", 24);
		m2.put("Faïna", 22);
		m2.put("Jeanne", 29);
		m2.put("Anne", 28);
		
		//appliquer la méthode toString sur la Map
		System.out.println(m2.toString());
		
		//parcourir via les clés dans un Set (RENVOI DANS ORDRE D'AJOUT)
		Set<String> prenoms2 = m2.keySet();
		for (String prenom : prenoms2) {
			System.out.println("Prénom : " + prenom + " / Âge : " + m2.get(prenom));
		}
		
		System.out.println(transition + "TreeMap" + transition);
		
		//ter avec TreeMap
		TreeMap<String, Integer> m21 = new TreeMap<String, Integer>();
		m21.put("Zoe", 26);
		m21.put("Claire", 24);
		m21.put("Faïna", 22);
		m21.put("Jeanne", 29);
		m21.put("Anne", 28);
		
		//appliquer la méthode toString sur la Map
		System.out.println(m21.toString());
		
		//parcourir via les clés dans un Set (RENVOI DANS ORDRE ALPHAB)
		Set<String> prenoms21 = m21.keySet();
		for (String prenom : prenoms21) {
			System.out.println("Prénom : " + prenom + " / Âge : " + m21.get(prenom));
		}
		
		System.out.println(transition);
		
		//exercice synthèse 1 : pour un mot, afficher ses lettres et leur fréquence soit dans leur ordre d'apparition dans le mot soit dans leur ordre de fréquence
		
		String mot = "linguistique";
		LinkedHashMap<String, Integer> ordre_mot = new LinkedHashMap<String, Integer>();
		
		//utiliser charAt plutôt!
		for (String lettre : mot.split("")) {
			if (ordre_mot.containsKey(lettre)) {

			}
			
			else {
				
			}
		}
	}

}
