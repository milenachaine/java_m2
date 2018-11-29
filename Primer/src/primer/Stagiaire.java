package primer;

public interface Stagiaire {
	public void trouveStage(String sujet, boolean remunere); //déclaration du stage
	public String sujetDuStage(); //donne sujet du stage
	public boolean remunere(); //true si rémunéré
}
