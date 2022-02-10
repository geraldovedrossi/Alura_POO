package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		
		conta1.deposita(250);
		
		System.out.printf("O saldo da primeira conta é de: R$%.2f%n", conta1.saldo);
		
	}

}
