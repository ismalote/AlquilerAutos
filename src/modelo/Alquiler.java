package modelo;

import java.util.Date;

public class Alquiler {
	
	private int numero;
	private Auto auto;
	private Date fechaDesde;
	private Date fechaHasta;
	private float montoAlquiler;
	private float kmRecorridos;
	private static int proximoNumero;
	
	public Alquiler(Auto auto, Date fechaDesde, Date fechaHasta,
			float kmRecorridos) {
		super();
		this.auto = auto;
		this.fechaDesde = fechaDesde;
		this.fechaHasta = fechaHasta;
		this.kmRecorridos = kmRecorridos;
		this.numero = incrementarProximoNumero();
	}
	
	private int incrementarProximoNumero() {
		return ++proximoNumero;
	}

	public Auto getAuto() {
		return auto;
	}

	public void setAuto(Auto auto) {
		this.auto = auto;
	}

	public Date getFechaDesde() {
		return fechaDesde;
	}

	public void setFechaDesde(Date fechaDesde) {
		this.fechaDesde = fechaDesde;
	}

	public Date getFechaHasta() {
		return fechaHasta;
	}

	public void setFechaHasta(Date fechaHasta) {
		this.fechaHasta = fechaHasta;
	}

	public float getMontoAlquiler() {
		return (kmRecorridos * (auto.calcularMonto()));
	}

	public void setMontoAlquiler(float montoAlquiler) {
		this.montoAlquiler = montoAlquiler;
	}

	public float getKmRecorridos() {
		return kmRecorridos;
	}

	public void setKmRecorridos(float kmRecorridos) {
		this.kmRecorridos = kmRecorridos;
	}

	public static int getNumero() {
		return 0;
	}
	
	
}
