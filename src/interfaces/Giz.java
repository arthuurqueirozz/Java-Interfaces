package interfaces;

public class Giz  implements ICaneta{

    @Override
    public void escrever(String texto) {
        System.out.println("Texto: " + texto + "da classe" + getClass().getSimpleName());
    }

    @Override
    public String getCor() {
        return "Branco";
    }
}
