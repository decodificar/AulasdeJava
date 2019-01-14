package bancouam;

import java.util.Scanner;

/**
 *
 * @author Jade Denice Jaquetta Pereira, 21117476. 
 * Engenharia da Computação
 */
public class BancoUAM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //saldo inicial e limit de saldo
       Scanner scan = new Scanner(System.in);

        int i = 1;
        while(i == 1){
            
        
        
        
       

        
        Cliente objCliente;
        objCliente = new Cliente("000.000.000.00", "Jade", "rua morais de barros", "11999-9999");
        
        Conta objConta;
        objConta = new Conta();
        
        ContaEspecial objContaEspecial;
        objContaEspecial = new ContaEspecial();
        
        objContaEspecial.sacar(10);
        
        GerenciarContas objGerenciarContas;
        objGerenciarContas = new GerenciarContas();
        
        App objApp;
        objApp = new App();
        
//        System.out.println(objCliente.imprimir());
//        System.out.println(objConta.imprimir());
//          System.out.println(objContaEspecial.imprimir());



        
        
            System.out.println("Para sair digite 0 e para voltar ao menu digite 1");
            i = Integer.parseInt(scan.nextLine());
        
 }       
    }

    
   
}
