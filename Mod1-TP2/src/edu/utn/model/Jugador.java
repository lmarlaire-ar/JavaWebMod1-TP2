package edu.utn.model;

public abstract class Jugador {
	private int id;
	private String nombre;
	private String apellido;
	private double altura;
	//private EnumPosicion posicion;
	
	public Jugador(int id, String nombre, String apellido, double altura) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.altura = altura;
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
	public void setId(int id) {
		this.id = id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
}
