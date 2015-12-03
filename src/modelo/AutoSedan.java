package modelo;

public class AutoSedan extends Auto {

	public AutoSedan(String patente, String modelo, int capacidad, float precioPorKm) {
		super(patente, modelo, capacidad, precioPorKm);
	}

	public float calcularMonto() {
		return precioPorKm;
	}

}
