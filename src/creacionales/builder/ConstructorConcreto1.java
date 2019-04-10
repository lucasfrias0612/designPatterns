package creacionales.builder;

public class ConstructorConcreto1 extends ConstructorAbstracto{

	@Override
	void construirParte1() {
		super.producto.setName("Producto 1");
		
	}

	@Override
	void construirParte2() {
		super.producto.setTipo("Tipo 1");
		
	}

}
