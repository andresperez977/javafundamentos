package com.carrental;

public class SUV extends Vehiculo {
	public SUV(String marca, String modelo, double precioDia) {
        super(marca, modelo, precioDia);
    }

    @Override
    public double calcularCosto(int dias) {
        // recargo del 10% por ser SUV
        return getPrecioDia() * dias * 1.1;
    }
}
