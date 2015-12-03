package controlador;
import java.util.Date;
import java.util.Vector;

import modelo.Alquiler;
import modelo.Auto;
import modelo.AutoDeportivo;
import modelo.AutoSedan;

public class EmpresaAlquiler {

	private Vector<Auto> autos;
	private Vector<Alquiler> alquileres;
	
	public EmpresaAlquiler() {
		super();
		this.autos = new Vector<Auto>();
		this.alquileres = new Vector<Alquiler>();
	}
	
	private Auto buscarAuto(String patente){
		Auto auto = null;
		for(Auto a: this.autos){
			if(a.getPatente().equalsIgnoreCase(patente)){
				auto = a;
			}
		}
		return auto;
	}
	
	public boolean existeAuto(String patente){
		Auto auto = this.buscarAuto(patente);
		return (auto != null) ? true : false;		
	}
	
	public void crearAutoDeportivo(String patente, String modelo, int capacidad, float precioPorKm, float precioAdicional){
		boolean existeAuto = this.existeAuto(patente);
		if(!existeAuto){
			AutoDeportivo autoDeportivo = new AutoDeportivo(patente, modelo, capacidad, precioPorKm, precioAdicional);
			this.autos.add(autoDeportivo);
			System.out.println("El auto " +  patente + " ha sido creado con éxito.");
		}
		System.out.println("El auto " + patente + " ya existe.");
	}
	
	public void crearAutoSedan(String patente, String modelo, int capacidad, float precioPorKm){
		boolean existeAuto = this.existeAuto(patente);
		if(!existeAuto){
			AutoSedan autoSedan = new AutoSedan(patente, modelo, capacidad, precioPorKm);
			this.autos.add(autoSedan);
			System.out.println("El auto " +  patente + " ha sido creado con éxito.");
		}
		System.out.println("El auto " + patente + " ya existe.");
	}

	public int registrarAlquiler(String patente, Date fechaDesde, Date fechaHasta, float precioKm){		
		Auto auto = this.buscarAuto(patente);
		if(auto != null && auto.getDisponible()){
			Alquiler alquiler = new Alquiler(auto, fechaDesde, fechaHasta, precioKm);
			this.alquileres.add(alquiler);
			auto.setDisponible(false);
			return alquiler.getNumero();
		}
		return -1;
	}
	
	private Alquiler buscarAlquiler(int numero){
		Alquiler alquiler = null;
		for(Alquiler a: alquileres){
			if(a.getNumero() == numero){
				alquiler = a;
			}
		}
		return alquiler;
	}
	
	public float confirmarAlquiler(int numero){
		Alquiler alquiler = this.buscarAlquiler(numero);
		if(alquiler != null){
			return alquiler.getMontoAlquiler();
		}
		return 0;
	}
}