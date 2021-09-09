package generation.programacaoorientadaaobjetos03;

public class ClassesEletrônicasex03 {

	public static void main(String[] args) {
	
		Eletrônicosex03 produto = new Eletrônicosex03();
		
	
		produto.setNomeProd("Iphone");
		produto.setCorProd("Preto");
			
		System.out.println(" Seu produto é um " + produto.getNomeProd());
		System.out.println(" À cor do seu Iphone é " + produto.getCorProd());
	
	}

}
