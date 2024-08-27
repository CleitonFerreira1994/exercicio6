import java.util.*;
import java.lang.*;
import java.io.*;

public class Supervisor extends Comissao {
    private static final double ADICIONAL_SUPERVISOR = 0.10; // 10%

    public Supervisor(double salarioBase) {
        super(salarioBase);
    }

    public double calcularSalario() {
        return salarioBase * (1 + ADICIONAL_SUPERVISOR);
    }

    public String toString() {
        return "Supervisor: " + super.toString() + ", Adicional: 10%";
    }
}

