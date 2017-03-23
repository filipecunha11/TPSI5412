package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Cliente;

public class GerirClientes {
	private String nome, morada, email, telefone;
	private int id, opc;
	
	private String nomePrato;
	
	public void RegistarCliente(ArrayList<Cliente> clientes){
		id = clientes.size();
		System.out.print("Insira o nome do cliente: ");
		nome = new Scanner(System.in).nextLine();
		System.out.print("Insira a morada do cliente: ");
		morada = new Scanner(System.in).nextLine();
		System.out.print("Insira o email do cliente: ");
		email = new Scanner(System.in).nextLine();
		System.out.print("Insira o telefone do cliente: ");
		telefone = new Scanner(System.in).nextLine();
		
		Cliente cliente = new Cliente(id, nome, morada, email, telefone);
		
		clientes.add(cliente);
	}
	
	public void ConsultarCliente(ArrayList<Cliente> clientes){
		int id;
		System.out.print("Insira o ID do cliente: ");
		id = new Scanner(System.in).nextInt();
		
		for (int i = 0 ; i < clientes.size() ; i++ ){
			if (clientes.get(i).getId() == id){
				System.out.println("\nID: " + clientes.get(i).getId());
				System.out.println("Nome: " + clientes.get(i).getNome());
				System.out.println("Morada: " + clientes.get(i).getMorada());
				System.out.println("Telefone: " + clientes.get(i).getTelefone());
				System.out.println("Email: " + clientes.get(i).getEmail());
			}
		}
	}
}
