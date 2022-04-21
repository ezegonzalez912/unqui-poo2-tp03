package ar.unq.tp3.ej02;

import java.util.ArrayList;

public class Counter {

    public int mayorNumeroConDigitosParesDe(ArrayList<Integer> numerosList) {

        if(numerosList.isEmpty()) return 0;

        int numeroActual = 0;

        for (Integer numero : numerosList) {
            if(digitosParesDe(numero) >= digitosParesDe(numeroActual)) {
                numeroActual = numero;
            }
        }

        return numeroActual;
    }

    public int digitosParesDe(int numero) {

        int contador = 0;
        int ultimoDigito;

        while(numero > 0) {
            ultimoDigito = numero % 10;

            if(ultimoDigito % 2 == 0) contador++;
            numero/=10;
        }

        return contador;
    }

}
