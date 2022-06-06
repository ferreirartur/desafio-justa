import java.util.Scanner;

public class findAge {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		// Quantidade de Pessoas - Aqui a função lê a quantidade de Pessoas que serão
		// analisadas
		Pessoas[] vetAluno;
		int qtd;
		System.out.println("\n\n--==<< CADASTRO DE PESSOAS >>==--\n");
		System.out.print("Digite o numero de pessoas a serem analisadas: ");
		qtd = leia.nextInt();
		leia.nextLine();
		vetAluno = new Pessoas[qtd];

		
		// Inserção de dados - Aqui a função lê os dados a serem analisados
		for (int i = 0; i < vetAluno.length; i++) {
			vetAluno[i] = new Pessoas();
			System.out.print("Nome da " + i+1 + "ª pessoa. : ");
			vetAluno[i].nome = leia.nextLine();
		}
		for (int j = 0; j < vetAluno.length; j++) {
			vetAluno[j] = new Pessoas();
			System.out.print("Idade da " + j+1 + "ª pessoa. : ");
			vetAluno[j].idade = leia.nextInt();
		}

		
		// Aqui o sistema exibe as pessoas abaixo de 29 anos
		System.out.println("\n\n--==<< RELATORIO DAS PESSOAS ABAIXO DE 29 ANOS >>==--\n");

		for (int k = 0; k < vetAluno.length; k++) {
			if (vetAluno[k].idade < 29) {
				System.out.println("--==<< Pessoa [" + k + 1 + "] >>==--");
				System.out.println("Nome....: " + vetAluno[k].nome);
				System.out.println("Idade: " + vetAluno[k].idade);
			}
		}
		leia.close();
	}
}
