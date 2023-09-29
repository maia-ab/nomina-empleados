package perseverancia;

public class EmpleadoPermanente extends Empleado{
	int antiguedad;
	int sueldoPorAntiguedad = 1000;

	public EmpleadoPermanente(int horas, Boolean esposa, int hijos, int antiguedad) {
		super.horasTrabajadas = horas;
		super.esposa = esposa;
		super.hijos = hijos;
		this.antiguedad = antiguedad;
		super.sueldoPorHora = 3000;
		
	}
	@Override
	public int verSueldo(){
		 return salarioFamiliar() + horasTrabajadas*sueldoPorHora + antiguedad * sueldoPorAntiguedad;
	}
}
