
public class Executa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Certificado certificado = new Certificado();
		Evento evento = new Evento();

		
		System.out.println(certificado.emitirCertificado());
		
		evento.criaEvento();
		evento.infoEvento();
		
		
		
	}

}
