package creacionales.abstract_factory;

class FabricaConcreta1 implements I_FabricaAbstracta{
	private E_Fabrica tipoFabrica;
	
	public FabricaConcreta1() {
		this.tipoFabrica = E_Fabrica.Fabrica1;
	}

	@Override
	public I_ProductoAbstractoA crearProductoA(E_ProductoA producto) {
		if(producto!=null) {
			if(producto.equals(E_ProductoA.ProductoA1))
				return new ProductoConcretoA1();
			if(producto.equals(E_ProductoA.ProductoA2))
				return new ProductoConcretoA2();
		}
		return new ProductoNoSoprtado();
	}

	@Override
	public I_ProductoAbstractoB crearProductoB(E_ProductoB producto) {
		return new ProductoNoSoprtado();
	}
	@Override
	public String getTipoFabrica() {
		return tipoFabrica.toString();
	}
}
