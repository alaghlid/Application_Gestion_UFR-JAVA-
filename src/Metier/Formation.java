package Metier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Formation {
	
	
  
	 String intitul�;
	 Professeur responsable;
	 String Description;
	 Semestre semestres[]=new Semestre[9];
	 Set<Etudiant> etudiants;
	 ArrayList<Module> modules;

	 public Formation() {
		 
		responsable=new Professeur();
		intitul�=new String();
		etudiants=new HashSet<Etudiant>();
		modules=new ArrayList<Module>();
		
	}
	public Formation(String intitul�, Professeur responsable, String desc, ArrayList<Module> moduls) {
			this.intitul� = intitul�;
			this.responsable = responsable;
			this.modules=moduls;
			etudiants=new HashSet<Etudiant>();
	}
		
	 



	public String getIntitul�() {
		return intitul�;
	}
	public void setIntitul�(String intitul�) {
		this.intitul� = intitul�;
	}
	public Professeur getResponsable() {
		return responsable;
	}
	public void setResponsable(Professeur responsable) {
		this.responsable = responsable;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Semestre[] getSemestres() {
		return semestres;
	}
	public void setSemestres(Semestre[] semestres) {
		this.semestres = semestres;
	}
	public Set<Etudiant> getEtudiants() {
		return etudiants;
	}
	public void setEtudiants(Set<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}
	public ArrayList<Module> getModules() {
		return modules;
	}
	public void setModules(ArrayList<Module> modules) {
		this.modules = modules;
	}
	
	
	
	@Override
	public String toString() {
		return "Formation [intitul�=" + intitul� + ", responsable=" + responsable + ", Description=" + Description
				+ ", semestres=" + Arrays.toString(semestres) + ", etudiants=" + etudiants + ", modules=" + modules
				+ "]";
	}
    

	


}
