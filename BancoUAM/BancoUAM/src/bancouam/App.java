package bancouam;

import bancouam.Cliente;
import bancouam.Conta;
import bancouam.ContaEspecial;
import java.util.Scanner;
import bancouam.GerenciarContas;

/**
 *
 * @author jpereira
 */
public class App extends GerenciarContas {

    Cliente objCliente = new Cliente("400.777.888.99", "Jade", "Rua Matias de Barros, 50", "1199997777");
    Conta objConta = new Conta(1213, 0, objCliente);
    ContaEspecial objContaEspecial = new ContaEspecial();

    Scanner scan = new Scanner(System.in);
    public int codigo;

    public App() {
    
        System.out.println("Menu: Digite a opção desejada "
                + "\n1.Cadastrar Conta "
                + "\n2.Cadastrar Conta Especial "
                + "\n3.Relatórios "
                + "\n    4 Listar todas as Contas Cadastradas    "
                + "\n    5 Buscar Contas Pelo Número         "
                + "\n6.Movimentação"
                + "\n    7.Efetuar Depósito"
                + "\n    8.Efetuar Saque"
                + "\n9.Sair");
        codigo = Integer.parseInt(scan.nextLine());
        if (codigo == 1) {

            System.out.println("Digite o número da Conta: ");
//            numConta = Integer.parseInt(scan.nextLine());
//            System.out.println("Digite o valor da Conta: ");
            saldo = Integer.parseInt(scan.nextLine());
            System.out.println("Digite o número do CPF: ");
            objCliente.setCpf(scan.nextLine());
            System.out.println("Digite o nome do Cliente: ");
            objCliente.setNome(scan.nextLine());
            System.out.println("Digite o Endereço do Cliente: ");
            objCliente.setEndereco(scan.nextLine());
            System.out.println("Digite o número de Telefone: ");
            objCliente.setTelefone(scan.nextLine());
            GerenciarContas.cadastrar(conta);
            System.out.println("Cadastrado com sucesso!");

        } else if (codigo == 2) {

            System.out.println("Digite o número da Conta: ");
            numConta = Integer.parseInt(scan.nextLine());
//            System.out.println("Digite o valor da Conta: ");
//            objContaEspecial.setLimite(Double.parseDouble(scan.nextLine()));
            System.out.println("Digite o número do CPF: ");
            objCliente.setCpf(scan.nextLine());
            System.out.println("Digite o nome do Cliente: ");
            objCliente.setNome(scan.nextLine());
            System.out.println("Digite o Endereço do Cliente: ");
            objCliente.setEndereco(scan.nextLine());
            System.out.println("Digite o número de Telefone: ");
            objCliente.setTelefone(scan.nextLine());
            GerenciarContas.cadastrarEsp(objContaEspecial);
            System.out.println("Cadastrado com sucesso!");

        } else if (codigo == 3) {
            System.out.println("4 Listar todas as Contas Cadastras: "
                    + "\n5 Buscar Contas por Número: ");
            codigo = Integer.parseInt(scan.nextLine());

        } else if (codigo == 4) {
            GerenciarContas.listar();

        } else if (codigo == 5) {
            System.out.println("Digite o número da conta: ");
            objConta.setNumConta(Integer.parseInt(scan.nextLine()));
            GerenciarContas.buscar(objConta.getNumConta());

        } else if (codigo == 6) {
            System.out.println("3.1. Efetuar Depósito: "
                    + "\n2.Efetuar Saque: ");

        } else if (codigo == 7) {
            System.out.println("Digite o valor do depósito: ");
            objConta.depositar(Double.parseDouble(scan.nextLine()));
            System.out.println("Depósito realizado com sucesso!");

        } else if (codigo == 8) {
            System.out.println("Digite o valor do saque: ");

            boolean x = objConta.sacar(Double.parseDouble(scan.nextLine()));
            if (!x) {
                System.out.println("Saque não autorizado!");

            } else {
                System.out.println("Saque autorizado!");

            }

        } else if (codigo == 9) {
            System.out.println("Obrigada por utilizar os Serviços do Banco UAM. Até mais.");
        }

    }
}
