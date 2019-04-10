package creacionales.abstract_factory;

class ProductoConcretoA2 implements I_ProductoAbstractoA{
	private E_ProductoA tipoProducto;
	ProductoConcretoA2() {
		tipoProducto=E_ProductoA.ProductoA2;
	}

	@Override
	public String getTipoProducto() {
		return tipoProducto.toString();
	}

}
