import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Random;

public class TesteEmpresa {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[10];

        // Criar os funcionários com a distribuição especificada
        for (int i = 0; i < 10; i++) {
            String nome = "Funcionario" + (i + 1);
            String codigoFuncional = String.format("%03d", i + 1);
            Comissao comissao = null;

            // Definir a comissão com base nas porcentagens
            if (i < 1) { // 10% Gerentes
                comissao = new Gerente(5000.00);
            } else if (i < 3) { // 20% Supervisores
                comissao = new Supervisor(4000.00);
            } else { // 70% Vendedores
                comissao = new Vendedor(3000.00);
            }

            funcionarios[i] = new Funcionario(nome, codigoFuncional, comissao);
        }

        // Exibir informações dos funcionários
        double custoTotal = 0;
        double custoGerentes = 0;
        double custoSupervisores = 0;
        double custoVendedores = 0;

        for (Funcionario f : funcionarios) {
            System.out.println(f);
            double rendaTotal = f.calcularRendaTotal();
            custoTotal += rendaTotal;

            if (f.getComissao() instanceof Gerente) {
                custoGerentes += rendaTotal;
            } else if (f.getComissao() instanceof Supervisor) {
                custoSupervisores += rendaTotal;
            } else if (f.getComissao() instanceof Vendedor) {
                custoVendedores += rendaTotal;
            }
        }

        System.out.println("Custo total da empresa: R$ " + custoTotal);
        System.out.println("Custo total com Gerentes: R$ " + custoGerentes);
        System.out.println("Custo total com Supervisores: R$ " + custoSupervisores);
        System.out.println("Custo total com Vendedores: R$ " + custoVendedores);
    }
}
