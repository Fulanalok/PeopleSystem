package tech.angelofdias;

import java.time.LocalDate;
import java.util.Scanner;
import tech.angelofdias.composicoes.Endereco;
import tech.angelofdias.composicoes.Telefone;
import tech.angelofdias.estruturadedados.ListaDeTelefonesNaoOrdenados;
import tech.angelofdias.pessoas.Cliente;
import tech.angelofdias.pessoas.Funcionario;
import tech.angelofdias.pessoas.Pessoa;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcaoEscolhida;
        do {
            System.out.println("Escolha a opção de cadastramento: ");
            System.out.println("1. Cliente");
            System.out.println("2. Funcionário");
            System.out.println("3. Sair");
            System.out.println("\n Escolha a opção digitando 1, 2 ou 3: ");

            opcaoEscolhida = input.nextInt();
        } while (opcaoEscolhida > 3 || opcaoEscolhida < 1);

        Pessoa pessoa;
        switch (opcaoEscolhida) {
            case 1:
                pessoa = new Cliente();
                break;
            case 2:
                pessoa = new Funcionario();
                break;
            default:
                pessoa = null;
        }

        if (pessoa != null) {
            pessoa.cadastrar();
            
            pessoa.setNome("Nome");
            pessoa.setDataNascimento(LocalDate.of(1990, 1, 2));
            Endereco endereco = new Endereco("Rua do Cliente", "123", "58040-000", "João Pessoa", "PB", "Brasil");
            pessoa.setEndereco(endereco);
        
            System.out.println("Nome do cliente: " + pessoa.getNome());
            System.out.println("Endereço completo:");
            System.out.println("Rua: " + pessoa.getEndereco().getRua());
            System.out.println("Número: " + pessoa.getEndereco().getNumero());
            System.out.println("CEP: " + pessoa.getEndereco().getCep());
            System.out.println("Cidade: " + pessoa.getEndereco().getCidade());
            System.out.println("Estado: " + pessoa.getEndereco().getEstado());
            System.out.println("País: " + pessoa.getEndereco().getPais());
            
            pessoa.getEndereco().setRua("Rua Nova do Cliente");
            System.out.println("Rua do cliente após alteração: " + pessoa.getEndereco().getRua());
            
            ListaDeTelefonesNaoOrdenados listaTelefones = new ListaDeTelefonesNaoOrdenados();
            Telefone telefone1 = new Telefone("081", "988081008");
            Telefone telefone2 = new Telefone("083", "88081008");
            listaTelefones.addTelefone(telefone1);
            listaTelefones.addTelefone(telefone2);
            pessoa.setTelsContato(listaTelefones);

            System.out.println("Telefones do cliente:");
            pessoa.getTelsContato().exibirTelefones();
            
            pessoa.getTelsContato().removerTelefone(telefone1);
            System.out.println("Telefones após remover o primeiro telefone:");
            pessoa.getTelsContato().exibirTelefones();
            
            pessoa.getTelsContato().addTelefone(telefone1);
            pessoa.getTelsContato().addTelefone(telefone1);
            pessoa.getTelsContato().addTelefone(telefone1);
            pessoa.getTelsContato().addTelefone(telefone1);
            pessoa.getTelsContato().addTelefone(telefone1);
            pessoa.getTelsContato().addTelefone(telefone1);
            System.out.println("Telefones após adicionar vários telefones:");
            pessoa.getTelsContato().exibirTelefones();
        }
    }
}
