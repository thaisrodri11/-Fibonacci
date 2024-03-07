package projeto1;
import java.util.Scanner;
public class InverterString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string para inverter seus caracteres: ");
        String entrada = scanner.nextLine();
        scanner.close();

       
        char[] caracteres = entrada.toCharArray();

        
        int inicio = 0;
        int fim = entrada.length() - 1;
        while (inicio < fim) {
            
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;

           
            inicio++;
            fim--;
        }

       
        String invertida = new String(caracteres);

        
        System.out.println("String invertida: " + invertida);

	}

}
