package tech.angelofdiasg.estruturasdedados;

import tech.angelofdiasg.composicoes.Telefone;

public class ListaDeTelefonesNaoOrdenados {

    private Telefone[] telefones;

    private int tamanho;

    private static final int CAPACIDADE_PADRAO = 7;

    public ListaDeTelefonesNaoOrdenados() {
        this.telefones = new Telefone[CAPACIDADE_PADRAO];
        this.tamanho = 0;
    }

    public boolean isEmpty() {
        return this.tamanho == 0;
    }

    public void addTelefone1(Telefone telefone){

        if(tamanho == CAPACIDADE_PADRAO){
            System.out.println("Não há mais espaço!");

        } else {
            telefones[tamanho] = telefone;
            this.tamanho = tamanho + 1;
        }
    }
    public void addTelefone(Telefone telefone){

        if(tamanho < CAPACIDADE_PADRAO){

            telefones[tamanho] = telefone;
            this.tamanho = tamanho + 1;
        } else {
            System.out.println("Não há mais espaço!");
        }
    }

    private int buscarTelefoneIndex(Telefone telefone) {
        for(int i = 0; i < tamanho; i++){

            if(telefones[i].equals(telefone)){
                return i;
            }
        }
        System.out.println("Telefone não encontrado!");
        return -1;

    }
    public void removerTelefone(Telefone telefone){

        int index = buscarTelefoneIndex(telefone);

        if(index != -1){
            for(int i = index; i < tamanho -1; i++){
                telefones[i] = telefones[i + 1];
            }
        }

        this.tamanho = tamanho - 1;
        telefones[tamanho] = null;


    }

    public void exibirTelefones(){
        for(int i = 0; i < tamanho; i++){
            System.out.println("Telefones da lista: "
            + telefones[i]);
        }
    }



}
