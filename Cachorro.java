import java.util.*;
import java.lang.*;
import java.io.*;

public class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    public void emitirSom() {
        System.out.println("Latindo");
    }

    public void correr() {
        System.out.println("O cachorro está correndo.");
    }
}
