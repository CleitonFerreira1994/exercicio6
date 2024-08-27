import java.util.*;
import java.lang.*;
import java.io.*;

public class Vendedor extends Comissao {
    private static final double ADICIONAL_VENDEDOR = 0.15; // 15%

    public Vendedor(double salarioBase) {
        super(salarioBase);
    }

    public double calcularSalario() {
        return salarioBase * (1 + ADICIONAL_VENDEDOR);
    }

    public String toString() {
        return "Vendedor: " + super.toString() + ", Adicional: 15%";
    }
}
