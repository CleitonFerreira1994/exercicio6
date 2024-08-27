import java.util.*;
import java.lang.*;
import java.io.*;

public class Zoologico {
    private Animal[] jaulas;

    public Zoologico() {
        jaulas = new Animal[10];
        inicializarJaulas();
    }

    private void inicializarJaulas() {
        jaulas[0] = new Cachorro("Rex", 4);
        jaulas[1] = new Cavalo("Luna", 6);
        jaulas[2] = new Preguica("Sid", 3);
        jaulas[3] = new Cachorro("Max", 5);
        jaulas[4] = new Cavalo("Mango", 7);
        jaulas[5] = new Preguica("Bella", 4);
        jaulas[6] = new Cachorro("Thor", 2);
        jaulas[7] = new Cavalo("Nina", 5);
        jaulas[8] = new Preguica("Lola", 6);
        jaulas[9] = new Cachorro("Charlie", 3);
    }

    public void percorrerJaulas() {
        for (Animal animal : jaulas) {
            animal.emitirSom();
            animal.correr();
            if (animal instanceof Preguica) {
                ((Preguica) animal).subirEmArvores();
            }
        }
    }
}
