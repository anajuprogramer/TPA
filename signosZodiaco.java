package listaSwitchCase;

import java.util.Scanner;

public class signosZodiaco {
	
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner (System.in);
		int mes, dia;
		
		System.out.println("Digite o m�s em que voc� nasceu : ");
		mes = leitura.nextInt();
		
		System.out.println("Digite o dia em que voc� nasceu : ");
		dia = leitura.nextInt();
		
		System.out.println("Qual � o seu signo do zod�aco? ");
		
			switch(mes) {
			
			case 1:
                if (dia < 21) {
                    System.out.println("Seu signo � capric�rnio!");
                } else if (dia >= 21) {
                    System.out.println("Seu signo �  aqu�rio");
                }
                break;
                
			case 2:
                if (dia < 19) {
                    System.out.println("Seu signo � aqu�rio");
                } else if (dia >= 19) {
                    System.out.println("Seu signo � peixes");
                }
                break;
                
			case 3:
	            if (dia < 21 ) {
	                System.out.println("Seu signo � peixes");
	            } else if (dia >= 21) {
	               System.out.println("Seu signo � �ries");
	            }
	            break;
	            
			case 4:
                if (dia < 21) {
                    System.out.println("Seu signo � �ries");
                } else if (dia >= 21) {
                    System.out.println("Seu signo � touro");
                }
                break;
                
            case 5:
                if (dia < 21) {
                    System.out.println("Seu signo � touro");
                } else if (dia >=21 ) {
                    System.out.println("Seu signo � g�meos");
                }
                break;
                
            case 6:
                if (dia < 21) {
                    System.out.println("Seu signo � g�meos");
                } else if (dia >= 21) {
                    System.out.println("Seu signo � c�ncer");
                }
                break;
                
            case 7:
                if (dia < 23) {
                    System.out.println("Seu signo � c�ncer");
                } else if (dia >= 23) {
                    System.out.println("Seu signo � le�o");
                }
                break;
                
            case 8:
                if (dia < 23) {
                    System.out.println("Seu signo � le�o");
                } else if (dia >= 23) {
                    System.out.println("Seu signo � virgem");
                }
                break;
                
            case 9:
                if (dia < 23) {
                    System.out.println("Seu signo � virgem");
                } else if (dia >= 23) {
                    System.out.println("Seu signo � libra");
                }
                break;
                
            case 10:
                if (dia < 23) {
                    System.out.println("Seu signo � libra");
                } else if (dia >= 23) {
                    System.out.println("Seu signo � escorpi�o");
                }
                break;
                
            case 11:
                if (dia < 22) {
                    System.out.println("Seu signo � escorpi�o");
                } else if (dia >= 22) {
                    System.out.println("Seu signo � sargit�rio");
                }
                break;
                		
            case 12:
                if (dia < 22) {
                    System.out.println("Seu signo � sargit�rio");
                } else if (dia >= 22) {
                    System.out.println("Seu signo � capric�rnio");
                }
                break;
                
            default:
                System.out.println("O m�s � inv�lido!");    
                
	       }
		   
	}
}
