package edu.utn.model.posicion;

import edu.utn.model.Evaluacion;
import edu.utn.model.Jugador;

public class Pivot extends Jugador {

	private Evaluacion evaluacion;
	
	public Pivot(int id, String nombre, String apellido, double altura) {
		super(id, nombre, apellido, altura);
		// TODO Auto-generated constructor stub
	}

	public Evaluacion getEvaluacion() {
		return evaluacion;
	}

	public void setEvaluacion(Evaluacion evaluacion) {
		this.evaluacion = evaluacion;
	}
}
