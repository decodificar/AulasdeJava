
package letras;


public class Letras {

   
    public static void main(String[] args) {
        
        int teste = 1;
        System.out.println(isLetra("a"));
       
    }
    
  private static boolean isLetra(String letra){
      int ascii = letra.toLowerCase().toCharArray()[0];
      return (ascii >= 97 && ascii <= 122);
  }
    
}
