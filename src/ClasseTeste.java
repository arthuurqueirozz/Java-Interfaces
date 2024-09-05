import interfaces.CanetaEsferografica;
import interfaces.ICaneta;

public class ClasseTeste {

    public static void main (String args[]) {

        ICaneta caneta = new CanetaEsferografica();
        caneta.escrever("hello, world!");
        System.out.println(caneta.getCor());
    }
}
