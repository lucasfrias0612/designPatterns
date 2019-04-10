package creacionales.abstract_factory;

class FabricaConcreta2 implements I_FabricaAbstracta {

	private E_Fabrica tipoFabrica;

	public FabricaConcreta2() {
		this.tipoFabrica = E_Fabrica.Fabrica2;
	}

	@Override
	public I_ProductoAbstractoA crearProductoA(E_ProductoA producto) {
		return new ProductoNoSoprtado();
	}

	@Override
	public I_ProductoAbstractoB crearProductoB(E_ProductoB producto) {
		if (producto != null) {
			if (producto.equals(E_ProductoB.ProductoB1))
				return new ProductoConcretoB1();
			if (producto.equals(E_ProductoB.ProductoB2))
				return new ProductoConcretoB2();
		}
		return new ProductoNoSoprtado();
	}

	@Override
	public String getTipoFabrica() {
		return tipoFabrica.toString();
	}

}
