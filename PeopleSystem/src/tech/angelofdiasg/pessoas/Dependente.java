package tech.angelofdiasg.pessoas;

import java.time.LocalDate;
import java.util.UUID;

public class Dependente extends Pessoa {

    private UUID id;
    private String parentesco;

    public Dependente() {
        this.id = UUID.randomUUID();
    }

    public Dependente(String nome, LocalDate dataNascimento, Endereco endereco, Endereco.Telefone telsContato,
                      String parentesco, Pessoa pessoaRelacionada) {
        this.id = UUID.randomUUID();
        this.parentesco = parentesco;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }
}
