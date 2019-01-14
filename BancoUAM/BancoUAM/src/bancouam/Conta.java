package bancouam;

import bancouam.Cliente;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jade
 */
public class Conta {

    protected int numConta;
    protected double saldo = 0;
    protected Cliente cliente;

    //construtores 
    public Conta() {

    }

    public Conta(int numConta, double saldo, Cliente cliente) {
        this.numConta = numConta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    //depositar double quantia void
    //sacar double quantia boolean
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo += saldo;
    }

    public String imprimir() {
        return cliente.imprimir() + numConta + "\nSaldo da Conta: " + saldo;

    }

    public void depositar(double quantia) {
        setSaldo(quantia);
        System.out.println("Saldo da sua conta: "+ getSaldo());

    }

    public boolean sacar(double quantia) {
        System.out.println("Saldo da sua conta: "+ getSaldo());
        if (quantia <= getSaldo()) {
            return true;
        } else {
            return false;
        }

    }

}
