package Metier;

import java.util.Arrays;

public class Semestre {

	
	 int numéro;
	 
	 Module modules[]=new Module[6];
	 
	 
	public Semestre(int numéro) {
		this.numéro = numéro;
	}


	public Semestre() {
		
	}


	public int getNuméro() {
		return numéro;
	}


	public void setNuméro(int numéro) {
		this.numéro = numéro;
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
		return "Semestre [numéro=" + numéro + ", modules=" + Arrays.toString(modules) + "]";
	}


	public double getChargeHoraireSemestre() {
		double CH=0;
		for(Module M: modules) {
			CH+=M.getChargeHoraireModule();
		}
		return CH;
	}


}
