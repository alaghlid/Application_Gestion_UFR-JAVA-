package Metier;

import java.util.ArrayList;
import java.util.Iterator;

public class UFR {
	private ArrayList<Professeur> enseignents;
	private ArrayList<Module> modules;
	public UFR() {
		super();
		enseignents=new ArrayList<Professeur>(100);
		modules= new ArrayList<Module>(100);
	}
	
	public void afficher() {
		for( int i = 0; i < this.enseignents.size(); i++ ) {
			System.out.println(this.enseignents.get(i).getChargeHoraire());
		}
	}
	
	public void getVacation() {
		double somme = 0;
		for( int i = 0; i < this.enseignents.size(); i++ ) {
			somme = somme + this.enseignents.get(i).getVacations();
		}
		System.out.println(somme);
	}
    public 	Personne RechercheMembre(Personne p) {
    	Iterator<Professeur> itr = enseignents.iterator();
    	 while(itr.hasNext()) {
             Personne personne = (Personne) itr.next();
             if(personne.equals(personne) ) return personne;
             
          }
    	  return null;
          
	}

	public ArrayList<Professeur> getEnseignents() {
		return enseignents;
	}

	public void setEnseignents(ArrayList<Professeur> enseignents) {
		this.enseignents = enseignents;
	}

	public ArrayList<Module> getModules() {
		return modules;
	}

	public void setModules(ArrayList<Module> modules) {
		this.modules = modules;
	}
    

}
