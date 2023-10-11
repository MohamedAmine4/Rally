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
			if(categorie=="N" && 200<=v.puissance && v.puissance<400)
				   voiture.add(v);
			if(categorie=="B" && 400<=v.puissance )
				   voiture.add(v);
			else 
				System.out.println("La voiture ne correspond a la categorie de cet course ");
		}
		
		public ArrayList<Voiture> Classement(){
			
			ArrayList<Double> gagnant=new ArrayList<>();
			ArrayList<Double> gagnanttrier=new ArrayList<>();
			ArrayList<Voiture> gagnantfinal=new ArrayList<>();

			for(Voiture v:voiture) {
				gagnant.add(v.temp());
			}
			for(Double v:gagnant) {
				double min=Collections.min(gagnant);
				gagnanttrier.add(min);
			}
			for(Voiture v : voiture) {
				for(int i=0;i<gagnanttrier.size();i++) {
				if(v.temp()==gagnanttrier.get(i))
					gagnantfinal.add(v);
			}
				}
			return gagnantfinal;
		}
		}
	
	

