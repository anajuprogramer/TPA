package listaSwitchCase;

import java.util.Scanner;

public class estatisticaAlunos {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		int total, mb, b, r, i, mencao;
		
		System.out.println("Digite o n�mero de alunos com men��o MB:");
		mb = leitura.nextInt();
		System.out.println("Digite o n�mero de alunos com men��o B:");
		b = leitura.nextInt();
		System.out.println("Digite o n�mero de alunos com men��o R");
		r = leitura.nextInt();
		System.out.println("Digite o n�mero de alunos com men��o I");
		i = leitura.nextInt();
		
		total = mb + b + r + i;
		
		double porcMb, porcB, porcR, porcI;
		porcMb = (double) mb/total * 100;            
		porcB= (double) b/total * 100;
		porcR = (double) r/total * 100;
		porcI =  (double) i/total * 100;
		
		System.out.println("De qual das men��es deseja saber a porcentgem?  Digite o n�mero correspondente: MB (1) B (2) R (3) I (4)");
		mencao = leitura.nextInt();

		switch (mencao) {
        case 1:
            System.out.println("A porcentagem � de: " + porcMb + "%");   
            break;
            
        case 2:
            System.out.println("A porcentagem � de: " + porcB  + "%");
            break;
            
        case 3:
            System.out.println("A porcentagem � de: " + porcR  + "%");
            break; 
            
        case 4:
            System.out.println("A porcentagem � de: " + porcI  + "%");
            break; 
            
        default:
            System.out.println("N�mero inv�lido!");
		}

	}

}
