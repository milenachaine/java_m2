package primer;
/**
 * 
 * représente un stage e.g.
 * par hypothèse un stage a pour propriétés : 
 * un sujet ( chaine de caractères )
 * le fait d'être rémunéré ( booléen ) 
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
