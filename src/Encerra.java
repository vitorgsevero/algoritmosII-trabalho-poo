
public class Encerra extends Certificado{

	protected String encerraPrograma;
	
	public String finaliza(){
		this.setFinaliza("Encerrando o Programa...");
		return encerraPrograma;
	}

	public String getFinaliza() {
		return encerraPrograma;
	}

	public void setFinaliza(String encerraPrograma) {
		this.encerraPrograma = encerraPrograma;
	}

}
