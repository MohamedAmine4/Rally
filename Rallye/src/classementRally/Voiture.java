package classementRally;

import java.util.ArrayList;

public class Voiture extends Vehicules {
    
	ArrayList<Courses> listCourse=new ArrayList<>();
	public Voiture(double puissance, String modele,Pilot pilot,CoPilot copilot) {
		super(puissance, modele, pilot, copilot);
		
	}
	
	public void Inscrire(Courses c) {
		listCourse.add(c);
	}

	public double temp() {
		return getPuissance()+getPilot().getAge()+(getCopilot().getAge());
	}
	
	
}
