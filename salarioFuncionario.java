package lacoRepeticao;
import  java.util.Scanner;
public class salarioFuncionario {

	public static void main(String[] args) {
			
		Scanner  leitura = new  Scanner (System.in);
		
        int  i; 
        i = 1 ; 

        while( i <= 4 ) {
        	
            System.out.println ( "Digite o s�lario do  " + i + "� funcion�rio:" );
            
            double  salario; 
            salario= leitura.nextDouble ();

            if ( salario < 2000 ) {
                salario = salario * 0.085 ;
                System.out.println( "O sal�rio do funcion�rio com o desconto do INSS ser� de: R$ " + salario );
                
            } else {
                salario = salario * 0.11 ;
                System.out.println( "O  sal�rio do funcion�rio com o desconto do INSS ser� de: R$ " + salario );
            }
            
            i ++;
            
        } 	
        
	}

}
