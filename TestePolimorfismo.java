import java.util.*;
import java.lang.*;
import java.io.*;

public class TestePolimorfismo {
    public static void main(String[] args) {
        Animal[] animais = new Animal[] {
            new Cachorro("Rex", 4),
            new Cavalo("Spirit", 6),
            new Preguica("Sid", 3)
        };

        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}
