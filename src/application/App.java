package application;

import java.util.ArrayList;
import model.Cliente;
import model.Reserva;
import model.Restaurante;
import view.Menu;

public class App {

	static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	static ArrayList<Restaurante> restaurantes = new ArrayList<Restaurante>();
	static ArrayList<Reserva> reservas = new ArrayList<Reserva>();
	
	public static void main(String[] args) {
		new Menu(clientes, restaurantes, reservas);
	}

}
