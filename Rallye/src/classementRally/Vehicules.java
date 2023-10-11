package classementRally;

public abstract class Vehicules {

	protected 
	        double puissance;
	        String modele;
	        Pilot pilot;
	        CoPilot copilot;

	

	public Vehicules(double puissance, String modele, Pilot pilot, CoPilot copilot) {
				super();
				this.puissance = puissance;
				this.modele = modele;
				this.pilot = pilot;
				this.copilot = copilot;
			}

	public double getPuissance() {
		return puissance;
	}

	public String getModele() {
		return modele;
	}

	public Pilot getPilot() {
		return pilot;
	}

	public CoPilot getCopilot() {
		return copilot;
	}
	     
	
}
