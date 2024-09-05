package interfaces;

public interface ICaneta {
    public void escrever(String texto);

    public String getCor ();

    default void escreverComumAtodas() {
        System.out.println("Escrita igual a todas.");
    }
}
