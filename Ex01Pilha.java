package JavaTech;

import java.util.Scanner;
import java.util.Stack;

public class Ex01Pilha {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();
		int opcao;
//		String nome;

		while (true) {
			System.out.println("\n****************************************************");
			System.out.println("\n\n\t\t Menu de opções:");
			System.out.println("\n\n\t 1 - Adicionar Livro na pilha\n\t 2 - Listar todos os livros\n\t 3 - Retirar Livro da pilha\n\t 0 - Sair");
			System.out.println("\n\n****************************************************");
			System.out.println("Entre com a opção desejada: ");
			System.out.println("							");
			opcao = leia.nextInt();

			if (opcao == 0) {
				System.out.println("Programa encerrado!");
				break;
			}

			else if (opcao == 1) {
				System.out.println("Adicione o livro: ");
				leia.nextLine();
				String nome = leia.nextLine();
				pilha.push(nome);
				System.out.printf("Livro adicionado!");
			} else if (opcao == 2) {
				System.out.println("\nElementos da Pilha: " + pilha);
			} else if (opcao == 3) {
				if (pilha.size() == 0) {
					System.out.println("A Pilha está vazia!\r\n");
				} else {
					String livro = pilha.pop();
					System.out.print(pilha);
					System.out.printf("\no livro '%s' foi removido", livro);
				}
			} else {
				System.out.println("Opção Invalida!");
			}

		}
	}
}
