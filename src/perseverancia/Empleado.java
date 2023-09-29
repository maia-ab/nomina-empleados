package perseverancia;

abstract public class Empleado {
	protected int horasTrabajadas;
	protected Boolean esposa;
	protected int hijos;
	protected int sueldoPorHora;
	
	public int salarioFamiliar() {
		int salida = hijos*2000;
		if (esposa) {
			salida += 1000;
		}
		return salida;
		
	}
	
	abstract public int verSueldo();
	}
