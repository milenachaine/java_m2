package exo;

import java.io.IOException;
import java.util.List;

public class Test {

	public static void main(String[] args) throws IOException {
		
		// classe pour tester les autres classes du package
		String transition = "--------------------";
		
		System.out.println(transition + "TaggedWord" + transition);
		TaggedWord tw = new TaggedWord("dormait" , "VRB" );
		System.out.println(tw.getPOS());
		System.out.println(tw.getWord());
		System.out.println(tw.toString());
		
		System.out.println(transition + "TaggedText" + transition);
		TaggedText duchesne = new TaggedText("/Users/milena/Documents/Travail/M2TAL/java/pereduchene.tagged");	
		System.out.println(duchesne.getWords(3, 6));
		System.out.println(duchesne.getTags(3, 6, "/"));
		System.out.println(duchesne.size());
		
		System.out.println(transition + "PMS" + transition);
		PMS patron = new PMS("DET", "NOM", "ADJ");
		System.out.println(patron.toString());
		System.out.println(patron.size());
		
		System.out.println(transition + "Test" + transition);
		PMS pms = new PMS("DET:ART", "ADJ", "NOM");

		for (int i = 1; i < duchesne.size() -3; i++) {
			String fenetre = duchesne.getTags(i, i+3, "/");
			if (fenetre.equals(pms.toString())) {
				System.out.println(duchesne.getWords(i, i+3));
			}
		}
		
		System.out.println(transition + "PMS variables" + transition);
		PMS deux = new PMS("ADJ", "NOM");
		System.out.println(deux.size());
		System.out.println(deux.toString());
		
		for (int i = 1; i < duchesne.size() - deux.size(); i++) {
			String fenetre = duchesne.getTags(i, i + deux.size(), "/");
			if (fenetre.equals(deux.toString())) {
				System.out.println(duchesne.getWords(i, i+ deux.size()));
			}
		}
		
		PMS quatre = new PMS("PRP", "NOM", "PRP", "NOM");
		System.out.println(quatre.size());
		System.out.println(quatre.toString());
		
		for (int i = 1; i < duchesne.size() - quatre.size(); i++) {
			String fenetre = duchesne.getTags(i, i + quatre.size(), "/");
			if (fenetre.equals(quatre.toString())) {
				System.out.println(duchesne.getWords(i, i+ quatre.size()));
			}
		}
		
		System.out.println(transition + "PMS mixtes" + transition);
		List<TaggedWord> duchesne_sliced = duchesne.slice(3, 6);
		System.out.println(duchesne_sliced);
		System.out.println(duchesne_sliced.get(1).getPOS());
		PMS test1 = new PMS("PRP:det", "%père%", "NOM");
		PMS test2 = new PMS("PRP:det", "ADJ", "NOM");
		PMS test3 = new PMS("PRP:det", "NOM", "ADJ");
		System.out.println(test1.matches(duchesne_sliced));
		System.out.println(test2.matches(duchesne_sliced));
		System.out.println(test3.matches(duchesne_sliced));
		
		System.out.println(transition + "Tests sur corpus entier" + transition);
		PMS p = new PMS("DET:ART", "%grande%", "NOM");
		
		for ( int i = 0; i < duchesne.size()- (p.size() -1); i++ ) {
			List<TaggedWord> lt = duchesne.slice(i, i + p.size());
			if (p.matches(lt)) {
				System.out.println(lt.toString());
			}
		}
		
		PMS p2 = new PMS("%jeune%", "NOM");
		for ( int i = 0; i < duchesne.size()- (p.size() -1); i++ ) {
			List<TaggedWord> lt = duchesne.slice(i, i + p2.size());
			if (p2.matches(lt)) {
				System.out.println(lt.toString());
			}
		}
		
		PMS p3 = new PMS("%plus%", "ADJ");
		for ( int i = 0; i < duchesne.size()- (p.size() -1); i++ ) {
			List<TaggedWord> lt = duchesne.slice(i, i + p3.size());
			if (p3.matches(lt)) {
				System.out.println(lt.toString());
			}
		}

	}

}
