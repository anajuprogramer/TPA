package lacoRepeticao;

public class joaoPedro {
	public static void main(String[] args) {
		
		int h = 1;
		
		double pedro, joao;
		
		pedro = 145;
		joao = 134;
		
		while (joao<pedro) {
			
			pedro = pedro + 2.0;
			joao = joao + 2.5;
			h++;
		}
		System.out.println("Para o Jo�o ser mais alto do que Pedro v�o demorar " + h + " anos.");
		
	}

}