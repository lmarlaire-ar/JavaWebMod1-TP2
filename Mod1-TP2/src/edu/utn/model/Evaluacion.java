package edu.utn.model;

import edu.utn.controller.DtController;

public class Evaluacion {
	private int calificacion; //min 0; max 100
	private Jugador jugador;
	private DtController juradoDt; //el jurado de DT está formada por un conjunto de DT
	
	public Evaluacion(int calificacion, Jugador jugador, DtController juradoDt) {
		this.juradoDt = juradoDt;	
		this.jugador = jugador;
		
		if (calificacion >= 0 || calificacion <= 100){
			this.calificacion = calificacion;
			
		}
		else
			System.out.println("La calificacion dada no pertenece al rango permitido de 0 a 100");
		

	}
	
	public int getCalificacion() {
		return calificacion;
	}
	public Jugador getJugador() {
		return jugador;
	}
	public DtController getJuradoDt() {
		return juradoDt;
	}
	
	public void setCalificacion(int calificacion, DtController jurado) {
		if (calificacion >= 0 || calificacion <= 100){
			this.calificacion = calificacion;
			this.juradoDt = jurado;			
		}
		else
			System.out.println("La calificacion dada no pertenece al rango permitido de 0 a 100");
	}
	
	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
	public void setJuradoDt(DtController juradoDt) {
		this.juradoDt = juradoDt;
	}
	
	
}
