package br.com.poo.balanco;

public class BalancoTrimestral {

	public static void main(String[] args) {
		
		//instancia do balanco Integer
		//instancia, quando coloca o new e o construtor
		BalancoTrimestralInt bti = new BalancoTrimestralInt();
		bti.soma();
		/*bti.soma(10000);
		bti.soma(15000, 25000);
		bti.soma(12000, 13000, 17000);*/
		
		//instancia do balanco double
		BalancoTrimestralDouble btd = new BalancoTrimestralDouble();
	}

}
