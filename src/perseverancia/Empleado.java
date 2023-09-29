package perseverancia;

abstract public class Empleado {
	int horasTrabajadas;
	Boolean esposa;
	int hijos;
	int sueldoPorHora;
	
	public int salarioFamiliar() {
		int salida = hijos*2000;
		if (esposa) {
			salida += 1000;
		}
		return salida;
		
	}
	
	abstract public int verSueldo();
	}
