import java.util.*;
import java.lang.*;
import java.io.*;

public class FuncionarioComEnsinoBasico extends Funcionario {
    private String escolaBasico;

    public FuncionarioComEnsinoBasico(String nome, String codigoFuncional, String escolaBasico) {
        super(nome, codigoFuncional);
        this.escolaBasico = escolaBasico;
    }

    public String getEscolaBasico() {
        return escolaBasico;
    }

    public void setEscolaBasico(String escolaBasico) {
        this.escolaBasico = escolaBasico;
    }

    public double calcularRendaTotal() {
        return super.calcularRendaTotal() * 1.10; // 10% a mais
    }

    public String toString() {
        return super.toString() + ", Escola Ensino Básico: " + escolaBasico;
    }
}
