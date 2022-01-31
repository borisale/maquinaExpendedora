package com.maquina.domain;

public class Maquina {

	//ATRIBUTOS
	private Refresco[] refrescos;
	private int numberOfRefrescos;
	
	
	//CONSTRUCTORES
	public Maquina() {
		refrescos = new Refresco[10];
		numberOfRefrescos = 0;
	}
	
	
	//MÉTODOS
	public void addRefresco(String n, double p, int c) {
		int i = numberOfRefrescos++;
		refrescos[i] = new Refresco(n, p, c);
	}
	
	public int getNumOfRefrescos() {
		return numberOfRefrescos;
	}
	
	public Refresco getRefresco(int index) {
		return refrescos[index];
	}
	
	
	

}//FIN CLASE