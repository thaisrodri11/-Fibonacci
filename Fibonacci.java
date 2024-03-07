package projeto1;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
	        int numero = scanner.nextInt();
	        scanner.close();

	        
	        int anterior = 0;
	        int atual = 1;
	        int proximo;

	        
	        if (numero == 0 || numero == 1) {
	            System.out.println("O número informado pertence à sequência de Fibonacci.");
	            return;
	        }


	        while (atual <= numero) {
	           
	            proximo = anterior + atual;
	            
	            if (proximo == numero) {
	                System.out.println("O número informado pertence à sequência de Fibonacci.");
	                return;
	            }
	            
	            anterior = atual;
	            atual = proximo;
	        }

	        
	        System.out.println("O número informado NÃO pertence à sequência de Fibonacci.");
	    }
	}


