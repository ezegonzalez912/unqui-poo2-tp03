package ar.unq.tp3.ej01;

import java.util.ArrayList;
import java.util.List;

public class Counter {

    private List<Integer> numeros = new ArrayList<>();

    public List<Integer> getNumeros() {
        return numeros;
    }

    public List<Integer> addNumber(Integer numero) {
        getNumeros().add(numero);
        return getNumeros();
    }

    public int cantidadDePares() {

        int contador = 0;

        for (Integer numero : getNumeros()) {
            if(numero % 2 == 0) contador++;
        }

        return contador;
    }

    public int cantidadDeImpares() {
        return numeros.size() - cantidadDePares();
    }

    public int cantidadDeMultiplosDe(int i) {
        int contador = 0;

        for (Integer numero : getNumeros()) {
            if(numero % i == 0) contador++;
        }

        return contador;
    }

}
