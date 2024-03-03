package Programa;


public class Pessoa {

    private static int idCliente = 1;
    private String nome;
    private String cpf;
    private String endereco;
    private int telefone;


    public Pessoa(String nome, String cpf, String endereco, int telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        idCliente += 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String toString(){
        return "\nNome: " + this.getNome() +
                "\nCPF: " + this.getCpf() +
                "\nEndereço: " + this.getEndereco() +
                "\nTelefone: " + this.getTelefone();
    }
}
