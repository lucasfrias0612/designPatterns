package creacionales.abstract_factory;

class ProductoConcretoB2 implements I_ProductoAbstractoB{
	private E_ProductoB tipoProducto;
	
	public ProductoConcretoB2() {
		this.tipoProducto = E_ProductoB.ProductoB2;
	}

	@Override
	public String getTipoProducto() {
		return tipoProducto.toString();
	}
}
