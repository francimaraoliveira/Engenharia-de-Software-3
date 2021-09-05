public class Calculadora {
	
	private double valor1;                                                                                                                 
	private double valor2;                                                                                                                 
	private double valorTotal;                                                                                                                     
	                                                                                                                                       
	public Calculadora(double valor1, double valor2) {                                                                                     
		this.valor1 = valor1;                                                                                                              
		this.valor2 = valor2;                                                                                                              
	}                                                                                                                                      
	                                                                                                                                       
	public void calcular() {                                                                                                                
		valorTotal = valor1 + valor2;                                                                                                      
	}                                                                                                                                      
	                                                                                                                                       
	public double getValor1() {                                                                                                            
		return valor1;                                                                                                                     
	}                                                                                                                                      
	                                                                                                                                       
	public double getValor2() {                                                                                                            
		return valor2;                                                                                                                     
	}                                                                                                                                      
	                                                                                                                                       
	public double getValorTotal() {                                                                                                        
		return valorTotal;                                                                                                                 
	}                                                                                                                                      
}          
