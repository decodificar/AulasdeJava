
package equacao2grau;
import java.util.Scanner;


public class Equacao2Grau {

    
    public static void main(String[] args) {
        
        Scanner scan = Scanner(System.in);
        double a;
        double b;
        double c;
        double delta;
        double x1; 
        double x2;
        System.out.println("Insira o valor de A: ");
        a = scan.nextDouble;
        while (a == 0) { 	
            System.out.println("O valor de A não pode ser zero \n Digite outro valor !");
            System.out.println("Insira o valor de A: ");
            a = scan.nextDouble; 
        }
        System.out.println("Insira o valor de B: ");
        b = scan.nextDouble;
        System.out.println("Insira o valor de C: ");
        c = scan.nextDouble;
        delta = ((b * b) - (4 * a * c)); 
        x1 = 0;
        x2 = 0;
        if (delta >= 0) { 
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Delta vale :" + delta); 
            System.out.println("\nx1 vale: " + x1 + "\n x2 vale: " + x2); 
        } else { 
            System.out.println("Não há soluções que possam ser expressas com o conjunto dos números reais ");
        }

    }

}
