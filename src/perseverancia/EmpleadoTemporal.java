package perseverancia;

public class EmpleadoTemporal extends Empleado{
	
	public EmpleadoTemporal(int horas, Boolean esposa, int hijos) {
		super.horasTrabajadas = horas;
		super.esposa = esposa;
		super.hijos = hijos;
		super.sueldoPorHora = 2000;
	}
	@Override
	public int verSueldo(){
		 return salarioFamiliar() + horasTrabajadas*sueldoPorHora;
	}
	
}
