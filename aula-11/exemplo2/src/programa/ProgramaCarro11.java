package programa;

import classes.Carro;
import classes.Motorista;
import excecao.ExcecaoPlacaInvalida;
import interfaces2.Acelerador;

public class ProgramaCarro11 {
    public static void main(String[] args) throws ExcecaoPlacaInvalida {
        // write your code here

        Acelerador[] aceleradores = new Acelerador[3];
        Motorista mot = new Motorista("joao", 1234);

        try {
            aceleradores[0] = new Carro("ABC1234", 123456790, mot);
            aceleradores[1] = new Carro("DEF5678", 123456790, new Motorista("Maria", 5678));
            aceleradores[2] = mot;
        } catch (ExcecaoPlacaInvalida e) {
            e.printStackTrace();
        }
        
        for (Acelerador objeto : aceleradores) {
            System.out.printf("Chamada do metodo em objeto do tipo %s", objeto.getClass().getSimpleName());
            System.out.printf(" - Velocidade atual: %d\n", objeto.acelerar());
        }

    }
}
