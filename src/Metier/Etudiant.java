package Metier;
import java.util.ArrayList;

public class Etudiant extends Personne {
	private Integer  nummerEtudiant;
	private ArrayList<UniteEnseignement> modules;

	public Etudiant() {
		super();
		modules=new ArrayList<>();
	}
	public Etudiant(String nom, Integer nummerEtudiant, String email) {
		super(nom, email);
		this.nummerEtudiant = nummerEtudiant;
		modules=new ArrayList<>();
		
	}
	
	public Integer getNummerEtudiant() {
		return nummerEtudiant;
	}
	public void setNummerEtudiant(Integer nummerEtudiant) {
		this.nummerEtudiant = nummerEtudiant;
	}
	
	@Override
	public String toString() {
		return "Etudiant [nom=" + this.getNom() + ", nummerEtudiant=" + nummerEtudiant + ", email=" +
	this.getEmail() + "]";
	}
	
	public void afficher() {
		System.out.println(this.toString());
	}
	public  boolean addModule(Module module) {
		UniteEnseignement U=new UniteEnseignement();
		int semestre=module.getSemestre();
		if(semestre>0) semestre--;
		
		for(int i=0;i<this.modules.size();i++) {
			if(modules.get(i).getModule().getSemestre()==semestre) {
				if(!modules.get(i).isValide()) {
					return false;
				}
			}
		}
		U.setModule(module);
		modules.add(U);
		return true;
	}

}
