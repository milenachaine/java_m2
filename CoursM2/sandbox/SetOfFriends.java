package sandbox;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetOfFriends {

	public static void main(String[] args) {
		
		String transition = "---------------------";
		System.out.println(transition + "HashSet" + transition);
		
		HashSet<String> s = new HashSet<String>();
		s.add("rubber soul");
		s.add("revolver");
		s.add("sgt. pepper's lonely hearts club band");
		s.add("the beatles");
		s.add("abbey road");
		
		//ajouter un doublon
		s.add("revolver");
		
		//parcourir le HashSet
		for (String album : s) {
			System.out.println(album); //parcours aléatoire ; le doublon n'apparaît pas
		}
		
		//appliquer méthode toString au Set
		System.out.println(s.toString());
		
		//tester si une String appartient au HashSet
		String test = "rubber soul";
		boolean yEst = false;
		for (String album : s) {
			if (album.equals(test)) {
				yEst = true;
			}
		}
		System.out.println(yEst);
		
		System.out.println(transition + "LinkedHashSet" + transition);

		//bis mais avec LinkedHashSet
		LinkedHashSet<String> s1 = new LinkedHashSet<String>();
		s1.add("rubber soul");
		s1.add("revolver");
		s1.add("sgt. pepper's lonely hearts club band");
		s1.add("the beatles");
		s1.add("abbey road");

		//ajouter un doublon
		s1.add("revolver");
		
		//parcourir le LinkedHashSet
		for (String album : s1) {
			System.out.println(album); //parcours dans l'ordre d'ajout
		}
		
		System.out.println(transition + "TreeSet" + transition);

		//ter avec TreeSet
		TreeSet<String> s11 = new TreeSet<String>();
		s11.add("rubber soul");
		s11.add("revolver");
		s11.add("sgt. pepper's lonely hearts club band");
		s11.add("the beatles");
		s11.add("abbey road");
		
		//ajouter un doublon
		s11.add("revolver");
		
		//parcourir le TreeSet
		for (String album : s11) {
			System.out.println(album); //parcours dans l'ordre alphabétique
		}
		
		System.out.println(transition + "Comparaison de sets" + transition);

		//travail de comparaison de sets
		LinkedHashSet<String> prenoms1 = new LinkedHashSet<String>();
		LinkedHashSet<String> prenoms2 = new LinkedHashSet<String>();
		prenoms1.add("Jenna"); 
		prenoms1.add("Luc"); 
		prenoms1.add("Judd");
		prenoms1.add("Marie");
		prenoms1.add("Lena");
		prenoms1.add("Claire");
		
		prenoms2.add("Judd");
		prenoms2.add("Marie");
		prenoms2.add("Lena");
		prenoms2.add("Jimi");
		prenoms2.add("Jimi");
		prenoms2.add("Yann");
		prenoms2.add("Helen");
		
		System.out.println(prenoms1);
		System.out.println(prenoms2);
		System.out.println(transition + "Intersection" + transition);
		
		//intersection (Judd, Marie, Lena)
		//créer un nouveau Set copiant prenoms1 pcq retainAll va le modifier
		LinkedHashSet<String> intersection = new LinkedHashSet<String>(prenoms1);
		intersection.retainAll(prenoms2);
		System.out.println(intersection);
		
		System.out.println(transition + "P1 - P2" + transition);

		//prenoms1 mais pas prenoms2 (Claire, Jenna, Luc)
		//càd P1 - l'intersection
		LinkedHashSet<String> p1bis = new LinkedHashSet<String>(prenoms1);
		p1bis.removeAll(intersection);
		System.out.println(p1bis);
		
		System.out.println(transition + "Union" + transition);

		//p1 ou p2
		LinkedHashSet<String> union = new LinkedHashSet<String>(prenoms1);
		union.addAll(prenoms2);
		System.out.println(union);
		
		System.out.println(transition + "Delta" + transition);
		//facultatif : union - intersection (soit dans p1 soit dans p2 mais pas dans les 2)
		LinkedHashSet<String> delta = new LinkedHashSet<String>(union);
		delta.removeAll(intersection);
		System.out.println(delta);
	}

}
