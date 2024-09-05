package interfaces;

public class CanetaEsferografica implements ICaneta{
    /**
     * @param texto
     */
    @Override
    public void escrever(String texto) {
        System.out.println("Texto: " + texto + " da classe " + getClass().getSimpleName());
    }

    /**
     * @return
     */
    @Override
    public String getCor() {
        return "Azul";
    }
}
