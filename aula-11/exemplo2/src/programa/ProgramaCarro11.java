package programa;

import java.util.Scanner;

import classes.Carro;
import classes.Motorista;
import excecao.ExcecaoPlacaInvalida;

public class ProgramaCarro11 {
    public static void main(String[] args) throws ExcecaoPlacaInvalida {
        // write your code here

        Carro car = new Carro(new Motorista("Anderson", 1234));
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a placa do carro: ");

        try {
            car.setPlaca(entrada.nextLine());
            System.out.println("Placa do carro: " + car.getPlaca());
            System.exit(0);
        } catch (ExcecaoPlacaInvalida excecao) {
            System.out.println(excecao.getMessage());
        } finally {
            System.out.println("Executando finally");
            entrada.close();
        }
        
        // System.out.println("Placa do carro: " + car.getPlaca());

    }
}
