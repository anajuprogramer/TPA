package lacoRepeticao;
import  java.util.Scanner;
public class tabuada {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);

        int i, numero, resultado; 
        
        i = 1;

        System.out.println("Digite o número a ser multiplicado na operação: ");
        
        numero = leitura.nextInt();
        System.out.println("Tabuada do número " + numero + ":");
        
        while (i<=10) {
            
            resultado = i * numero;
            System.out.println(i + "  x  " + numero + "  =  " + resultado);
            
            i++;
        }

	}

}
