package com.carrental;

public class Sedan extends Vehiculo {
	 public Sedan(String marca, String modelo, double precioDia) {
	        super(marca, modelo, precioDia);
	    }

	    public double calcularCosto(int dias) {
	        return getPrecioDia() * dias;
	    }
}
