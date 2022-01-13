package Metier;
public class UniteEnseignement {
	
	private Module module;
	private  String ann�e;
	private  Double note;
	
	public UniteEnseignement(Module module, String ann�e, Double note) {
		super();
		this.module = module;
		this.ann�e = ann�e;
		this.note = note;
	}
	
	public UniteEnseignement() {
		// TODO Auto-generated constructor stub
		super();
		
		}
	
	public boolean isValide() {
		
		if(module.getSemestre()<=4) {
			if(note>10) return true;
			else return false;
		}
		else {
			if(note>12) return true;
			else return false;
		}
		
	}
	
	
	
	
	public Module getModule() {
		return module;
	}
	public void setModule(Module module) {
		this.module = module;
	}
	public String getAnn�e() {
		return ann�e;
	}
	public void setAnn�e(String ann�e) {
		this.ann�e = ann�e;
	}
	public Double getNote() {
		return note;
	}
	public void setNote(Double note) {
		this.note = note;
	}


}
