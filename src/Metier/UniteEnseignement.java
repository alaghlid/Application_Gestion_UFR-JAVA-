package Metier;
public class UniteEnseignement {
	
	private Module module;
	private  String année;
	private  Double note;
	
	public UniteEnseignement(Module module, String année, Double note) {
		super();
		this.module = module;
		this.année = année;
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
	public String getAnnée() {
		return année;
	}
	public void setAnnée(String année) {
		this.année = année;
	}
	public Double getNote() {
		return note;
	}
	public void setNote(Double note) {
		this.note = note;
	}


}
