package main;

import creacionales.abstract_factory.E_Fabrica;
import creacionales.abstract_factory.E_ProductoA;
import creacionales.abstract_factory.E_ProductoB;
import creacionales.abstract_factory.I_FabricaAbstracta;
import creacionales.abstract_factory.I_ProductoAbstractoA;
import creacionales.abstract_factory.I_ProductoAbstractoB;
import creacionales.abstract_factory.SelectorDeFabrica;
import creacionales.builder.ConstructorAbstracto;
import creacionales.builder.ConstructorConcreto1;
import creacionales.builder.ConstructorConcreto2;
import creacionales.builder.Director;
import creacionales.singelton.Singleton;

public class PatronesMain {
	public static void main(String args[]) {
		pruebaBuilder();
	}

	static void pruebaBuilder() {
		System.out.println("Probando Builder");
		ConstructorAbstracto builder1=new ConstructorConcreto1();
		ConstructorAbstracto builder2=new ConstructorConcreto2();
		Director director=new Director(builder1);
		director.construir();
		System.out.println(director.getProducto());
		director.setConstructor(builder2);
		director.construir();
		System.out.println(director.getProducto());
	}

	static void pruebaSingleton() {
		System.out.println("Probando Singleton");
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		System.out.println("Instancias iguales: "+(s1==s2));
	}

	static void pruebaAbstractFactory() {
		System.out.println("Probando Abstract Factory");
		I_FabricaAbstracta miFabrica;
		I_ProductoAbstractoA productoA;
		I_ProductoAbstractoB productoB;
		miFabrica = SelectorDeFabrica.getFabrica(E_Fabrica.Fabrica1);
		System.out.println(miFabrica.getTipoFabrica());
		productoA = miFabrica.crearProductoA(E_ProductoA.ProductoA1);
		System.out.println(productoA.getTipoProducto());
		productoA = miFabrica.crearProductoA(E_ProductoA.ProductoA2);
		System.out.println(productoA.getTipoProducto());
		productoB = miFabrica.crearProductoB(E_ProductoB.ProductoB1);
		System.out.println(productoB.getTipoProducto());
		productoB = miFabrica.crearProductoB(E_ProductoB.ProductoB2);
		System.out.println(productoB.getTipoProducto());
		System.out.println("-----------------------------------");
		miFabrica = SelectorDeFabrica.getFabrica(E_Fabrica.Fabrica2);
		System.out.println(miFabrica.getTipoFabrica());
		productoA = miFabrica.crearProductoA(E_ProductoA.ProductoA1);
		System.out.println(productoA.getTipoProducto());
		productoA = miFabrica.crearProductoA(E_ProductoA.ProductoA2);
		System.out.println(productoA.getTipoProducto());
		productoB = miFabrica.crearProductoB(E_ProductoB.ProductoB1);
		System.out.println(productoB.getTipoProducto());
		productoB = miFabrica.crearProductoB(E_ProductoB.ProductoB2);
		System.out.println(productoB.getTipoProducto());

	}
}
