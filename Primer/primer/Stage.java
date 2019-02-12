package primer;

public class Stage {
	
	private String sujet;
	private boolean estpaye;
	
	public Stage(String s, boolean remun) {
		sujet = s;
		estpaye = remun;
	}

	public String getSujet() {
		return sujet;
	}
	
	public boolean isEstpaye() {
		return estpaye;
	}
}
