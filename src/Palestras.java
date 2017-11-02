
public class Palestras extends Evento {
	
	protected String salaPalestra;
	protected String horarioPalestra;
	protected String resumoPalestra;
	protected String tituloPalestra;
	protected String pesquisa;
	
	
	public void criaPalestra(){
		
		System.out.println("Informe o evento para vincular a nova palestra:");
		this.pesquisa = ler.next();
		
		if (pesquisa.equals(nomeEvento)){
			
			System.out.println("Informe o nome da nova palestra:");
			this.tituloPalestra = ler.next();
			
		}
		
		
		
	}
	
	
	public void mostraResumo(){
		
		
	
	}

	
	
	
	public String getSalaPalestra() {
		return salaPalestra;
	}

	public void setSalaPalestra(String salaPalestra) {
		this.salaPalestra = salaPalestra;
	}

	public String getHorarioPalestra() {
		return horarioPalestra;
	}
	
	public void setHorarioPalestra(String horarioPalestra) {
		this.horarioPalestra = horarioPalestra;
	}

	public String getResumoPalestra() {
		return resumoPalestra;
	}

	public void setResumoPalestra(String resumoPalestra) {
		this.resumoPalestra = resumoPalestra;
	}
	
	public String getTituloPalestra() {
		return tituloPalestra;
	}

	public void setTituloPalestra(String tituloPalestra) {
		this.tituloPalestra = tituloPalestra;
	}

}
