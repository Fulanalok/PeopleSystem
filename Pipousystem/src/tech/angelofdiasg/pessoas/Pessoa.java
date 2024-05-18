package tech.angelofdiasg.pessoas;

import tech.angelofdiasg.composicoes.Endereco;
import tech.angelofdiasg.estruturasdedados.*;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String nome;
    private LocalDate dataNascimento;
    private Endereco endereco;
    private ListaDeTelefonesNaoOrdenados telsContato;
    public Pessoa(){
        System.out.println("Criando uma pessoa" +
                " sem atributos!");
    }
    public Pessoa(String nome, LocalDate dataNascimento,
                  Endereco endereco, ListaDeTelefonesNaoOrdenados telsContato) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telsContato = telsContato;
    }

    public int obterIdade(){
        int idade = 0;
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(
                this.dataNascimento, dataAtual);
        idade = periodo.getYears();
        return idade;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public ListaDeTelefonesNaoOrdenados getTelsContato() {
        return telsContato;
    }

    public void setTelsContato(ListaDeTelefonesNaoOrdenados telsContato) {
        this.telsContato = telsContato;
    }
}

public void cadastrar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa: ");
        this.nome = scanner.nextLine();

        System.out.println("Digite a data de nascimento: " );
        this.dataNascimento = LocalDate.ofEpochDay(scanner.nextInt());

        System.out.println("Digite o endereco: ");
        System.out.println("Rua: ");
        String rua = scanner.nextLine();
        System.out.println("Numero: ");
        String numero = scanner.nextLine();
        System.out.println("CEP: ");
        String cep = scanner.nextLine();
        System.out.println("Cidade: ");
        String cidade = scanner.nextLine();
        System.out.println("Estado: ");
        String estado = scanner.nextLine();
        System.out.println("Pais: ");
        String pais = scanner.nextLine();
        this.endereco = new Endereco(rua, numero, cep, cidade, estado, pais);

        System.out.println("Digite os numeros de telefone: " );
        String telefonesStr = scanner.nextLine();
        String[] telefones = telefonesStr.split(",");
        this.telsContato = new ListaDeTelefonesNaoOrdenados();
        for (String telefone : telefones) {
            telefone = String.valueOf(new Telefone());
            this.telsContato.addTelefone(telefone.trim());
        }
    }
