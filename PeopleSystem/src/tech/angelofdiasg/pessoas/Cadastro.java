package tech.angelofdiasg.pessoas;

import tech.angelofdiasg.interfaces.Cadastramento;

import java.util.List;

public class Cadastro implements Cadastramento {
    private List<Cliente> clientes;
    private List<Funcionario> funcionarios;

    public Cadastro(List<Cliente> clientes, List<Funcionario> funcionarios) {
        this.clientes = clientes;
        this.funcionarios = funcionarios;
    }

    @Override
    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
        System.out.println("Cliente cadastrado");
    }

    @Override
    public void cadastrarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        System.out.println("Cliente cadastrado");
    }
}
