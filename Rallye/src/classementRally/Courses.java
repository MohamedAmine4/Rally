package classementRally;

import java.util.ArrayList;
import java.util.Collections;

public class Courses {

	
	protected 
	       String categorie;
	       ArrayList<Voiture> voiture=new ArrayList<>();
		public Courses(String categorie) {
			super();
			this.categorie = categorie;
			
			}
		public String getCategorie() {
			return categorie;
		}
		public ArrayList<Voiture> getVoiture() {
			return voiture;
		}
		
		public void Inscrire(Voiture v) {
			if(categorie=="A" && 0<v.puissance && v.puissance<200)
			   voiture.add(v);
			else if(categorie=="N" && 200<=v.puissance && v.puissance<400)
				   voiture.add(v);
			else if(categorie=="B" && 400<=v.puissance )
				   voiture.add(v);
			else 
				System.out.println("La voiture ne correspond a la categorie de cet course ");
		}
		
		public ArrayList<Voiture> Classement(){
			
			ArrayList<Double> gagnant=new ArrayList<>();//list des temps des voitures
			ArrayList<Voiture> gagnantfinal=new ArrayList<>();//list des voitures qui ont temp minimal vers max

			for(Voiture v:voiture) {
				gagnant.add(v.temp());
			}
			Collections.sort(gagnant);
			for(Double g : gagnant) {
				for(Voiture v : voiture) {
				   if(v.temp()==g)	  
					  gagnantfinal.add(v);
			}
				}
			return gagnantfinal;
		}
		@Override
		public String toString() {
			return "Courses [categorie=" + categorie + ", voiture=" + voiture + "]";
		}
		
		}
	
	

