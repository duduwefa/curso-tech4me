package classes;
import excecao.ExcecaoPlacaInvalida;

public class Carro {
    private String letrasPlaca;
    private int numerosPlaca;
    private int numChassi;
    private int velocidadeAtual;
    private Motorista motorista;

    public Carro(Motorista motorista) {
        this.motorista = motorista;
        motorista.setVeiculo(this);
    }   

    public Carro() {}   

    public Carro(String placa, int numChassi, Motorista motorista) throws ExcecaoPlacaInvalida {
        this(motorista);
        setPlaca(placa);
        this.numChassi = numChassi;
    }

    public int getNumChassi() {
        return this.numChassi;
    }
    public void setNumChassi(int numChassi) {
        this.numChassi = numChassi;
    }
    
    public Motorista getMotorista() {
        return this.motorista;
    }
    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public String getPlaca() {
        if("ERRO!!!".equals(letrasPlaca)) {
            return letrasPlaca;
        } else {
            return letrasPlaca + numerosPlaca;
        }
    }

    public void setPlaca(String placa) throws ExcecaoPlacaInvalida {
        /* if(placa != null && placa.length() == 7) {
            this.letrasPlaca = placa.substring(0, 3);
            this.numerosPlaca = Integer.parseInt(placa.substring(3));   
        } else {
            this.letrasPlaca = "ERRO!!!";
        } */
        if (placa == null) {
            throw new ExcecaoPlacaInvalida("O valor da placa nao pode ser nulo");
        }

        if (!placa.matches("[A-Z]{3}\\d{4}")) {
            throw new ExcecaoPlacaInvalida();
        }

        this.letrasPlaca = placa.substring(0, 3);
        this.numerosPlaca = Integer.parseInt(placa.substring(3)); 
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    //Métodos
    public void acelerar() {
        velocidadeAtual++;
    }

    //Sobrecarga de métodos
    public void acelerar(int limite) {
        for (int i = 0; i < limite; i++) {
            acelerar();
        }
    }
    
}
