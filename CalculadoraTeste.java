public class CalculadoraTeste {
	
	@Teste
	public void calcular() throws Exception {
		Calculadora calculadora = new Calculadora(10, 20);
		if (calculadora.getValor1() > 0 && calculadora.getValor2() > 0) {
			calculadora.calcular();
			assertEquals(30.00, calculadora.getValorTotal());
		} else {
			assertFalse(false);
		}
	}

}