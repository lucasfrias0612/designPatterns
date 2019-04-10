package creacionales.abstract_factory;

class ProductoConcretoA1 implements I_ProductoAbstractoA {
	private E_ProductoA tipoProducto;

	ProductoConcretoA1() {
		tipoProducto=E_ProductoA.ProductoA1;
	}

	@Override
	public String getTipoProducto() {
		return tipoProducto.toString();
	}
}
