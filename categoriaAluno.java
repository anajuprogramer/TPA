package listaSwitchCase;

import java.util.Scanner;

public class categoriaAluno {

			public static void main(String[] args) {
				Scanner leitura = new Scanner (System.in);
				int idadeA;
				System.out.println("Digite a idade do aluno para saber a que categoria ele pertence: ");
				idadeA = leitura.nextInt();
					switch(idadeA) {
						case 6:
							System.out.println("O aluno � dente de leite");
							break;
						case 7:
							System.out.println("O aluno � j�nior");
							break;
						case 8:	
							System.out.println("O aluno � j�nior max");
							break;
						case 9:
							System.out.println("O aluno � j�nior master");
							break;
						case 10:
							System.out.println("O aluno � master");
							break;
						default:
							System.out.println("O aluno n�o pode ser admitido!");
				   }
					
		  }

	}