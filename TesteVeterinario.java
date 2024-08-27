import java.util.*;
import java.lang.*;
import java.io.*;

public class TesteVeterinario {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex", 4);
        Animal cavalo = new Cavalo("Spirit", 6);
        Animal preguica = new Preguica("Sid", 3);

        Veterinario veterinario = new Veterinario();

        System.out.println("Examinando animais:");
        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);
    }
}
