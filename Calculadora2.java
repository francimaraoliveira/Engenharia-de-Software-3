public class Calculadora2 {
	
	private double valor1;
	private double valor2;
	private double valorTotal;
	
	public Calculadora2(double valor1, double valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}
	
	public void calular() throws RuntimeException {
		if(this.valor1 ==0 || this.valor2 == 0 ) {
			throw new RuntimeException("Não é possível calcular.");
		}
		valorTotal = valor1 + valor2;
	}
	
	public double getValorTotal() {
		return valorTotal;
	}
}