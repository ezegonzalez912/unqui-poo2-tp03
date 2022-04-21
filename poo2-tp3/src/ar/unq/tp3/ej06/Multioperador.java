package ar.unq.tp3.ej06;

import java.util.ArrayList;

public class Multioperador {

	private ArrayList<Integer> listaDeNumeros = new ArrayList<Integer>();   
	
	public ArrayList<Integer> getListaDeNumeros() {
		return listaDeNumeros;
	}
	
	public void addNumber(int numero) {
		listaDeNumeros.add(numero);
	}
	
	public int sumarEnteros() {
		
		int resultado = 0;
		
		for (Integer numero : getListaDeNumeros()) {
			resultado = resultado + numero;
		}
		
		return resultado;
	}
	
	public int restarNumeros() {
		
		int resultado = 0;
		
		for (Integer numero : getListaDeNumeros()) {
			resultado = resultado - numero;
		}
		
		return resultado;
	}
	
	public int multiplicarNumeros() {
		
		if(getListaDeNumeros().isEmpty()) {
			return 0;
		}
		
		int resultado = 1;
		
		for (Integer numero : getListaDeNumeros()) {
			resultado = resultado * numero;
		}
		
		return resultado;
	}
}
