package test;
import primer.Binome;
import primer.EtudiantErTim; //importer primer
import primer.EtudiantIM;
import primer.EtudiantTrad;

public class JeTeste {

	public static void main(String[] args) {

		EtudiantIM e1 = new EtudiantIM("Yolanda Forbes", 9876,3);
		EtudiantIM e2 = new EtudiantIM("Rodrigo Valdes", 9877,1);
		Binome bin = new Binome(e1,e2, "Salton Vector Model");
		Integer noteObtenue = 14;
		bin.setNote(noteObtenue);
		bin.print();

		EtudiantErTim[] promo = new EtudiantErTim[4];
		promo[0] = new EtudiantTrad ( "Jack" , 12345, "roumain");
		promo[1] = new EtudiantIM ("Jill", 594579, 4);
		promo[2] = new EtudiantTrad ("John", 57456844, "estonien");
		promo[3] = new EtudiantIM ("Jane", 35589567, 2);

		for (int i = 0; i < promo.length; i++) {
			EtudiantErTim we = promo[i];
			if ( we instanceof EtudiantIM ) {
				EtudiantIM im = (EtudiantIM)we;
				System.out.println(im.getPythonskill());
			}
			else {
				EtudiantTrad trad = (EtudiantTrad)we;
				System.out.println(trad.getLangspec());
			}
		}
	}
}
