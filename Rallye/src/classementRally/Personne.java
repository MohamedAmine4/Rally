package classementRally;

public abstract class Personne {
  public 
        String nom,prenom;
        float age;
        String sang;
        final static String sangO1="O-"; 
        final static String sangO2="O-";
        final static String sangA1="A-";
        final static String sangA2="A+";
        final static String sangB1="B-";
        final static String sangB2="B+";
        final static String sangAB1="AB-";
        final static String sangAB2="AB+";
		public Personne(String nom, String prenom, float age, String sang) {
			super();
			this.nom = nom;
			this.prenom = prenom;
			this.age = age;
			this.sang = sang;
		}
		public float getAge() {
			return age;
		}
		
        
        
}
