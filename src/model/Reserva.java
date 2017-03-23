package model;

import java.util.ArrayList;

public class Reserva {
	ArrayList<String> pratos = new ArrayList<String>();
	Restaurante restaurante;
	Cliente cliente;
	
	public Reserva(ArrayList<String> pratos, Restaurante restaurante, Cliente cliente) {
		super();
		this.pratos = pratos;
		this.restaurante = restaurante;
		this.cliente = cliente;
	}
	
	public ArrayList<String> getPratos() {
		return pratos;
	}
	public void setPratos(ArrayList<String> pratos) {
		this.pratos = pratos;
	}
	public Restaurante getRestaurante() {
		return restaurante;
	}
	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
