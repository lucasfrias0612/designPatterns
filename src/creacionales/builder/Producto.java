package creacionales.builder;

public class Producto {
	private String name;
	private String tipo;

	public Producto() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Producto [name=" + name + ", tipo=" + tipo + "]";
	}

}
