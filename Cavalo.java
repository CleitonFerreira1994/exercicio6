import java.util.*;
import java.lang.*;
import java.io.*;

public class Cavalo extends Animal {
    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    public void emitirSom() {
        System.out.println("Relinchando");
    }

    public void correr() {
        System.out.println("O cavalo está correndo.");
    }
}
