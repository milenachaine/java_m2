package primer;

public class CommentTrouverUnStage {
	
	public static void main(String[] args) {
		
		EtudiantTrad e = new EtudiantTrad("Judd",123,"latin");

		EtudiantIM ebis = new EtudiantIM("Barack",456,1);
	
		EtudiantTrad eter = new EtudiantTrad("Judd",123,"grec");
		// test méthode equals
		if (e.equals(eter)) {
			System.out.println("Ces étudiants sont les mêmes");
		}
		else {
			System.out.println("Ces étudiants sont différents");
		}
		
	}

}
