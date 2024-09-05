import interfaces.CanetaEsferografica;
import interfaces.Giz;
import interfaces.ICaneta;
import interfaces.Lapis;

public class ClasseTeste {

    public static void main (String[] args) {

        ICaneta caneta = new CanetaEsferografica();
        caneta.escrever("hello, world!");
        System.out.println(caneta.getCor());

        ICaneta giz = new Giz();
        giz.escrever("hello, world!");
        giz.escreverComumAtodas();
        System.out.println(giz.getCor());

        ICaneta lapis = new Lapis();
        lapis.escrever("hello, world!");
        lapis.escreverComumAtodas();
        System.out.println(lapis.getCor());
    }
}
