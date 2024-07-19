package aparelhos;

public class Iphone extends Device{
	
	public static void main(String[] args) {
		
		Device iphone = new Device();
		
		iphone.setModeloDevice("IPHONE");
		iphone.setMarcaDevice("APPLE");
		
		System.out.println(iphone.getModeloDevice());
		System.out.println(iphone.getMarcaDevice());
		iphone.escolherMusica();
		iphone.reproduzirMusica();
		iphone.realizarChamada("11987654321");
		iphone.abrirNavegador();
		
	}

}
