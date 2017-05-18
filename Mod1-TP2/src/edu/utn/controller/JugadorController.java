package edu.utn.controller;

import java.util.ArrayList;

import edu.utn.model.*;
//import edu.utn.model.enumerable.*;

public class JugadorController {
	private ArrayList<Jugador> listaJugadores;
//	private ArrayList<Jugador> listaJugadorBase;
//	private ArrayList<Jugador> listaJugadorAyudaBase;
//	private ArrayList<Jugador> listaJugadorAla;
//	private ArrayList<Jugador> listaJugadorAlaPivot;
//	private ArrayList<Jugador> listaJugadorPivot;
	
	public JugadorController() {
		this.listaJugadores = new ArrayList<Jugador>();
//		this.listaJugadorBase = new ArrayList<Jugador>();
//		this.listaJugadorAyudaBase = new ArrayList<Jugador>();
//		this.listaJugadorAla = new ArrayList<Jugador>();
//		this.listaJugadorAlaPivot = new ArrayList<Jugador>();
//		this.listaJugadorPivot = new ArrayList<Jugador>();
	}

	public ArrayList<Jugador> getListaJugadores() {
		return listaJugadores;
	}

	public void setListaJugadores(Jugador jugador) {
		this.listaJugadores.add(jugador);
	}

//	public ArrayList<Jugador> getListaJugadorBase() {
//		return listaJugadorBase;
//	}
//
//	public ArrayList<Jugador> getListaJugadorAyudaBase() {
//		return listaJugadorAyudaBase;
//	}
//
//	public ArrayList<Jugador> getListaJugadorAla() {
//		return listaJugadorAla;
//	}
//
//	public ArrayList<Jugador> getListaJugadorAlaPivot() {
//		return listaJugadorAlaPivot;
//	}
//
//	public ArrayList<Jugador> getListaJugadorPivot() {
//		return listaJugadorPivot;
//	}
//
//	public void setListaJugadorXPosicion(Jugador jugador) {
//		switch (jugador.getPosicion().name()) {
//		case "BASE":
//			this.listaJugadorBase.add(jugador);
//			break;
//		case "AYUDA_BASE":
//			this.listaJugadorAyudaBase.add(jugador);
//			break;
//		case "ALA":
//			this.listaJugadorAla.add(jugador);
//			break;
//		case "ALA_PIVOT":
//			this.listaJugadorAlaPivot.add(jugador);
//			break;
//		case "PIVOT":
//			this.listaJugadorPivot.add(jugador);
//			break;
//		default:
//			System.out.println("No es posible agregar el jugador");
//			break;
//		}
	
	
}
	

