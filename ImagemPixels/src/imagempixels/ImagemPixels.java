
package imagempixels;
import java.util.Random;


public class ImagemPixels {
    
    static Random randomica = new Random();

   
    public static void main(String[] args) {
        int[][] matriz = new int[40][40];
        
        
        for(int l = 0; l < 40; l++){
            for(int c = 0; c < 40; c++){
                
              matriz[l][c] = randomica.nextInt(256);
              
            }
        } 
        
      for(int l = 0; l < 40; l++){
          for(int c = 0; c < 40; c++){
              System.out.println(matriz[l][c]);  
          }
      }  

       
        
       
       
    }
    
}
