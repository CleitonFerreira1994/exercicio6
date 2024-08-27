import java.util.*;
import java.lang.*;
import java.io.*;

public class Preguica extends Animal {
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    public void emitirSom() {
        System.out.println("Emitindo som");
    }

    public void correr() {
        System.out.println("A preguiça se move lentamente.");
    }

    public void subirEmArvores() {
        System.out.println("A preguiça está subindo em uma árvore.");
    }
}
