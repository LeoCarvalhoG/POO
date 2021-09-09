package generation.programacaoorientadaaobjetos04;

public class Classesfuncionarios04 {

	public static void main(String[] args) {
	
	funcionarios04 funcionarios = new funcionarios04();
	
	funcionarios.setNomeFunc("Leonardo");
	funcionarios.setCargoFunc("Dev.Júnior");
	funcionarios.setSalarioFunc("5.000");
	funcionarios.setTempoFunc("07 meses");
		
	System.out.println(" Meu melhor Dev é o " + funcionarios.getNomeFunc());
	System.out.println(" O carrgo dele é " + funcionarios.getCargoFunc());
	System.out.println(" Seu salário chega aos\n impressionantes " + funcionarios.getSalarioFunc());
	System.out.println(" Ele está conosco à " + funcionarios.getTempoFunc());
	
	
	
	}
	
}
 