package creacionales.singelton;

public class Singleton {
//	Aplicabilidad
//	Usar el Patron Singleton cuando:
//		*Debe haber excatamente una instancia de una clase, y ésta debe ser
//		accesible a los clientes desde un punto de acceso conocido.

//		*La única instancia debería ser extensible mediante herencia, y los clientes
//		deberían ser capaces de usar una instancia extendida sin modificar su código.

	private static Singleton uniqueInstance;
	private String name = "Singleton";

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			instantiate();
		}
		return uniqueInstance;
	}

	// Este metodo asegura la única instancia en paralelismo.
	private static synchronized void instantiate() {
		if (uniqueInstance == null)
			uniqueInstance = new Singleton();
	}
	
	@Override
	public String toString() {
		return "Singleton [name=" + name +"-"+ Integer.toHexString(hashCode())+"]";
	}
}
