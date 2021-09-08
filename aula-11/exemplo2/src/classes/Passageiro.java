package classes;

public class Passageiro extends Pessoa {
    private int codigoCliente;

    public int getCodigoCliente() {
        return this.codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    @Override
    public String cumprimentar() {
        return "Fala, Motora!";
    } 

}
