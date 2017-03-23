package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Cliente;
import model.Reserva;
import model.Restaurante;

public class GerirReservas {
	private ArrayList<String> prato = new ArrayList<String>();
	private String nomePrato;
	private Cliente cliente;
	private Restaurante restaurante;
	private int id, idCli, idRes, opc = 1;
	
	public void FazerReservas(ArrayList<Cliente> clientes, 
			ArrayList<Restaurante> restaurantes, 
			ArrayList<Reserva> reservas){
		
		System.out.print("Insira o ID do cliente: ");
		idCli = new Scanner(System.in).nextInt();
		System.out.print("Insira o ID do restaurante: ");
		idRes = new Scanner(System.in).nextInt();
		
		while (opc != 0) {
			System.out.print("Insira o nome do prato: ");
			nomePrato = new Scanner(System.in).nextLine();
			prato.add(nomePrato);			
			System.out.print("Pretende reservar mais pratos? [1 para sim] - ");
			opc = new Scanner(System.in).nextInt();
		}
		Reserva reserva = new Reserva(prato, restaurantes.get(idRes), clientes.get(idCli));
		reservas.add(reserva);
	}
	
	public void ConsultarReservas(ArrayList<Reserva> reservas){
		System.out.print("Insira o ID do restaurante: ");
		id = new Scanner(System.in).nextInt();
		
		for (int i = 0 ; i < reservas.size() ; i++){
			if ( reservas.get(i).getRestaurante().getId() == id ) {
				for (int j = 0 ; j < reservas.get(i).getPratos().size(); j++)
					System.out.println("Prato - " + reservas.get(i).getPratos().get(j));
				System.out.println("Cliente - " + reservas.get(i).getCliente().getNome() + "\n");
			}
		}
	}
}
