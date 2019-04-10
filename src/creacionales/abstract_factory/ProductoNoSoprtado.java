package creacionales.abstract_factory;

public class ProductoNoSoprtado implements I_ProductoAbstractoA,I_ProductoAbstractoB{
	private String tipoProducto;

	public ProductoNoSoprtado() {
		this.tipoProducto = "No Soportado";
	}
	@Override
	public String getTipoProducto() {
		return tipoProducto;
	}

}
