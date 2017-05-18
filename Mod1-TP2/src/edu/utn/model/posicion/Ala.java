package edu.utn.model.posicion;

import edu.utn.model.Evaluacion;
import edu.utn.model.Jugador;

public class Ala extends Jugador{

	private Evaluacion evaluacion;
	
	public Ala(int id, String nombre, String apellido, double altura) {
		super(id, nombre, apellido, altura);
	}

	public Evaluacion getEvaluacion() {
		return evaluacion;
	}

	public void setEvaluacion(Evaluacion evaluacion) {
		this.evaluacion = evaluacion;
	}
}
