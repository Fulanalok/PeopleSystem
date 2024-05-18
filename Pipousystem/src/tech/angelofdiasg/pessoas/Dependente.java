package tech.angelofdias.pessoas;

import tech.angelofdias.composicoes.Endereco;
import tech.angelofdias.composicoes.Telefone;
import tech.angelofdias.interfaces.Cadastramento;

import java.time.LocalDate;
import java.util.UUID;

public class Dependente extends Pessoa implements Cadastramento {
    private UUID id;
    private Cliente ClienteParente;
    private Funcionario FuncionarioParente;
    private String parentesco;

    public Dependente(String nome, LocalDate dataNascimento, Endereco endereco, Telefone telefone, UUID id, Cliente clienteParente, Funcionario funcionarioParente) {
        super(nome, dataNascimento, endereco, telefone);
        this.id = id;
    }
    public Cliente getClienteParente() {
        return ClienteParente;
    }
    public void setClienteParente(Cliente clienteParente) {
        ClienteParente = clienteParente;
    }
    public Funcionario getFuncionarioParente() {
        return FuncionarioParente;
    }

    public void setFuncionarioParente(Funcionario funcionarioParente) {
        FuncionarioParente = funcionarioParente;
    }
    @Override
    public int obterIdade() {
        return idade;
    }

    @Override
    public void cadastrar() {
    }
    public void geradordeId() {
    }
}
