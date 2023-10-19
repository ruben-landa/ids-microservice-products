package com.ids.ids.entity;

public class Producto {
	
	private int id;
	private String nombreProducto;
	private double precio;
	
	public Producto() {
	
	}

	public Producto(int id, String nombreProducto, double precio) {
		this.id = id;
		this.nombreProducto = nombreProducto;
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	

}
