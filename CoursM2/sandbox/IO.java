package sandbox;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class IO {

	public static void main(String[] args) throws UnsupportedEncodingException, IOException {

		//exos slide IO
		String tosave1 = "Hello";
		String tosave2 = "world!";
		String tosave = tosave1 + "\n" + tosave2;

		String chemin = "/Users/milena/Documents/Travail/M2TAL/testjava.txt";
		Path p = Paths.get(chemin);
		if (Files.exists(p)) {
			Files.delete(p);
		}
		Files.write(Paths.get(chemin), tosave.getBytes("UTF-8"), StandardOpenOption.CREATE);

		List<String> lines = Files.readAllLines(Paths.get(chemin), StandardCharsets.UTF_8);
		String fichier = lines.toString();
		System.out.println(fichier);
		for (String l : lines) {
			System.out.println("lines --> "+l);
		}

		//exo père Duchesne
		String duchene = "/Users/milena/Documents/Travail/M2TAL/java/pereduchene.tagged";
		List<String> lignes = Files.readAllLines(Paths.get(duchene), StandardCharsets.UTF_8);

		for (String l : lignes) {
			String[] tab = l.split("\t");
			System.out.println("champ1= " + tab[0] + "\tchamp2= " + tab[1] + "\tchamp3= " + tab[2]);
		}

		//test MiniGrepper
		MiniGrepper fg = new MiniGrepper("/Users/milena/Documents/Travail/M2TAL/java/pereduchene.tagged");
		boolean test1 = fg.grep("ADJ");
		System.out.println(test1); //doit renvoyer true
		boolean test2 = fg.grep("DHTRFJGYKHUIKUJT");
		System.out.println(test2); //doit renvoyer false

		//travail sur recettes.zip
		//parcours répertoire
		String rep = "/Users/milena/Documents/Travail/M2TAL/java/recettes-utf-8";
		Path p2 = FileSystems.getDefault().getPath(rep);
		DirectoryStream<Path> stream = Files.newDirectoryStream(p2, "*");

		//compteurs
		int cpt = 0; //compteur général
		int cpt_choc = 0; //compteur requête

		for (Path path : stream) {
			Path absolu = path.toAbsolutePath(); //chemin absolu
			MiniGrepper recettes = new MiniGrepper(absolu.toString());

			if (recettes.grep("chocolat")) {
				System.out.println(path.getFileName()); //imprime le nom du fichier
				List<String> f = Files.readAllLines(Paths.get(absolu.toString()), StandardCharsets.UTF_8); //lit le fichier

				for (String l : f) {
					System.out.println(l); //imprime les lignes du fichier
				}

				cpt_choc = cpt_choc +1;
			}
			//code pour supprimer tous les fichiers qui ne contiennent pas 'chocolat'
			//à laisser en commentaire
			//			else {
			//					Files.delete(absolu);
			//			}
			cpt = cpt+1;
		}
		stream.close();
		System.out.println(cpt + " fichiers"); //1770 fichiers
		System.out.println(cpt_choc + " fichiers contenant le terme \'chocolat\'"); //84

	}

}
