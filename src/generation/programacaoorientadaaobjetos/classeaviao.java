package generation.programacaoorientadaaobjetos;

	public class classeaviao {

	
	
	public static void main(String[] args) {
		
		Aviao02 aviao = new Aviao02(); 
		
		aviao.setNome("Boingzera");
		aviao.setCapacidade("1000");
		aviao.setPeso("10000");
		
	System.out.println(" Seu Avi�o �: " + aviao.getNome());
	System.out.println(" A capacidade do Boingzera � de: " + aviao.getCapacidade() + " pessoas");
	System.out.println(" O peso dele �: " + aviao.getPeso() + " toneladas");
	
	}
	

		
	
	
	
}
