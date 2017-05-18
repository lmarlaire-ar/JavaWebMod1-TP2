package edu.utn.view;

import java.util.Random;

import edu.utn.controller.*;
import edu.utn.model.DirectorTecnico;
import edu.utn.model.Evaluacion;
import edu.utn.model.Jugador;
import edu.utn.model.posicion.*;

public class EjecutaTP1 {

	public static void main(String[] args) {

		//Alta de Directores Técnicos
		DirectorTecnico dt1 = new DirectorTecnico(123, "Marcelo", "Bielsa");
		DirectorTecnico dt2 = new DirectorTecnico(321, "Edgardo", "Bauza");
		DirectorTecnico dt3 = new DirectorTecnico(445, "Cholo", "Simeone");
		DirectorTecnico dt4 = new DirectorTecnico(123, "Ramón", "Diaz");
		
		//Alta de Jurados
		DtController jurado1 = new DtController();
		DtController jurado2 = new DtController();
		
		jurado1.setListaDt(dt1, dt4);

		jurado2.setListaDt(dt1, dt2, dt3);
		
		//Alta pool de jugadores
		JugadorController jugadorCtl = new JugadorController();
		
		//Alta de Jugadores
		jugadorCtl.setListaJugadores(new AlaPivot(101,"Manu","Ginobilli",1.90));
		jugadorCtl.setListaJugadores(new AlaPivot(102,"Chelo","Gino",2.05));
		jugadorCtl.setListaJugadores(new AlaPivot(103,"Pipo","Johny",1.95));
		jugadorCtl.setListaJugadores(new AlaPivot(104,"Gato","Lipa",1.98));
		jugadorCtl.setListaJugadores(new Ala(105,"Manu","Loma",1.98));
		jugadorCtl.setListaJugadores(new Ala(106,"Nombre6","Apellido6",1.98));
		jugadorCtl.setListaJugadores(new Ala(107,"Nombre7","Apellido7",2.05));
		jugadorCtl.setListaJugadores(new Ala(108,"Nombre8","Apellido8",2.05));
		jugadorCtl.setListaJugadores(new AyudaBase(109,"Nombre9","Apellido9",2.05));
		jugadorCtl.setListaJugadores(new AyudaBase(110,"Nombre10","Apellido10",2.05));
		jugadorCtl.setListaJugadores(new AyudaBase(111,"Nombre11","Apellido11",2.05));
		jugadorCtl.setListaJugadores(new AyudaBase(112,"Nombre12","Apellido12",2.05));
		jugadorCtl.setListaJugadores(new Base(113,"Nombre13","Apellido13",1.98));
		jugadorCtl.setListaJugadores(new Base(114,"Nombre14","Apellido14",2.05));
		jugadorCtl.setListaJugadores(new Base(115,"Nombre15","Apellido15",1.98));
		jugadorCtl.setListaJugadores(new Base(116,"Nombre16","Apellido16",2.05));
		jugadorCtl.setListaJugadores(new Pivot(117,"Nombre17","Apellido17",1.98));
		jugadorCtl.setListaJugadores(new Pivot(118,"Nombre18","Apellido18",2.05));
		jugadorCtl.setListaJugadores(new Pivot(119,"Nombre19","Apellido19",1.98));
		jugadorCtl.setListaJugadores(new Pivot(120,"Nombre20","Apellido20",2.05));
		
		//Alta de evaluaciones
		EvaluacionController evaluacionCtl = new EvaluacionController();
		
		for (Jugador jugador : jugadorCtl.getListaJugadores()) {
			Random rnd = new Random();
			//rnd = 0 + (int)(Math.random() * 100);
			int  n = rnd.nextInt(50) + 1;
			evaluacionCtl.setListaEvaluaciones(new Evaluacion(n,jugador,jurado1));

		}
		
		
	}

}
