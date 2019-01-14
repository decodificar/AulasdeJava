package bancouam;

import bancouam.Conta;

public class ContaEspecial extends Conta {

    double limite = 500;
    protected Cliente cliente;
    protected Conta conta;
    public ContaEspecial() {

    }

    public ContaEspecial(int numConta, Cliente cliente) {
        this.numConta = numConta;
        this.cliente = cliente;

    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public String imprimir() {
        return super.imprimir() + "Limite da Conta: " + limite;
        
    }

}
