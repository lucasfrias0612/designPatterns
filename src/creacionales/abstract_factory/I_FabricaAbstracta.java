package creacionales.abstract_factory;

public interface I_FabricaAbstracta {
//	Aplicabilidad
//	Usar el Patron Abstract Factory cuando:
//		*Un sistema debe ser independiente de como se crean,
//		componen y representan sus productos.
	
//		*Un sistema debe ser configurado con una familia de productos de entre varias.
	
//		*Una familia de objetos producto relacionados esta diseñada para ser usada conjuntamente,
//		y es necesario hacer cumplir esta restricción.
	
//		*Quiere proporcionar una biblioteca de clases de productos,
//		y solo quiere relevar sus interfaces, no sus implementaciones.
	
	public I_ProductoAbstractoA crearProductoA(E_ProductoA producto);
	public I_ProductoAbstractoB crearProductoB(E_ProductoB producto);
	public String getTipoFabrica();
}
