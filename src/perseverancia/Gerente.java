package perseverancia;

public class Gerente extends EmpleadoPermanente{

	public Gerente(int horas, Boolean esposa, int hijos, int antiguedad) {
		super(horas, esposa, hijos, antiguedad);
		super.sueldoPorHora = 4000;
		super.sueldoPorAntiguedad = 1500;
	}
	

}
