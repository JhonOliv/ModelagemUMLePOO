package aparelhos;
import java.util.Random;

import aparelhos.telecomunicao.*;
import repodutorMusical.*;
import navegarInternet.*;
public class Device implements telefoneCelular, ReproducaoMusical, AcessarInternet {
	
	
	private String modeloDevice;
	private String marcaDevice;
	private String numSerie;
	private String anoFabric;
	private boolean sinalConexão = true;
	private int porcentagemBaterial;
	
	public String getModeloDevice() {
		return modeloDevice;
	}
	public void setModeloDevice(String modeloDevice) {
		this.modeloDevice = modeloDevice;
	}
	public String getMarcaDevice() {
		return marcaDevice;
	}
	public void setMarcaDevice(String marcaDevice) {
		this.marcaDevice = marcaDevice;
	}
	public String getNumSerie() {
		return numSerie;
	}
	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}
	public String getAnoFabric() {
		return anoFabric;
	}
	public void setAnoFabric(String anoFabric) {
		this.anoFabric = anoFabric;
	}
	public boolean isSinalConexão() {
		return sinalConexão;
	}
	public void setSinalConexão(boolean sinalConexão) {
		this.sinalConexão = sinalConexão;
	}
	public int getPorcentagemBaterial() {
		return porcentagemBaterial;
	}
	public void setPorcentagemBaterial(int porcentagemBaterial) {
		this.porcentagemBaterial = porcentagemBaterial;
	}
	
	public void iniciarDevice(int bateria) {
		if(bateria > 5) {
			System.out.println("Ligando Aparelho");
			verificarHardware();
			
			if(verificarSinalWifi(this.sinalConexão)) {
				System.out.println("Sinal de WIFI ativado");
			}else {
				System.out.println("Sinal de RedeMovel ativado");
			}
		}
	}
	
	private void verificarHardware() {
		System.out.println("Hardware verificado!");
	}
	
	private boolean verificarSinalWifi(boolean sinal) {
		 if(!sinal) {
			 return false;
		 }else {
			 return true;
		 }
	}
	
	public void desligarDevice() {
		for(int x = 0; x <= 3; x++) {
			System.out.println("Device Desligando em " + x);
		}
			System.out.println("Devido Desligado");
			System.exit(0);
			
	}
	
	@Override
	public String escolherMusica() {
		// TODO Auto-generated method stub
		return "Musica selecionado com sucesso";
		
	}

	@Override
	public void reproduzirMusica() {
		// TODO Auto-generated method stub
		System.out.println("Reproduzindo Musica");
	}

	@Override
	public void verificarSinal() {
		// TODO Auto-generated method stub
		System.out.println("Sinal verificado.");
	}

	@Override
	public void realizarChamada(String telefone) {
		// TODO Auto-generated method stub
		System.out.println("Ligando para " + telefone);
	}

	@Override
	public String receberChamada() {
		// TODO Auto-generated method stub
Random gerarNum = new Random();
		
		int numPositivo = gerarNum.nextInt();
		if(numPositivo > 0) {
			return String.format("%d", numPositivo);
		}
			return "Ligação Perdida";
	}

	@Override
	public void verificarConexão() {
		// TODO Auto-generated method stub
		System.out.println("Verificando Conexão");
	}

	@Override
	public void conectarServWeb() {
		// TODO Auto-generated method stub
		System.out.println("Conectando com Servidor Web.");
		
	}

	@Override
	public void portaFirewall() {
		// TODO Auto-generated method stub
		System.out.println("Porta 4433");
		
	}

	@Override
	public void abrirNavegador() {
		// TODO Auto-generated method stub
		System.out.println("Abrindo navegador");
		
	}

	@Override
	public void salvarHistoricoWeb() {
		// TODO Auto-generated method stub
		System.out.println("Salvando Historico");
		
	}

	@Override
	public void autoFalante() {
		// TODO Auto-generated method stub
		
	}

	
}
