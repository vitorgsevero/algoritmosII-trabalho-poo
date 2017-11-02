import java.util.*;
public class Evento {
	
	protected String dataEvento;
	protected String nomeEvento;
	protected String pesquisaEvento;
	
	Scanner ler = new Scanner(System.in);
	
	public void criaEvento(){
		
		System.out.println("Informe o nome do Evento:");
		this.nomeEvento = ler.next();
		this.setNomeEvento(nomeEvento);
		System.out.println("Informe a data em que " +this.nomeEvento+ " irá acontecer:");
		this.dataEvento = ler.next();
		this.setDataEvento(dataEvento);
	}
	
	public void infoEvento(){
		
		System.out.println("Informe o nome do seu Evento:");
		this.pesquisaEvento = ler.next();
		
		if (this.pesquisaEvento.equals(this.nomeEvento)){
			
			System.out.println("Evento encontrado!\nNome do Evento: "+this.nomeEvento+ "\nData do Evento: "+this.dataEvento);
			
		}else{
			
			System.out.println("Evento não encontrado...");
		}
		
		
	}
	
	

	public String getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(String dataEvento) {
		this.dataEvento = dataEvento;
	}

	public String getNomeEvento() {
		return nomeEvento;
	}

	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}

}
