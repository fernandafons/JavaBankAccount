class AccountTest {
	public static void main(String[] args) {
		Account Account1 = new Account();
		Account1.setOwner("Maria");
		Account1.setBalance(25000.00);
		Account1.setNumber("757698-2");
		Account1.setBankAgency("5200");
		Account1.setDateOfActivation("20/02/2000");
		
		
		System.out.println("Nome do cliente: " + Account1.getOwner());
		System.out.println("Número da conta do cliente: " + Account1.getNumber());
		System.out.println("Agência bancária: " + Account1.getBankAgency());
		System.out.println("Saldo atual: " + Account1.getBalance());
		
		// saca 200 reais
		Account1.withdraw(200);
		System.out.println("Saldo depois do saque de 200 reais: " + Account1.getBalance());
		
		// tenta depositar valor negativo
		Account1.deposit(-500);
		
		// deposita 500 reais
		Account1.deposit(500);
		System.out.println("Saldo depois do depósito de 500 reais: " + Account1.getBalance());
		
		// printa rendimento
		Account1.calcYield();
		System.out.println("Rendimento atual: " + Account1.getYield());
		
		
		Account Account2 = new Account();
		Account2.setOwner("João");
		Account2.setBalance(10000.00);
		Account2.setNumber("758998-x");
		Account2.setBankAgency("5260");
		Account2.setDateOfActivation("19/04/2001");
		
		System.out.println("Realizando transfência " + Account1.transferTo(Account2, 50));
		System.out.println("Atual saldo da Maria: " + Account1.getBalance());
		System.out.println("Atual saldo do João: " + Account2.getBalance());
	}
}