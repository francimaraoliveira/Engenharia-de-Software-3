public class CalculadoraTeste2 {
	
	@Teste2(expectedExceptions = RuntimeException.class)
	public void calcularErro() {
		Calculadora calculadora = new Calculadora(0, 30);
		calculadora.calcular();
	}

	@Teste2	
public void calcularSucesso() {
		Calculadora calculadora = new Calculadora(10, 20);
		calculadora.calcular();
		assertEquals(30.00, calculadora.getValorTotal());
	}
}