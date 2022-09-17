package lacoRepeticao;
import  java.util.Scanner;
public class potenciaDeUmNumero {

	public static void main(String[] args) {
		Scanner leitura = new Scanner (System.in);
		
		int base, resultado, expoente;
		
		System.out.println("Digite o expoente da potência:");
		expoente = leitura.nextInt();
		System.out.println("Digite a base da potência:");
		base= leitura.nextInt();
		
		resultado = 1;
			
			while (expoente>0) {
				resultado = resultado * base;
				expoente--;
			}
			System.out.println("O resultado é " + resultado);

	}

}
