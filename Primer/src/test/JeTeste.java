package test;
import primer.EtudiantErTim; //importer primer
import primer.EtudiantIM;
import primer.EtudiantTrad;

public class JeTeste {

	public static void main(String[] args) {
				
		//EtudiantErTim etudiant; si on écrit sur deux lignes
		EtudiantErTim etudiant = new EtudiantTrad ( "Jack" , 12345, "roumain"); //instancier une classe pour créer un objet	
		EtudiantErTim etudiant2 = new EtudiantIM ( "Anne", 58485, 1); //un EtudiantIM est un EtudiantErTim, le contraire est faux
		EtudiantTrad etudiant3 = new EtudiantTrad ("John", 4869866, "anglais");
		EtudiantIM etudiant4 = new EtudiantIM ("Jill", 594579, 4);
		EtudiantErTim ref = new EtudiantIM("Jim", 344, 3); //faire ref. pour voir méthodes disponibles
		ref.print();
		etudiant4.trouveStage("un mystère :(", true); // ne fonctionne pas avec etudiant2 pcq etudiant2 est EtudiantErTim
		System.out.println("Mon sujet de stage est " + etudiant4.sujetDuStage());
//		System.out.println("Nom : " + etudiant4.getName());
//		System.out.println("Langue spé : " + etudiant4.getLangspec());
//		
//		System.out.println(etudiant2.toString()); //redéfinir méthode ToString
		
		etudiant.print();
		etudiant2.print();
		etudiant3.print();
		etudiant4.print();
	}

}
