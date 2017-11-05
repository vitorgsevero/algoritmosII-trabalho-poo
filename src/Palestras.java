
public class Palestras extends Evento {
	
	protected int salaPalestra;
	protected String horarioPalestra;
	protected String resumoPalestra;
	protected String tituloPalestra;
	protected String pesquisa;
	
	public void criaPalestra(){
		
		System.out.println("Informe o evento para vincular a nova palestra:");
		this.pesquisa = ler.next();
	
		try{
		
			if (pesquisa.equalsIgnoreCase(nomeEvento)){
			
				System.out.println("Informe o nome da nova palestra:");
				this.tituloPalestra = ler.next();
				this.setTituloPalestra(tituloPalestra);
				
				System.out.println("Informe o horário da Palestra:");
				this.horarioPalestra = ler.next();
				this.setHorarioPalestra(horarioPalestra);
				
				this.setSalaPalestra(100);
				
				System.out.println("Informe um breve resumo sobre a palestra:");
				this.resumoPalestra = ler.next();
				this.setResumoPalestra(resumoPalestra);
			
			}
		
		
		}catch(Exception erro){
			System.out.println("Palestra não encontrada...");
		}
		
	}
	
	public void mostraResumo(){
		
		try{
			
			System.out.println("Informe o título da palestra para ver o resumo:");
			this.pesquisa = ler.next();
			
			if(this.pesquisa.equalsIgnoreCase(this.tituloPalestra)){
				
				System.out.println("RESUMO DA PALESTRA:\n Título da Palestra: " +this.tituloPalestra+ "\nHorário da Palestra: " +this.horarioPalestra+ "\nResumo: " +this.resumoPalestra);
			}
			
		}catch(Exception erro){
			System.out.println("Resumo não encontrado...");
		}

	}

	public int getSalaPalestra() {
		return salaPalestra;
	}

	public void setSalaPalestra(int salaPalestra) {
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

