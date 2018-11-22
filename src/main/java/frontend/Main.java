package frontend;

import com.feeleurope.formation.*;

public class Main {

	public static void main(String[] args) {

		Personne p = new Personne();

		p.setNom(args[0]);
		p.setPrenom(args[1]);

		System.out.println("Hello : " + p.getNom() + " " + p.getPrenom());
	}

}
