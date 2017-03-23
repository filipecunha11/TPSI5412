package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.GerirClientes;
import controller.GerirReservas;
import controller.GerirRestaurantes;
import model.Cliente;
import model.Reserva;
import model.Restaurante;

public class Menu {
	
	public Menu(ArrayList<Cliente> clientes, ArrayList<Restaurante> restaurantes, ArrayList<Reserva> reservas){
		int menu = -1;
		while (menu != 0){
			System.out.println("MENU");
			System.out.println("1. Inserir Cliente");
			System.out.println("2. Inserir Restaurante");
			System.out.println("3. Fazer Reservas");
			System.out.println("4. Consultar Clientes");
			System.out.println("5. Consultar Restaurantes");
			System.out.println("5. Consultar Reservas");
			System.out.println("0. Sair");
			menu = new Scanner(System.in).nextInt();
			
			switch (menu)
			{
			case 1: new GerirClientes().RegistarCliente(clientes);
				break;
			case 2: new GerirRestaurantes().RegistarRestaurante(restaurantes);
				break;
			case 3: new GerirReservas().FazerReservas(clientes, restaurantes, reservas);
				break;
			case 4: new GerirClientes().ConsultarCliente(clientes);
				break;
			case 5: new GerirReservas().ConsultarReservas(reservas);
				break;
			}
		}
	}
}
