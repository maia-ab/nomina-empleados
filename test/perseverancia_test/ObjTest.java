package perseverancia_test;

import org.junit.Assert;
import org.junit.Test;

import perseverancia.EmpleadoPermanente;
import perseverancia.EmpleadoTemporal;
import perseverancia.Gerente;

public class ObjTest {
	@Test
	public void empleadoTemporalCon80HsEsposaYSinHijosCobra161000() {
		int valorEsperado = 161000;
		int valorObtenido = 0;
		EmpleadoTemporal empleadoTemp =  new EmpleadoTemporal(80, Boolean.TRUE, 0);
		//
		valorObtenido = empleadoTemp.verSueldo();
		//
		Assert.assertEquals(valorEsperado, valorObtenido);			
	}
	@Test
	public void empleadoPermanenteCon80HsEsposa2HijosY6AniosDeAntiguedadCobra251000() {
		int valorEsperado = 251000;
		int valorObtenido = 0;
		EmpleadoPermanente empleadoPer =  new EmpleadoPermanente(80, Boolean.TRUE, 2, 6);
		//
		valorObtenido = empleadoPer.verSueldo();
		//
		Assert.assertEquals(valorEsperado, valorObtenido);			
	}
	@Test
	public void empleadoPermanenteCon160HsSinEsposaSinHijosY4AniosDeAntiguedadCobra484000() {
		int valorEsperado = 484000;
		int valorObtenido = 0;
		EmpleadoPermanente empleadoPer =  new EmpleadoPermanente(160, Boolean.FALSE, 0, 4);
		//
		valorObtenido = empleadoPer.verSueldo();
		//
		Assert.assertEquals(valorEsperado, valorObtenido);			
	}
	@Test
	public void gerenteCon160HsConEsposa1HijoY10AniosDeAntiguedadCobra658000() {
		int valorEsperado = 658000;
		int valorObtenido = 0;
		Gerente gerente =  new Gerente(160, Boolean.TRUE, 1, 10);
		//
		valorObtenido = gerente.verSueldo();
		//
		Assert.assertEquals(valorEsperado, valorObtenido);			
	}
}
