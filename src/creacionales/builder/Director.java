package creacionales.builder;

public class Director {
//	Aplicabilidad
//	Usar el Patron Builder cuando:
//		*El algoritmo para crear un objeto complejo debería ser independiente
//		de las partes de que se compone dicho objeto y de cómo se ensamblan.

//		*El proceso de construcción debe permitir diferentes representaciones
//		del objeto que está siendo construído.
	private ConstructorAbstracto constructor;
	
	public Director(ConstructorAbstracto builder) {
		this.constructor = builder;
	}

	public void setConstructor(ConstructorAbstracto builder) {
		this.constructor = builder;
	}
	
	public void construir() {
		constructor.instanciarProducto();
		constructor.construirParte1();
		constructor.construirParte2();
	}
	
	public Producto getProducto() {
		return constructor.getProducto();
	}
}
