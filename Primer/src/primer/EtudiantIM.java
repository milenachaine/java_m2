package primer;

public class EtudiantIM extends EtudiantErTim implements Stagiaire { //définit classe mère
	
	int pythonskill;
	Stage stage;
	
	public EtudiantIM(String n, int num, int ps) {
		super(n, num); //appelle constructeur classe mère
		pythonskill = ps;
		this.stage = null;
	}
	
	@Override
	public int nombreHeuresDeCours() {		
		return 120/pythonskill;		
	}
	
	@Override
	public String typeEtudiant() {
		return "IM";
	}
	
	@Override
	public void trouveStage(String sujet, boolean remunere) { //déclare que l'étudiant a trouvé un stage
		stage = new Stage(sujet, remunere);	
	}

	@Override
	public String sujetDuStage() {
		return stage.getSujet();
	}

	@Override
	public boolean remunere() {
		return stage.isEstpaye();
	}
	
}
