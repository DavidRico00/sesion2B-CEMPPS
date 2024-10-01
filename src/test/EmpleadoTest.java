package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import sesion.Empleado;
import sesion.Empleado.TipoEmpleado;

class EmpleadoTest {

	private Empleado emp = new Empleado();

	private TipoEmpleado tipo;
	private float ventaMes, horasMes;
	private float sueldoBruto;

	private float expected;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {

	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalculoNominaBrutaVendedor1600ventas() {

		tipo = TipoEmpleado.Vendedor;
		ventaMes = 1600;
		horasMes = 2;

		expected = 2260;

		assertEquals(expected, emp.CalculoNominaBruta(tipo, ventaMes, horasMes));

	}

	@Test
	void testCalculoNominaBrutaVendedor1200ventas() {

		tipo = TipoEmpleado.Vendedor;
		ventaMes = 1200;
		horasMes = 0;

		expected = 2100;

		assertEquals(expected, emp.CalculoNominaBruta(tipo, ventaMes, horasMes));

	}

	@Test
	void testCalculoNominaBrutaVendedor400ventas() {

		tipo = TipoEmpleado.Vendedor;
		ventaMes = 400;
		horasMes = 5;

		expected = 2150;

		assertEquals(expected, emp.CalculoNominaBruta(tipo, ventaMes, horasMes));

	}

	@Test
	void testCalculoNominaBrutaEncargado1800ventas() {

		tipo = TipoEmpleado.Encargado;
		ventaMes = 1800;
		horasMes = 1;

		expected = 2730;

		assertEquals(expected, emp.CalculoNominaBruta(tipo, ventaMes, horasMes));

	}

	@Test
	void testCalculoNominaBrutaEncargado1450ventas() {

		tipo = TipoEmpleado.Encargado;
		ventaMes = 1450;
		horasMes = 1;

		expected = 2630;

		assertEquals(expected, emp.CalculoNominaBruta(tipo, ventaMes, horasMes));

	}

	@Test
	void testCalculoNominaBrutaEncargado400ventas() {

		tipo = TipoEmpleado.Encargado;
		ventaMes = 400;
		horasMes = 0;

		expected = 2500;

		assertEquals(expected, emp.CalculoNominaBruta(tipo, ventaMes, horasMes));

	}

	@Test
	void testCalculoNominaBrutaSintipo1900ventas() {

		tipo = null;
		ventaMes = 1900;
		horasMes = 2;

		expected = 260;

		assertEquals(expected, emp.CalculoNominaBruta(tipo, ventaMes, horasMes));

	}

	@Test
	void testCalculoNominaNeta2500() {

		sueldoBruto = 2500;

		expected = 2050;

		assertEquals(expected, emp.CalculoNominaNeta(sueldoBruto));

	}

	@Test
	void testCalculoNominaNeta2100() {

		sueldoBruto = 2100;

		expected = 1785;

		assertEquals(expected, emp.CalculoNominaNeta(sueldoBruto));
	}

	@Test
	void testCalculoNominaNeta1900() {

		sueldoBruto = 1900;

		expected = 1900;

		assertEquals(expected, emp.CalculoNominaNeta(sueldoBruto));

	}

}
