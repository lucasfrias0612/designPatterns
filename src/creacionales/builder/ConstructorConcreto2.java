package creacionales.builder;

public class ConstructorConcreto2 extends ConstructorAbstracto{

	@Override
	void construirParte1() {
		super.producto.setName("Producto 2");
	}

	@Override
	void construirParte2() {
		super.producto.setTipo("Tipo 2");		
	}

}
