package generation.programacaoorientadaaobjetos04;

public class Classesfuncionarios04 {

	public static void main(String[] args) {
	
	funcionarios04 funcionarios = new funcionarios04();
	
	funcionarios.setNomeFunc("Leonardo");
	funcionarios.setCargoFunc("Dev.J�nior");
	funcionarios.setSalarioFunc("5.000");
	funcionarios.setTempoFunc("07 meses");
		
	System.out.println(" Meu melhor Dev � o " + funcionarios.getNomeFunc());
	System.out.println(" O carrgo dele � " + funcionarios.getCargoFunc());
	System.out.println(" Seu sal�rio chega aos\n impressionantes " + funcionarios.getSalarioFunc());
	System.out.println(" Ele est� conosco � " + funcionarios.getTempoFunc());
	
	
	
	}
	
}
 