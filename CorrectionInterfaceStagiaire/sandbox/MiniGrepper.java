package sandbox;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class MiniGrepper {
	
	//MiniGrepper est une classe qui permet de savoir si un fichier contient une String donnée
	//un objet MiniGrepper est instancié avec un chemin vers un fichier
	//+ méthode grep qui attend un String et renvoie un boolean en fonction de la présence/absence de la String dans le fichier
	//testée dans IO.java
	
	protected String chemin; //pour l'instant ce champ n'est pas vraiment nécessaire
	protected List<String> lignes;
	
	public MiniGrepper(String c) throws IOException {
		chemin = c;
		lignes = Files.readAllLines(Paths.get(chemin), StandardCharsets.UTF_8);
	}
	
	public boolean grep(String s) {
		boolean yEst = false;
		for (String l : lignes) {
			if ( l.contains(s) ) {
				yEst = true;
				return yEst;
			}
		}
		return yEst;
	}

}
