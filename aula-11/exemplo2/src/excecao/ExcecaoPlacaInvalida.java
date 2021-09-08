package excecao;

public class ExcecaoPlacaInvalida extends Exception {
    private static final long serialVersionUID = 1L;

    public ExcecaoPlacaInvalida() {
        super("A placa deve ser composta por 3 letras e 4 numeros");
    }
    
    public ExcecaoPlacaInvalida(String msg) {
        super(msg);
    }

}
