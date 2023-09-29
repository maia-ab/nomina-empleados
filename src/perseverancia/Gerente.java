package perseverancia;

public class Gerente extends EmpleadoPermanente{

	public Gerente(int horas, Boolean esposa, int hijos, int antiguedad) {
		super(horas, esposa, hijos, antiguedad);
		super.sueldoPorHora = 4000;
	}
	
	@Override
	public int verSueldo() {
		
		return horasTrabajadas*4000 + antiguedad*1500 + this.salarioFamiliar();
	}

}
