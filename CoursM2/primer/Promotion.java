package primer;

import java.util.ArrayList;

public class Promotion {
/*	[P.13 cours Liste] Faire une classe Promotion représentant une promotion d'étudiants ( e.g. des EtudiantErtim)
	d'une année donnée. Une promotion sera identifiée par un nom (String) , une année scolaire
	(Integer) et une liste d'EtudiantErtim. Cette classe devra proposer au moins :
	un constructeur, une méthode pour ajouter un(e) étudiant(e) à la promo, une méthode pour
	récupérer le nom de la promo, une méthode permettant de savoir si un étudiant appartient ou
	non à la promo. Tester.
	*/
	String nom;
	Integer annee;
	ArrayList<EtudiantErTim> etds;
	
	public Promotion(String n, Integer a, ArrayList<EtudiantErTim> e) {
		nom = n;
		annee = a;
		etds = e;
	}
	
	public String getNom() {
		return nom;
	}
}
