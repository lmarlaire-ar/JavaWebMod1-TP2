package edu.utn.controller;

import java.util.ArrayList;

import edu.utn.model.DirectorTecnico;

public class DtController {
	private ArrayList<DirectorTecnico> listaDt;

	
	

	public DtController() {
		this.listaDt = new ArrayList<DirectorTecnico>();
	}

	public ArrayList<DirectorTecnico> getListaDt() {
		return listaDt;
	}

	public void setListaDt(DirectorTecnico dt) {
		this.listaDt.add(dt);
	}
	
	public void setListaDt(DirectorTecnico dt1, DirectorTecnico dt2) {
		this.listaDt.add(dt1);
		this.listaDt.add(dt2);
	}

	public void setListaDt(DirectorTecnico dt1, DirectorTecnico dt2, DirectorTecnico dt3) {
		this.listaDt.add(dt1);
		this.listaDt.add(dt2);
		this.listaDt.add(dt3);
	}

	@Override
	public String toString() {
		return "DtController [listaDt=" + listaDt + "]";
	}
	
	
	
}