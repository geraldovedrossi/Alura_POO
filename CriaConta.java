package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		
		conta1.deposita(250);
		
		System.out.printf("O saldo da primeira conta é de: R$%.2f%n", conta1.saldo);
		
		conta1.saca(50);
		
		System.out.printf("O saldo da primeira conta é de: R$%.2f%n", conta1.saldo);
		System.out.printf("O saldo da segunda conta é de: R$%.2f%n", conta2.saldo);

		conta1.tranfere(100, conta2);
		
		System.out.printf("O saldo da primeira conta é de: R$%.2f%n", conta1.saldo);
		System.out.printf("O saldo da segunda conta é de: R$%.2f%n", conta2.saldo);
	}

}
