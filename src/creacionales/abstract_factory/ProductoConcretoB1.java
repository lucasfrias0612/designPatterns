package creacionales.abstract_factory;

class ProductoConcretoB1 implements I_ProductoAbstractoB{
	private E_ProductoB tipoProducto;
	
	ProductoConcretoB1() {
		tipoProducto=E_ProductoB.ProductoB1;
	}

	@Override
	public String getTipoProducto() {
		return tipoProducto.toString();
	}

}
