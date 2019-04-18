package modelo;
import java.text.NumberFormat;
import java.util.Locale;
public class Metodos {
	
	private NumberFormat formato= NumberFormat.getCurrencyInstance(Locale.US);
	private int cuotas = 0;
	private double interes = 0;
	private double inversion = 0;
	private double tasaEfectiva=0;
	private double valorAnualidad = 0;
	private double valorCuota = 0;
	private double saldoEnPesos = 0;
	private double cuotaEnPesos = 0;
	private double interesAmortizacion = 0;
	private double amortizacion = 0;
	private String moneda = null;
	
	public Metodos() {
	}
	
	public double calcularTasaEfectiva(double interes) {
		
		tasaEfectiva = Math.pow(1+interes, 0.083333333)-1;
		double resultado = tasaEfectiva * 100;
		resultado = Math.round(resultado * 100d)/100d;
		return resultado;
	}
	
	public double calcularValorAnualidad(double tasaEfectiva, int cuotas) {
		
		valorAnualidad = (1-(Math.pow(1+tasaEfectiva, (-1* cuotas)))) / tasaEfectiva;	 
		return valorAnualidad;
	}
	
	public String calcularValorCuota(double inversion, double valorAnualidad) {
		valorCuota = (inversion / valorAnualidad);
		moneda = formato.format(valorCuota);
		return moneda;
	}
	
	public double calcularTablaAmortizacion() {
		
		if(cuotas != 0) {
			cuotaEnPesos = (inversion - valorAnualidad);
			interesAmortizacion = (tasaEfectiva * saldoEnPesos);
			amortizacion = (cuotaEnPesos - interesAmortizacion);
			saldoEnPesos = (saldoEnPesos - amortizacion);
		} else 
			if (cuotas == 0) {
				saldoEnPesos = inversion;
				cuotaEnPesos = 0;
				interesAmortizacion = 0;
				amortizacion = 0;
			}
		return 0;
		
	}

	public NumberFormat getFormato() {
		return formato;
	}

	public void setFormato(NumberFormat formato) {
		this.formato = formato;
	}

	public int getCuotas() {
		return cuotas;
	}

	public void setCuotas(int cuotas) {
		this.cuotas = cuotas;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public double getInversion() {
		return inversion;
	}

	public void setInversion(double inversion) {
		this.inversion = inversion;
	}

	public double getTasaEfectiva() {
		return tasaEfectiva;
	}

	public void setTasaEfectiva(double tasaEfectiva) {
		this.tasaEfectiva = tasaEfectiva;
	}

	public double getValorAnualidad() {
		return valorAnualidad;
	}

	public void setValorAnualidad(double valorAnualidad) {
		this.valorAnualidad = valorAnualidad;
	}

	public double getValorCuota() {
		return valorCuota;
	}

	public void setValorCuota(double valorCuota) {
		this.valorCuota = valorCuota;
	}

	public double getSaldoEnPesos() {
		return saldoEnPesos;
	}

	public void setSaldoEnPesos(double saldoEnPesos) {
		this.saldoEnPesos = saldoEnPesos;
	}

	public double getCuotaEnPesos() {
		return cuotaEnPesos;
	}

	public void setCuotaEnPesos(double cuotaEnPesos) {
		this.cuotaEnPesos = cuotaEnPesos;
	}

	public double getInteresAmortizacion() {
		return interesAmortizacion;
	}

	public void setInteresAmortizacion(double interesAmortizacion) {
		this.interesAmortizacion = interesAmortizacion;
	}

	public double getAmortizacion() {
		return amortizacion;
	}

	public void setAmortizacion(double amortizacion) {
		this.amortizacion = amortizacion;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
}