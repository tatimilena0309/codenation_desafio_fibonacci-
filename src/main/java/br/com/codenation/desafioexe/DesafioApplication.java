package br.com.codenation.desafioexe;

import java.util.List;
import java.util.ArrayList;

public class DesafioApplication {

    static Integer numero1 = 0;
    static Integer numero2 = 1;
    static Integer proximoSequencia = 0;
    static Integer limite = 350;
    static List<Integer> lista = new ArrayList<Integer>();

    public static List<Integer> fibonacci() {
        for (int i = 0; proximoSequencia <= limite; i++) {
            if (i == 0) {
                lista.add(numero1);
                lista.add(numero2);
            }
            proximoSequencia = numero1 + numero2;
            lista.add(proximoSequencia);
            numero1 = numero2;
            numero2 = proximoSequencia;
        }
        return lista;
    }

    public static Boolean isFibonacci(Integer a) {
        return fibonacci().contains(a);
    }
}
