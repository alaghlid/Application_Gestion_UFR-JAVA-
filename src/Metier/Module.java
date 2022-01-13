package Metier;

import java.io.Serializable;

public class Module implements Serializable{
	private String libell�;
	private Integer coefficient;
	private Integer  nbrHeuresCours;
	private Integer  nbrHeuresTD;
	private Integer  nbrHeuresTP;
	private Professeur enseignent;
	private int semestre;
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	public Module() {
		super();
	}
	public Module(String libell�, Integer coefficient, Integer nbrHeuresCours, Integer nbrHeuresTD, Integer nbrHeuresTP,
			Professeur enseignent) {
		super();
		this.libell� = libell�;
		this.coefficient = coefficient;
		this.nbrHeuresCours = nbrHeuresCours;
		this.nbrHeuresTD = nbrHeuresTD;
		this.nbrHeuresTP = nbrHeuresTP;
		this.enseignent = enseignent;
	}
	public String getlibell�() {
		return libell�;
	}
	public void setlibell�(String libell�) {
		this.libell� = libell�;
	}
	public Integer getCoefficient() {
		return coefficient;
	}
	public void setCoefficient(Integer coefficient) {
		this.coefficient = coefficient;
	}
	public Integer getNbrHeuresCours() {
		return nbrHeuresCours;
	}
	public void setNbrHeuresCours(Integer nbrHeuresCours) {
		this.nbrHeuresCours = nbrHeuresCours;
	}
	public Integer getNbrHeuresTD() {
		return nbrHeuresTD;
	}
	public void setNbrHeuresTD(Integer nbrHeuresTD) {
		this.nbrHeuresTD = nbrHeuresTD;
	}
	public Integer getNbrHeuresTP() {
		return nbrHeuresTP;
	}
	public void setNbrHeuresTP(Integer nbrHeuresTP) {
		this.nbrHeuresTP = nbrHeuresTP;
	}
	public Professeur getEnseignent() {
		return enseignent;
	}
	public void setEnseignent(Professeur enseignent) {
		this.enseignent = enseignent;
	}
	@Override
	public String toString() {
		return "Module [libell�=" + libell� + ", coefficient=" + coefficient + ", nbrHeuresCours=" + nbrHeuresCours
				+ ", nbrHeuresTD=" + nbrHeuresTD + ", nbrHeuresTP=" + nbrHeuresTP + ", enseignent=" + enseignent + "]";
	}
	public void afficher() {
		System.out.println(this.toString());
	}
	
	public double getChargeHoraireModule() {
	return  this.getNbrHeuresCours()*0.5 + this.getNbrHeuresTD() + this.getNbrHeuresTP()*0.75;
	
	}
	public Module getModuleById(String label) {
		Module module = null;
		if (this.libell�==label) {
			return module;
		}else {
			return null;
		}
	}
	

}
