package com.maquina.domain;

import java.util.Locale;
import java.util.Scanner;

public class TestMaquina {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		Maquina bebida = new Maquina();
		Refresco refresco;
		double recaudacion = 0.00;
		
		bebida.addRefresco("Fanta", 1.90, 1);
		bebida.addRefresco("RedBull", 2.00, 2);
		bebida.addRefresco("CocaCola", 1.90, 3);
		bebida.addRefresco("Kas", 1.80, 1);
		bebida.addRefresco("Monster", 2.50, 2);
		bebida.addRefresco("Raw", 2.00, 3);
		bebida.addRefresco("Agua", 1.00, 1);
		bebida.addRefresco("Café", 1.50, 1);
		bebida.addRefresco("Mosto", 1.50, 2);
		bebida.addRefresco("Nestea", 1.80, 2);
		
		refresco = bebida.getRefresco(0);
		 
		int res = 0;
		while(res == 0) {
			System.out.println("¿Qué quieres hacer?");
			System.out.println("1- Reponer");
			System.out.println("2- Precio");
			System.out.println("3- Comprar");
			System.out.println("4- Recaudación");
			System.out.println("5- salir");
			
			int opcion = sc.nextInt();
			if(opcion == 1) {
				System.out.println("¿Qué quieres reponer?");
				for ( int i = 0; i < bebida.getNumOfRefrescos(); i++ ) {
			           refresco = bebida.getRefresco(i);
			            
			          System.out.println("Refresco [" + (i+1) + "] "
			                + refresco.getNombre());
			     }
				int opcion1 = sc.nextInt();
				if(opcion1 <= 10 || opcion1 >=1) {
					refresco = bebida.getRefresco(opcion1 - 1);
					System.out.println("Has elegido: " + refresco.getNombre());
					System.out.println("¿Y la cantidad?");
					int cantidad = sc.nextInt();
					int cant = refresco.getCantidad();
					cant += cantidad;
					refresco.setCantidad(cant);
					 for ( int i = 0; i < bebida.getNumOfRefrescos(); i++ ) {
				           refresco = bebida.getRefresco(i);
				            
				          System.out.println("Refresco [" + (i+1) + "] "
				                + refresco.getNombre()
				            	+ ", cantidad " + refresco.getCantidad());
				        }
				}else {
					System.out.println("Tienes que marcar un número válido");
				}
				
			}
			if(opcion == 2) {
				for ( int i = 0; i < bebida.getNumOfRefrescos(); i++ ) {
			           refresco = bebida.getRefresco(i);
			            
			          System.out.println("Refresco [" + (i+1) + "] "
			                + refresco.getNombre()
			                + ", precio " + refresco.getPrecio() + " €");
			     }
			}
			if(opcion == 3) {
				System.out.println("¿Qué quieres comprar?");
				for ( int i = 0; i < bebida.getNumOfRefrescos(); i++ ) {
			           refresco = bebida.getRefresco(i);
			            
			          System.out.println("Refresco [" + (i+1) + "] "
			                + refresco.getNombre()
			                + ", precio " + refresco.getPrecio() + " €"
			                + ", cantidad " + refresco.getCantidad());
			     }
				int opcion1 =sc.nextInt();
				int cant = 0;
				if(opcion1 <= 10 || opcion1 >=1) {
					if(bebida.getRefresco(opcion1 - 1).getCantidad() > 0) {
						refresco = bebida.getRefresco(opcion1 - 1);
						System.out.println("Producto elegido: " + refresco.getNombre());
						cant = refresco.getCantidad();
						cant--;
						refresco.setCantidad(cant);
						recaudacion += refresco.getPrecio();
					}else {
						System.out.println("Producto agotado");
					}
				}else {
					System.out.println("Tienes que marcar un número válido");
				}
			}
			if(opcion == 4) {
				System.out.println("Dinero recaudado: " + recaudacion + " €");
			}
			if(opcion == 5) {
				res = 1;
				System.out.println("Adios!");
			}
		  
		  
		}
	}

}
