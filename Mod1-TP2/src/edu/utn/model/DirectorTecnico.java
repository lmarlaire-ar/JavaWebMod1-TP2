package edu.utn.model;

public class DirectorTecnico {
	private int id;
	private String nombre;
	private String apellido;
	
	public DirectorTecnico(int id, String nombre, String apellido) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}

	@Override
	public String toString() {
		return "DirectorTecnico [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	

}
