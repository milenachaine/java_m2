package exo;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TaggedText {
	
	protected ArrayList<TaggedWord> taggedtext;
	protected String chemin;
	protected ArrayList<String> liste_mots;
	protected String tags;
	
	public TaggedText(String c) throws IOException {
		
		chemin = c;
		taggedtext = new ArrayList<TaggedWord>();
		
		List<String> lignes = Files.readAllLines(Paths.get(chemin), StandardCharsets.UTF_8);
		
		for (String l : lignes) {
			String[] tab = l.split("\t");
			TaggedWord tw = new TaggedWord(tab[0], tab[1]);
			taggedtext.add(tw);
		}
		
		System.out.println("Test constructeur : " + taggedtext.size() + " éléments\nélément 1224 = " + taggedtext.get(1224).toString() + "\ndernier élément = " + taggedtext.get(taggedtext.size() - 1).toString());
		
	}
	
	public ArrayList<String> getWords(int from, int to) {
		
		liste_mots = new ArrayList<String>();
		//tester les bornes avec un if + prévoir une exception appropriée
		for (TaggedWord tw : taggedtext.subList(from, to)) {
			liste_mots.add(tw.getWord());
		}
		
		return liste_mots;
	}
	
	public String getTags(int from, int to, String sep) {
		
		tags = "";
		
		for (TaggedWord tw : taggedtext.subList(from, to)) {
			
			if (! tags.isEmpty()) {
				tags = tags.concat(sep);
			}
			tags = tags.concat(tw.getPOS());
		}
		
		return tags;
	}
	
	public List<TaggedWord> slice(int n1, int n2) {
		return taggedtext.subList(n1, n2);
	}
	
	public int size() {
		return taggedtext.size();
	}

	
}
