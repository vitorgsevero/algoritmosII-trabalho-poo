
public class Certificado extends Participantes {
	
		protected int posicao;
		

	public void emitirCertificado(){
	
		try{
			
			System.out.println("\nInforme sua participação no evento: \n1)Participante \n2)Organizador \n3)Palestrante");
			this.posicao = ler.nextInt();
			
			if(this.posicao==1){
				
				System.out.println("Informe seu nome:");
				this.nomeParticipante = ler.next();
				System.out.println("Certifico que " +this.nomeParticipante + " participou do " +this.nomeEvento);
			 
			}
			
			if(this.posicao==2){
				
				System.out.println("Informe seu nome:");
				
		
				System.out.println("Certifico que " + this.getnome+ " foi organizador do " +this.nomeEvento);
			}
			
			if(this.posicao==3){
				
				System.out.println("Informe seu nome:");
				this.nomePalestrante = ler.next();
				this.setNomePalestrante(nomePalestrante);

				System.out.println("Certifico que " +this.getNomePalestrante()+ " palestrou no " +this.getNomeEvento());
			}

			
			
		}catch(Exception erro){
			
			System.out.println("Não foi possível emitir o seu certificado.");
			
		}
	}

}
