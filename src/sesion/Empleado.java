package sesion;

public class Empleado {

	public enum TipoEmpleado {
		Vendedor, Encargado
	}

	float salarioBase = 0;
	float primas = 0;
	float extras = 0;

	public float CalculoNominaBruta(TipoEmpleado tipo, float ventaMes, float horasExtras) {

		// Determinar salario base
		if (tipo == TipoEmpleado.Vendedor) {
			salarioBase = 2000;
		} else if (tipo == TipoEmpleado.Encargado) {
			salarioBase = 2500;
		}

		// Determinar primas
		if (ventaMes >= 1500) {
			primas = 200;
		} else if (ventaMes >= 1000) {
			primas = 100;
		}

		// Determinar horas extras
		extras = horasExtras * 30;

		return salarioBase + primas + extras;

	}

	public float CalculoNominaNeta(float nominaBruta) {

		float retencion = 0;
		
		if(nominaBruta >= 2500) {
			retencion = 0.18f;
		} else if(nominaBruta >= 2100) {
			retencion = 0.15f;
		}
		
		return nominaBruta*(1-retencion);
		
	}

}
