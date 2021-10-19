package classes;
import interfaces2.Acelerador;

public class Motorista extends Pessoa implements Acelerador {
    private int matricula;
    private Carro veiculo;

    //Construtor
    public Motorista(Carro veiculo) {
        this.veiculo = veiculo;
    }

    public Motorista(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    //Getters e setters
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Carro getVeiculo() {
        return this.veiculo;
    }

    public void setVeiculo(Carro veiculo) {
        this.veiculo = veiculo;
    }


    //Métodos
    @Override
    public void acelerar(int limite) {
        veiculo.acelerar(limite);
    }

    @Override
    public void acelerar() {
        veiculo.acelerar();
    }

    @Override
    public String cumprimentar() {
        return "Olá, passageiro!";
    }

}
