import java.util.*;
import java.lang.*;
import java.io.*;

public class Funcionario {
    private String nome;
    private String codigoFuncional;
    private double salarioBase = 1000.00; // Renda básica
    private Comissao comissao; // Atributo para armazenar a comissão

    public Funcionario(String nome, String codigoFuncional, Comissao comissao) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.comissao = comissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setCodigoFuncional(String codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }

    public Comissao getComissao() {
        return comissao;
    }

    public void setComissao(Comissao comissao) {
        this.comissao = comissao;
    }

    public double calcularRendaTotal() {
        double rendaTotal = salarioBase;
        if (comissao != null) {
            rendaTotal = comissao.calcularSalario();
        }
        return rendaTotal;
    }

    public String toString() {
        String tipoComissao = comissao != null ? comissao.getClass().getSimpleName() : "Nenhuma comissão";
        return String.format("Nome: %s, Comissão: %s, Salário Total: R$ %.2f", nome, tipoComissao, calcularRendaTotal());
    }
}
