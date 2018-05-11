package ual.hmis.asignatura;

import java.util.ArrayList;
import java.util.*;

public class Alumno {

	private String nombre;
	private ArrayList<Actividad> actividadesAsignadas;


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Actividad> getActividadesAsignadas() {
		return actividadesAsignadas;
	}

	public void setActividadesAsignadas(ArrayList<Actividad> actividadesAsignadas) {
		this.actividadesAsignadas = actividadesAsignadas;
	}

	public double calcularNotaActividad(String nombreActividad) {
		int puntTotal=0;
		// Comprobamos si existe la actividad
		for (Actividad a : actividadesAsignadas) {
			// Coincide con la actividad mencionada
			if(a.getNombre().equals(nombreActividad)){
				// Comprueba los ejercicios que hay
				for (Ejercicio e : a.getEjercicios()) {
					puntTotal+=e.getPuntuacion();
				}
				a.setPuntuacionTotal(puntTotal);
				break;
			}
		}
		return puntTotal;
	}

}
