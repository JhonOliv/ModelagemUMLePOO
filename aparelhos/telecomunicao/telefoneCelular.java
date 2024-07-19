package aparelhos.telecomunicao;

public interface telefoneCelular {
	
	 void verificarSinal ();	
	 void realizarChamada (String numTelefone);
	 String receberChamada ();
	 void autoFalante ();
}
