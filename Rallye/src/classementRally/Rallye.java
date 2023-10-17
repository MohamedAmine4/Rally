package classementRally;

import java.util.ArrayList;

public class Rallye {

	public static void main(String[] args) {
		Pilot pilot1=new Pilot("Amine","bouss",29,Personne.sangO1);
		CoPilot copilot1=new CoPilot("saad","tayeb",20,Personne.sangO2);
		Pilot pilot2=new Pilot("samir","jef",1,Personne.sangO1);
		CoPilot copilot2=new CoPilot("hanane","bezos",2,Personne.sangO2);
		Pilot pilot3=new Pilot("youssef","smart",60,Personne.sangO1);
		CoPilot copilot3=new CoPilot("aziz","agha",18,Personne.sangO2);
		ArrayList<Courses> listCourse=new ArrayList<>();
		Voiture voiture1=new Voiture(240,"panamera",pilot1,copilot1);
		Voiture voiture2=new Voiture(240,"panamera",pilot2,copilot2);
		Voiture voiture3=new Voiture(240,"panamera",pilot3,copilot3);
		//comment connait les voiture dans une categorie
		
		Courses course1=new Courses("N");
		Courses course2=new Courses("A");
		Courses course3=new Courses("G");
//		course1 de categorie N puissance >200 et <400
		course1.Inscrire(voiture1);
		course1.Inscrire(voiture2);
		course1.Inscrire(voiture3);
//		System.out.print(course1.toString());
		System.out.print(course1.Classement());
		
		
		
		

	}

}
