package JavaTech;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex01Fila {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		int opcao;
//		String nome;

		while (true) {
			System.out.println("\n****************************************************");
			System.out.println("\n\n\t\t Menu de opções:");
			System.out.println("\n\n\t 1 - Adicionar cliente na fila \n\t 2 - Listar todos os Clientes\n\t 3 - Retirar Cliente da fila\n\t 0 - Sair");
			System.out.println("\n****************************************************");
			System.out.println("Entre com a opção desejada: ");
			System.out.println("							");
			opcao = leia.nextInt();

			if (opcao == 0) {
				System.out.println("Programa encerrado!");
				break;
			}

			else if (opcao == 1) {
				System.out.println("Digite o nome: ");
				leia.nextLine();
				String nome = leia.nextLine();
				fila.add(nome);
				System.out.printf("Cliente adicionado!");
			} else if (opcao == 2) {
				System.out.println("\nElementos da fila: " + fila);
			} else if (opcao == 3) {
				if (fila.size() == 0) {
					System.out.println("A fila está vazia!\r\n");
				} else {
					String cliente = fila.remove();
					System.out.print(fila);
					System.out.printf("\nO Cliente '%s' foi Chamado!", cliente);
				}
			} else {
				System.out.println("Opção Invalida!");
			}
		}
	}
}