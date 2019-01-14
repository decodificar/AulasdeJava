package bancouam;

import bancouam.Cliente;
import bancouam.Conta;
import java.util.ArrayList;
import bancouam.ContaEspecial;

/**
 *
 * @author Jade
 */
public class GerenciarContas extends Conta {

    public String cpf;

    Cliente objCliente = new Cliente("000.000.000.00", "Jade", "Rua Matias Lemos, 80", "11975129515");

    Conta objConta = new Conta();
    Conta conta = new Conta();
    ContaEspecial objContaEspecial = new ContaEspecial();

    public GerenciarContas() {

    }

    public GerenciarContas(Cliente cliente, Conta conta) {

    }

    private static ArrayList<Conta> listaContas = new ArrayList();
    private static ArrayList<ContaEspecial> listaContaEsp = new ArrayList();

    public static ArrayList<Conta> getListaContas() {
        return listaContas;
    }

    public static ArrayList<ContaEspecial> getListaContaEsp() {
        return listaContaEsp;
    }

//   inserção de dados
    public static void cadastrar(Conta conta) {

        listaContas.add(conta);

    }

    static void cadastrarEsp(ContaEspecial contaespecial) {

        listaContaEsp.add(contaespecial);

    }

    public static void listar() {
        String saida = "";

        if (listaContas.isEmpty()) {
            saida = "Nenhuma Conta Cadastrada";
            System.out.println(saida);
        } else {
            System.out.println(listaContas);
            System.out.println(listaContaEsp);
        }

        

    }

    public static Conta buscar(int numConta) {
        for (Conta conta : listaContas) {
            if (conta.getNumConta() == numConta) {
                return conta;
            }
        }
        return null;
    }

}

//    objCliente.setCpf("111.111.111.11");
//
//    objCliente.setNome("Jade");
//    
//    objCliente.setEndereco("Rua Matias Lemos, 80");
//    
//    objCliente.setTelefone("11975129515");
//    
//    objConta.setNumConta(105-8);
//    
//    objConta.setSaldo(0);
//    
//    System.out.println("");
