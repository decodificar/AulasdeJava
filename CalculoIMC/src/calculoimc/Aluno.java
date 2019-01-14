package calculoimc;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Aluno {
    Scanner entrada;
    

    String genero;
    double peso;
    double altura;
    double imc_aluno;
    double imc_ideal;
    
    
   public void dadosAluno(){
        entrada = new Scanner(System.in);
        System.out.println("Digite seu peso: ");
        peso = entrada.nextFloat();
        System.out.println("Digite sua altura: ");
        altura = entrada.nextFloat();
        System.out.println("Digite seu gênero ");
        genero = entrada.nextLine();
       if (genero == "masculino"){
          imc_ideal = (72.7*altura)-58;
          imc_aluno = peso / (altura*altura);
          if (imc_ideal == imc_aluno){
              System.out.println("Aluno está no peso ideal.");
          } else if (imc_aluno > imc_ideal){
              System.out.println("Aluno está acima do peso ideal.");
          } else {
              System.out.println("Aluno está abaixo do peso ideal.");
          }
          
       } else if (genero == "feminino"){
           imc_ideal = (62.1 * altura) - 44.7;
           imc_aluno = peso / (altura*altura);
           if (imc_ideal == imc_aluno){
              System.out.println("Aluno está no peso ideal.");
          } else if (imc_aluno > imc_ideal){
              System.out.println("Aluno está acima do peso ideal.");
          } else {
              System.out.println("Aluno está abaixo do peso ideal.");
          }
       }
        
        
        
    
       
   } 
    
    
   
    
}


		
		
		
	
