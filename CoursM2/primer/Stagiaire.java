package primer;
/*
 * Cette interface liste les comportements attendus d'un étudiant
 * qui fera un stage
 */
public interface Stagiaire {
	
	// la déclaration d'un stage se fera par l'appel de cette méthode
	public void trouveStage(String sujet, boolean remunere);
	
	// doit retourner le sujet du stage
	public String sujetDuStage();	
	
	// doit retourner true:false suivant que le stage est rémunéré ou non
	public boolean remunere();		
}