package modelo;

public class AutoDeportivo extends Auto {
	
	private float precioAdicional;

	public AutoDeportivo(String patente, String modelo, int capacidad, float precioPorKm, float precioAdicional) {
		super(patente, modelo, capacidad, precioPorKm);
		this.precioAdicional = precioAdicional;
	}
	
	public float calcularMonto() {
		return precioPorKm + precioAdicional;
	}
	public float getPrecioAdicional() {
		return precioAdicional;
	}
	public void setPrecioAdicional(float precioAdicional) {
		this.precioAdicional = precioAdicional;
	}

}
