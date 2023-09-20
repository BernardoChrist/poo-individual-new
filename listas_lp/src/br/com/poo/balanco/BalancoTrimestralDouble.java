package br.com.poo.balanco;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BalancoTrimestralDouble {
	
	private Double gastosJaneiro = 15000.00;
	private Double gastosFevereiro = 23000.00;
	private Double gastosMarco = 17000.00;
	
	private Double somaTotal = gastosJaneiro + gastosFevereiro + gastosMarco;
	private static Logger logger = Logger.getLogger(BalancoTrimestralDouble.class.getName());
	
	public double soma() {
		logger.log(Level.INFO, "O balanço trimestral é de R$ " + somaTotal);
		return somaTotal;
	}

	public double soma(double janeiro) {
		logger.log(Level.INFO, "Os gastos de janeiro é de R$ " + janeiro);
		return janeiro;
	}
}
