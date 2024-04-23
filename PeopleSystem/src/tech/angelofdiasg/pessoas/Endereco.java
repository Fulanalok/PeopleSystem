package tech.angelofdiasg.pessoas;

public class Endereco {
    private String rua;
    private String numero;
    private String cep;
    private String cidade;
    private String estado;
    private String pais;
    private Endereco endereco;

    public Endereco(String ruaEnd1,
                    String numEnd1,
                    String cepEnd1,
                    String cidEnd1,
                    String estadoEnd1,
                    String paisEnd1) {
    }

    public class Telefone {
        private String ddd;
    }

    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;

    }
    public String getNumero() {
        return numero;
    }
}
