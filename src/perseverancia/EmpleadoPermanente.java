package perseverancia;

public class EmpleadoPermanente extends Empleado{
	int antiguedad;

	public EmpleadoPermanente(int horas, Boolean esposa, int hijos, int antiguedad) {
		super.horasTrabajadas = horas;
		super.esposa = esposa;
		super.hijos = hijos;
		this.antiguedad = antiguedad;
		super.sueldoPorHora = 3000;
	}
	
	@Override
	public int verSueldo() {
		return horasTrabajadas*3000 + antiguedad*1000 + this.salarioFamiliar();
	}
}
