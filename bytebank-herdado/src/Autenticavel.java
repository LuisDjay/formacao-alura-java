
// Contrato  Autenticavel 
	//Quem assina esse contrato, precisa implementar ( dar vida ) 
		//metodo setSenha
		//metodo autentica

public abstract interface Autenticavel  {
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);
	
	}

