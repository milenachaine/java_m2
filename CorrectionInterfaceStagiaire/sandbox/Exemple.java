package sandbox;

import java.net.MalformedURLException;
import java.net.URL;

public class Exemple {

	//	public static void main(String[] args) throws MalformedURLException {
	//		URL myURL = new URL("http://www.inalco.fr/");
	//		URL myURL = new URL("bipbop");
	//		System.out.println(myURL);
	//
	//	}

	public static void main(String[] args ) {
		URL myURL;
		try {
			myURL = new URL("http://www.inalco.fr/");
			//myURL = new URL("blabla");
			System.out.println(myURL);
		} catch (MalformedURLException e) {
			System.out.println(":'((((((");
			e.printStackTrace();
		}

	}

}
