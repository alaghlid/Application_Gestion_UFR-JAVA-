package Metier;

import java.util.Arrays;

public class Semestre {

	
	 int num�ro;
	 
	 Module modules[]=new Module[6];
	 
	 
	public Semestre(int num�ro) {
		this.num�ro = num�ro;
	}


	public Semestre() {
		
	}


	public int getNum�ro() {
		return num�ro;
	}


	public void setNum�ro(int num�ro) {
		this.num�ro = num�ro;
	}


	public Module getModule(int i) {
		return modules[i];
	}


	public void setModule(Module module,int i) {
		modules[i]=module;
	}
	public void afficher() {
		
		for(Module M: modules) {
			System.out.println(M.toString());
		}
	
	}
	@Override
	public String toString() {
		return "Semestre [num�ro=" + num�ro + ", modules=" + Arrays.toString(modules) + "]";
	}


	public double getChargeHoraireSemestre() {
		double CH=0;
		for(Module M: modules) {
			CH+=M.getChargeHoraireModule();
		}
		return CH;
	}


}
