package edu.utn.controller;

import java.util.ArrayList;

import edu.utn.model.Evaluacion;

public class EvaluacionController {
	private ArrayList<Evaluacion> listaEvaluaciones;
	
	public EvaluacionController() {
		this.listaEvaluaciones = new ArrayList<Evaluacion>();
	}

	public ArrayList<Evaluacion> getListaEvaluaciones() {
		return listaEvaluaciones;
	}

	public void setListaEvaluaciones(Evaluacion evaluacion) {
		this.listaEvaluaciones.add(evaluacion);
	}
	
	
	
}
