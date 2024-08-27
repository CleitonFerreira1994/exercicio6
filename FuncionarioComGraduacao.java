import java.util.*;
import java.lang.*;
import java.io.*;

public class FuncionarioComGraduacao extends FuncionarioComEnsinoMedio {
    private String universidade;

    public FuncionarioComGraduacao(String nome, String codigoFuncional, String escolaBasico, String escolaMedio, String universidade) {
        super(nome, codigoFuncional, escolaBasico, escolaMedio);
        this.universidade = universidade;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

    public double calcularRendaTotal() {
        return super.calcularRendaTotal() * 2.00; // 100% a mais
    }

    public String toString() {
        return super.toString() + ", Universidade: " + universidade;
    }
}





