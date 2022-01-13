package Persistance;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

import Metier.UFR;
import Metier.Formation;
import Metier.Etudiant;
import Metier.Semestre;
import Metier.Module;
import Metier.Professeur;
import Metier.The_Comparator;
import Metier.The_Comparator_Alpha;

public class DaoFormation {
	HashSet<Etudiant> etudiants = null;
	Semestre semestres[]=new Semestre[9];
	Connexion connexion;
	
	public ArrayList<Module> makeModulesArray(String label) {
		
		return null;
	}
	
	public HashMap<String, Formation> getAll(){
		HashMap<String, Formation> formations = new HashMap<String, Formation>();
		Formation formationTemp = new Formation();
		UFR ufr = new UFR();
		ArrayList<Professeur> profs = ufr.getEnseignents();
		ResultSet resultat = null;
		
		try {
			resultat =  this.connexion.getConnexion().createStatement().executeQuery("select * from formation");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			
			
			String nom;
			String respo;
			String description;
			ArrayList<Module> modules ;
			while(resultat.next()){
				
				nom = resultat.getString("xxxxxxxxxxxxxxxxxx");
				respo=resultat.getString("xxxxxxxxxxxxxxxxxxxxxxx");
				description=resultat.getString("xxxxxxxxxxxxxxxxx");
				modules=(ArrayList<Module>) resultat.getObject("xxxxx") ;
				
				formationTemp.setIntitulé(nom);
				formationTemp.setDescription(description);
				formationTemp.setResponsable(profs.get(profs.indexOf(respo)));
				formationTemp.setModules(modules);
				
				formations.put(nom, formationTemp);
			}
			System.out.print(formations.toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return formations;
		
	}
	


	public  double getChargeHoraireFormation() {
		
		double CH=0;
		for(Semestre S: semestres) {
			CH+=S.getChargeHoraireSemestre();
		}
		return CH;
		
	}
	public boolean addEtudiant ( Etudiant etudiant) {
		
		return etudiants.add(etudiant);
	}
	public boolean removeEtudiant ( Etudiant etudiant) {
		
		return etudiants.remove(etudiant);
		
	}
	public Etudiant getEtudiant(Integer numeroEtudiant) {
	     for(Etudiant E:etudiants){
	    	 if(E.getNummerEtudiant()==numeroEtudiant) return E;
	     }
	     return null;
	}

	public  void afficherEtudiantParOrder() {
		
	     TreeSet<Etudiant> set=new TreeSet<Etudiant>(new The_Comparator());
	     set.addAll(etudiants);
	}
	public void afficherEtudiantParOrdreAlpha() {
	     TreeSet<Etudiant> set=new TreeSet<Etudiant>(new The_Comparator_Alpha());
	     set.addAll(etudiants);
	 }
	void afficheEtudiant(String numeroEtudiant) {
		
	 for(Etudiant E:etudiants){
		 E.afficher();
	 }
		
	}

}
