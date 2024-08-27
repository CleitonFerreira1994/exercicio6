import java.util.*;
import java.lang.*;
import java.io.*;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Ana", "001");
        FuncionarioComEnsinoBasico funcionario2 = new FuncionarioComEnsinoBasico("Bruno", "002", "Escola A");
        FuncionarioComEnsinoMedio funcionario3 = new FuncionarioComEnsinoMedio("Carlos", "003", "Escola B", "Escola C");
        FuncionarioComGraduacao funcionario4 = new FuncionarioComGraduacao("Diana", "004", "Escola D", "Escola E", "Universidade F");

        System.out.println(funcionario1);
        System.out.println(funcionario2);
        System.out.println(funcionario3);
        System.out.println(funcionario4);
    }
}






