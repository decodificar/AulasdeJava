package atividadeparcial1;

//Jade Denice Jaquetta Pereira, 21117476 - Eng Computação
//Pedro Luiz Marques de Castro Silva, 20985604 - Sistemas de Informação



public class Mesa {
   private int numero;
   private  int pessoas;
   private double totalConta;

   
   
   public Mesa(int numero, int pessoas) {
       this.numero = numero;
       this.pessoas = pessoas;


   }
   
 public int getNumero() {
     return numero;
 }   
   
 public void setNumero(int numero) {
     this.numero = numero;
      
 }
 
 public int getPessoas() {
     return pessoas;
 }
 public void setPessoas(int pessoas) {
     this.pessoas = pessoas;
 }

 public void fazerPedido(int codigo, int quantidade) {
     if (codigo == 1) {
         totalConta = 2.50 * quantidade;
     } else if(codigo == 2) {
         totalConta = 6.00 * quantidade;
     } else if(codigo == 3) {
         totalConta = 5.00 * quantidade;    
         
    }
     
 }
 
 public void fecharConta(double tipoPagamento) {
     
     if (tipoPagamento == 1) {
         totalConta = totalConta - (totalConta * 0.1);
     } else if (tipoPagamento == 2) {
         totalConta = totalConta;
     } else if (tipoPagamento == 3) {
         totalConta = totalConta - (totalConta * 0.05);
     }
    
 }
 public void totalPessoas(int pessoas, double totalConta) {
     totalConta = this.totalConta / this.pessoas;
 }
 
 public void imprimir(int numero, int pessoas, double totalConta) {
     System.out.println("A mesa" + numero + "possui" + pessoas + "e tem um valor total de: " + totalConta);
 }
}
 



