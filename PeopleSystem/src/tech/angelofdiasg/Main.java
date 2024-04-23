package tech.angelofdiasg;
import tech.angelofdiasg.interfaces.Cadastramento;
import tech.angelofdiasg.pessoas.Endereco;
import tech.angelofdiasg.composicoes.Cargo;
import tech.angelofdiasg.pessoas.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario();
        Cargo cargo1 = Cargo.ESTAGIARIO;
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Endereco end1 = new Endereco("Rua end1",
                "Num end1","Cep end1",
                "Cid end1","estado end1",
                "pais end1");
        c1.setCodigo("1");
        c1.setNome("Meu nome");
        c1.setDataNascimento(LocalDate.of(1990,1,2));
        c1.setEndereco(end1);
        System.out.println("Nome do cliente: " + c1.getNome());
        System.out.println("Rua do cliente: " + c1.getEndereco().getRua());
        c1.getEndereco().setRua("O cara mudou de rua.");
        System.out.println("Rua do cliente: " + c1.getEndereco().getRua());

    }
}
