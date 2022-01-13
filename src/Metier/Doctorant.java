package Metier;

import java.util.ArrayList;
import java.util.HashMap;

public class Doctorant extends Etudiant implements Enseignent {
	private String SujetThese;
	private Professeur encadrant[]; 
	public  HashMap<String, ArrayList<Module> > chargeHoraire;
	private String DateInscription ;
	
	

	public Doctorant() {
		super();
		this.encadrant = new Professeur[2];
		chargeHoraire = new HashMap<String, ArrayList<Module> > ();
		
	}
	public void afficher() {
		System.out.println(this.toString());
	}
	
	public String getDateInscription() {
		return DateInscription;
	}

	public void setDateInscription(String dateInscription) {
		DateInscription = dateInscription;
	}

	public void setChargeHoraire(HashMap<String, ArrayList<Module>> chargeHoraire) {
		this.chargeHoraire = chargeHoraire;
	}

	public String getSujetThese() {
		return SujetThese;
	}

	public void setSujetThese(String sujetThese) {
		SujetThese = sujetThese;
	}


	public Professeur getProfesseur(int i) {
		return this.encadrant[i];
	}
	public void setProfesseur(Professeur professeur, int i) {
		this.encadrant[i] = professeur;
	}
	@Override
	public Double getChargeHoraire() {
		double charge = 0;
		ArrayList<ArrayList<Module>> list = new ArrayList<>( this.chargeHoraire.values());
		for(int i = 0; i < list.size(); i ++) {
			for( int j = 0; j < list.get(i).size(); j++) {
				charge = charge + list.get(i).get(j).getChargeHoraireModule();
			}
		}
		return charge;
	}
	public double getChargeAnuelle(String année) {
		if(Integer.parseInt(année)>Integer.parseInt(DateInscription)) {
		double charge = 0;
		for( int j = 0; j < this.chargeHoraire.get(année).size(); j ++) {
				charge = charge + this.chargeHoraire.get(année).get(j).getChargeHoraireModule();
			}
		return charge;
		}
		else {
			return 0;
		}
	}
	
	@Override
	public Double getVacations() {
		double somme = 0;
		int charge=32;
		if(this.getChargeHoraire() > charge ) {
			somme = 32*400*0.66 + (this.getChargeHoraire() - charge ) *600*0.83;
		}
		else {
			somme = this.getChargeHoraire()*400*0.66;
		}
		return somme ;
	}
	public double getVacationsAnulle(String année) {
		if(Integer.parseInt(année)>Integer.parseInt(DateInscription)) {
		double somme = 0;
		int charge=32 ;
		
		if(this.getChargeAnuelle(année) > charge ) {
			somme = 32*400*0.66 + (this.getChargeHoraire() - charge ) *600*0.83;
		}
		else {
			somme = this.getChargeHoraire()*400*0.66;
		}
		return somme ;
		}
		else return 0;

	}
	public boolean addChargeHoraire(String Date, ArrayList<Module> charge) {
		if(this.chargeHoraire.containsKey(Date)) return false;
		this.chargeHoraire.put(Date, charge);
		return true;
	}
	public boolean updateChargeHoraire(String date, ArrayList<Module> charge) {
		if(!this.chargeHoraire.containsKey(date)) {
			return false;
		}
		this.chargeHoraire.put(date, charge);
		return true;
	}

}
