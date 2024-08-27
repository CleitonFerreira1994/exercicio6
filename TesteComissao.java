import java.util.*;
import java.lang.*;
import java.io.*;

public class TesteComissao {
    public static void main(String[] args) {
        Comissao gerente = new Gerente(5000.00);
        Comissao vendedor = new Vendedor(3000.00);
        Comissao supervisor = new Supervisor(4000.00);

        System.out.println("Salário do Gerente: R$ " + gerente.calcularSalario());
        System.out.println("Salário do Vendedor: R$ " + vendedor.calcularSalario());
        System.out.println("Salário do Supervisor: R$ " + supervisor.calcularSalario());
    }
}

