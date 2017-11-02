import java.util.*;
public class Evento {
	
	protected String dataEvento;
	protected String nomeEvento;
	protected String pesquisaEvento;
	
	Scanner ler = new Scanner(System.in);
	
	public void criaEvento(){
		
		System.out.println("Informe o nome do Evento:");
		this.nomeEvento = ler.nextLine();
		System.out.println("Informe a data em que " +this.nomeEvento+ " ir� acontecer:");
		this.dataEvento = ler.next();
	}
	
	public void infoEvento(){
		
		System.out.println("Informe o nome do seu Evento:");
		this.pesquisaEvento = ler.next();
		
		if (this.pesquisaEvento.equals(nomeEvento)){
			
			System.out.println("Evento encontrado!\nNome do Evento: "+this.nomeEvento+ "\nData do Evento: "+this.dataEvento);
			
		}else{
			
			System.out.println("Evento n�o encontrado...");
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
