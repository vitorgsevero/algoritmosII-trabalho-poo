
public class Opcao extends Palestras {
	
	protected int opcao;
	
	public void menu(){
		
		while(this.opcao!=1 ||this.opcao!=2 || this.opcao!=3 ||this.opcao!=4){
			
			System.out.println("Bem-vindo ao Sistema de Eventos!\nInforme a opção desejada:\n1)Criar Evento \n2)Ver Eventos\n3)Criar Palestras \n4)Emitir certificado");
			this.opcao = ler.nextInt();
			
			if(this.opcao==1){
				super.criaEvento();
			}
			
			if(this.opcao==2){
				super.infoEvento();
			}
			
			if(this.opcao==3){
				super.criaPalestra();
			}
		
	}
	


	}
}