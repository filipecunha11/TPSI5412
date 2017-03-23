package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Cliente;
import model.Reserva;
import model.Restaurante;

public class GerirRestaurantes {
	
	private String nome, morada, contacto, especialidade;
	private int id;
	
	public void RegistarRestaurante(ArrayList<Restaurante> restaurantes){
		id = restaurantes.size();
		System.out.print("Insira o nome do restaurante: ");
		nome = new Scanner(System.in).nextLine();
		System.out.print("Insira a morada do restaurante: ");
		morada = new Scanner(System.in).nextLine();
		System.out.print("Insira o contacto do restaurante: ");
		contacto = new Scanner(System.in).nextLine();
		System.out.print("Insira o especialidade do restaurante: ");
		especialidade = new Scanner(System.in).nextLine();
		
		Restaurante restaurante = new Restaurante(id, nome, morada, contacto, especialidade);	
		restaurantes.add(restaurante);
	}

	public void ConsultarCliente(ArrayList<Restaurante> restaurantes){
		int id;
		System.out.print("Insira o ID do restaurante: ");
		id = new Scanner(System.in).nextInt();
		
		for (int i = 0 ; i < restaurantes.size() ; i++ ){
			if (restaurantes.get(i).getId() == id){
				System.out.println("\nID: " + restaurantes.get(i).getId());
				System.out.println("Nome: " + restaurantes.get(i).getNome());
				System.out.println("Morada: " + restaurantes.get(i).getMorada());
				System.out.println("Contacto: " + restaurantes.get(i).getContacto());
				System.out.println("Especialidade: " + restaurantes.get(i).getEspecialidade());
			}
		}
	}
}
