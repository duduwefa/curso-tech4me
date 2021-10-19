package classes;

public abstract class Pessoa {
    protected String nome;
    protected String cpf;


    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return this.cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // public abstract String cumprimentar();

    public abstract String cumprimentar();

}
