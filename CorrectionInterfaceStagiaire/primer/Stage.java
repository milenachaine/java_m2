package primer;
/**
 * 
 * repr�sente un stage e.g.
 * par hypoth�se un stage a pour propri�t�s : 
 * un sujet ( chaine de caract�res )
 * le fait d'�tre r�mun�r� ( bool�en ) 
 */
public class Stage {

	private String sujetstage;
	private boolean remunere;
	
	public Stage(String sujetstage, boolean remunere) {
		this.sujetstage = sujetstage;
		this.remunere = remunere;
	}
	
	public String getSujetstage() {
		return sujetstage;
	}

	public boolean isRemunere() {
		return remunere;
	}

	
}
