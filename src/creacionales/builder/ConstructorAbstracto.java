package creacionales.builder;

public abstract class ConstructorAbstracto {
	protected Producto producto;

	public Producto getProducto() {
		return producto;
	}

	public void instanciarProducto() {
		producto = new Producto();
	}

	abstract void construirParte1();

	abstract void construirParte2();

}
