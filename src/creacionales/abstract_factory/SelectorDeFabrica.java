package creacionales.abstract_factory;

public class SelectorDeFabrica {
	
	public static I_FabricaAbstracta getFabrica(E_Fabrica fabrica) {
		if(fabrica!=null) {
			if(fabrica.equals(E_Fabrica.Fabrica1))
				return new FabricaConcreta1();
			if(fabrica.equals(E_Fabrica.Fabrica2))
				return new FabricaConcreta2();
		}
		return null;
	}
}
