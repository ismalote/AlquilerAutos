package modelo;

public abstract class Auto {
	
	protected String patente;
	protected String modelo;
	protected int capacidad;
	protected float precioPorKm;
	protected boolean disponible;
	
	public Auto(String patente, String modelo, int capacidad, float precioPorKm) {
		super();
		this.patente = patente;
		this.modelo = modelo;
		this.capacidad = capacidad;
		this.precioPorKm = precioPorKm;
		this.disponible = true;
	}
	
	public abstract float calcularMonto();

	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public float getPrecioPorKm() {
		return precioPorKm;
	}
	public void setPrecioPorKm(float precioPorKm) {
		this.precioPorKm = precioPorKm;
	}
	public boolean getDisponible(){
		return disponible;
	}
	public void setDisponible(boolean disponible){
		this.disponible = disponible;
	}
	
}
