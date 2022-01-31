package com.maquina.domain;

public class Refresco {

	//ATRIBUTOS
	private String nombre;
	private double precio;
	private int cantidad;
	
	//CONSTRUCTOR
	public Refresco(String n, double p, int c) {
		this.nombre = n;
		this.precio = p;
		this.cantidad = c;
	}

	//MÉTODOS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public boolean comprar() {
//		boolean result = true;
//		if(cant <= 0 || cant > 1) {
//			System.out.println("No puedes introducir un numero menor o mayor que 1");
//			result = false;
//		}
//		if(cantidad >= cant) {
//			cantidad -= cant;
//			System.out.println("Procesando su pedido...");
//		}else {
//			System.out.println("No hay stock disponible");
//			return false;
//		}
//		return result;
		boolean result = true;
		cantidad--;
		this.getCantidad();
		System.out.println("Procesando compra...");
		return result;
	}
	
	public boolean reponer(int cant) {
		boolean result = true;
		if(cant >=1) {
			this.cantidad += cant;
			System.out.println(cant + " botellas/latas añadidas");
			this.setCantidad(cant);
		}else {
			System.out.println("Tienes que introducir una botella o lata como mínimo");
			result = false;
		}
		return result;
	}
	

	@Override
	public String toString() {
		return "Refresco [nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}

	
	
	
	
	
	
}
