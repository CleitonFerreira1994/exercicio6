import java.util.*;
import java.lang.*;
import java.io.*;

public class Gerente extends Comissao {
    private static final double ADICIONAL_GERENTE = 0.20; // 20%

    public Gerente(double salarioBase) {
        super(salarioBase);
    }

    public double calcularSalario() {
        return salarioBase * (1 + ADICIONAL_GERENTE);
    }

    public String toString() {
        return "Gerente: " + super.toString() + ", Adicional: 20%";
    }
}
