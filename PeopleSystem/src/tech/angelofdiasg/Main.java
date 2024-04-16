package tech.angelofdiasg;

import tech.angelofdiasg.composicoes.Endereco;
import tech.angelofdiasg.composicoes.Telefone;
import tech.angelofdiasg.estruturasdedados.ListaDeTelefonesNaoOrdenados;
import tech.angelofdiasg.pessoas.*;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int opcaoDeEscolha;
        do {
            System.out.println("Escolha a opção de cadastramento\n");
            System.out.print("1.) Cliente \n");
            System.out.print("2.) Funcionario\n");
            System.out.print("3.) Exit\n");
            System.out.print("\nEscolha a opção digitando o número: ");

            opcaoDeEscolha(input.nextInt());

        } while (true);

    }

    private static void opcaoDeEscolha(int opcaoEscolhida) {
        Cliente c1 = new Cliente();
        Funcionario func1 = new Funcionario();
        switch (opcaoEscolhida) {

            case 1:
                c1.cadastrarCliente();
                break;
            case 2:
                func1.cadastrarFuncionario();
                break;
            case 3:
                break;
            default:
                System.out.println("Opçaõ inválida");
                break;
        }
    }
}