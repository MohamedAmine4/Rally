package classementRally;

public class Pilot extends Personne {

	public Pilot(String nom, String prenom, float age, String sang) {
		super(nom, prenom, age, sang);
		
	}

	@Override
	public String toString() {
		return "Pilot [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", sang=" + sang + "]";
	}

}
