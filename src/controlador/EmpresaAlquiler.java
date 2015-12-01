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
		autos = new Vector<Auto>();
		alquileres = new Vector<Alquiler>();
	}
	
	private Auto buscarAuto(String patente){
		Auto auto = null;
		
		for(int i=0; i<autos.size() && auto == null; i++){
			if(autos.get(i).getPatente().equalsIgnoreCase(patente)){
				auto = autos.get(i);
			}
		}
		
		return auto;
	}
	
	public boolean existeAuto(String patente){
		boolean exist = false;
		
		for(int i = 0; i<autos.size() && !exist; i++){
			if(autos.get(i).getPatente().equalsIgnoreCase(patente)){
				exist = true;
			}
		}
		
		return exist;
	}
	
	public void crearAutoDeportivo(String patente, String modelo, int capacidad, float precioKm, float precioAdicional){
		Auto auto = buscarAuto(patente);
		
		if(auto == null){
			auto = new AutoDeportivo(patente, modelo, capacidad, precioKm, precioAdicional);
			
			autos.add(auto);
		}else{
			System.out.println("El auto ya existe");
		}
	}
	
	public void crearAutoSedan(String patente, String modelo, int capacidad, float precioKm){
		Auto auto = buscarAuto(patente);
		
		if(auto == null){
			auto = new AutoSedan(patente, modelo, capacidad, precioKm);
			
			autos.add(auto);
		}else{
			System.out.println("El auto ya existe");
		}
	}
	
	public int registrarAlquiler(String patente, Date fechaDesde, Date fechaHasta, float km){
		Auto auto = buscarAuto(patente);
		
		if(auto != null){
			Alquiler alquiler = new Alquiler(auto, fechaDesde, fechaHasta, km);
			
			alquileres.add(alquiler);
			
			return 1;
		}
		
		return 0;
	}
	
	public float confirmarAlquiler(int numero){
		Alquiler alquiler = buscarAlquiler(numero);
		float monto = 0;
		
		
		if(alquiler != null){
			monto = alquiler.getMontoAlquiler();
		}
		
		return monto;
	}

	private Alquiler buscarAlquiler(int numero) {
		Alquiler alquiler = null;
		
		for(int i=0; i<alquileres.size() && alquiler == null; i++){
			if(alquileres.get(i).getNumero() == numero){
				alquiler = alquileres.get(i);
			}
		}
		
		return alquiler;
	}
	
}
