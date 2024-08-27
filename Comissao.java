import java.util.*;
import java.lang.*;
import java.io.*;

public class Comissao {
    protected double salarioBase;

    public Comissao(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public String toString() {
        return String.format("Salário Base: R$ %.2f", salarioBase);
    }
}
