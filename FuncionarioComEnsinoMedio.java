import java.util.*;
import java.lang.*;
import java.io.*;

public class FuncionarioComEnsinoMedio extends FuncionarioComEnsinoBasico {
    private String escolaMedio;

    public FuncionarioComEnsinoMedio(String nome, String codigoFuncional, String escolaBasico, String escolaMedio) {
        super(nome, codigoFuncional, escolaBasico);
        this.escolaMedio = escolaMedio;
    }

    public String getEscolaMedio() {
        return escolaMedio;
    }

    public void setEscolaMedio(String escolaMedio) {
        this.escolaMedio = escolaMedio;
    }

    public double calcularRendaTotal() {
        return super.calcularRendaTotal() * 1.50; // 50% a mais
    }

    public String toString() {
        return super.toString() + ", Escola Ensino Médio: " + escolaMedio;
    }
}
