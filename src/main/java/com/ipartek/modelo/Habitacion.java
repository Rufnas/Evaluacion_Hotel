package com.ipartek.modelo;

public class Habitacion {
	private int id, numeroHabitacion, metros, numeroCamas;
	private float precio;
	private boolean esExterior;
	
	public Habitacion(int id, int numeroHabitacion, int metros, int numeroCamas, float precio, boolean esExterior) {
		super();
		this.id = id;
		this.numeroHabitacion = numeroHabitacion;
		this.metros = metros;
		this.numeroCamas = numeroCamas;
		this.precio = precio;
		this.esExterior = esExterior;
	}
	
	public Habitacion() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumeroHabitacion() {
		return numeroHabitacion;
	}

	public void setNumeroHabitacion(int numeroHabitacion) {
		this.numeroHabitacion = numeroHabitacion;
	}

	public int getMetros() {
		return metros;
	}

	public void setMetros(int metros) {
		this.metros = metros;
	}

	public int getNumeroCamas() {
		return numeroCamas;
	}

	public void setNumeroCamas(int numeroCamas) {
		this.numeroCamas = numeroCamas;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public boolean isEsExterior() {
		return esExterior;
	}

	public void setEsExterior(boolean esExterior) {
		this.esExterior = esExterior;
	}

	@Override
	public String toString() {
		return "Habitacion [id=" + id + ", numeroHabitacion=" + numeroHabitacion + ", metros=" + metros
				+ ", numeroCamas=" + numeroCamas + ", precio=" + precio + ", esExterior=" + esExterior + "]";
	}
	
	
}
