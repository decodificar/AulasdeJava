
package resistencias;
import java.util.Random;


public class Resistencias {

    
    public static void main(String[] args) {
        Random resistencia = new Random();

        int[] re = new int[10];
        int i;

        for (i = 0; i < 10; i++) {
            re[i] = resistencia.nextInt(101);

        }

        int soma = 0;
        int menor = re[0];
        int maior = re[0];
        for (i = 0; i < 10; i++) {
            soma = soma + re[i];

            if (re[i] < menor) {
                menor = re[i];
            }

            if (re[i] > maior) {
                maior = re[i];
            }

        }
        
     

        System.out.printf("\n O maior número é: " +maior);
        System.out.printf("\n O menor número é: "  +menor);

        System.out.printf("\nSoma = %d\n ", soma);

    }
    
}
