package classementRally;

public class CoPilot extends Personne{

	public CoPilot(String nom, String prenom, float age, String sang) {
		super(nom, prenom, age, sang);
	}

	@Override
	public String toString() {
		return "CoPilot [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", sang=" + sang + "]";
	}

}
