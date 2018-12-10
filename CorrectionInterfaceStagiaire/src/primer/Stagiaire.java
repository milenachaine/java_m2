package primer;
/*
 * Cette interface liste les comportements attendus d'un �tudiant
 * qui fera un stage
 */
public interface Stagiaire {
	
	// la d�claration d'un stage se fera par l'appel de cette m�thode
	public void trouveStage(String sujet, boolean remunere);
	
	// doit retourner le sujet du stage
	public String sujetDuStage();	
	
	// doit retourner true:false suivant que le stage est r�mun�r� ou non
	public boolean remunere();		
}