
public class EditorVideo extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o método de Bonificacao do Editor de Video");
		return super.getBonificacao() + 100;
		
		
	}

}
