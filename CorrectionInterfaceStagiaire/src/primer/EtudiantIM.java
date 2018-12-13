package primer;
/**
 * modélise un étudiant IM
 * @author milena
 *
 */
public class EtudiantIM extends EtudiantErTim implements Stagiaire {

	private int pythonskill;// le niveau python de l'�tudiant
	private Stage stage;   //  les caract�ristiques de son stage						// de l'�tudiant
	
	public EtudiantIM( String n, int num,int ps) {
		super(n, num);
		setPythonskill(ps);
		stage = null;
	}

	/**
	 * les 3 méthodes ci dessous imposées par le fait
	 * que cette classe implémente l'interface Stagiaire
	 */
	
	@Override
	public void trouveStage(String sujet, boolean remunere) {
		stage = new Stage(sujet, remunere);
	}

	@Override
	public String sujetDuStage() {
		return stage.getSujetstage();
	}

	@Override
	public boolean remunere() {
		return stage.isRemunere();
	}

	public int getPythonskill() {
		return pythonskill;
	}

	public void setPythonskill(int pythonskill) {
		this.pythonskill = pythonskill;
	}
	
}