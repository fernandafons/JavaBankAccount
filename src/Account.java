
public class Account {
	private String number;
	private String bankAgency;
	private String owner;
	private double balance;
	private String dateOfActivation;
	private double Yield;	
	
	boolean withdraw(double value) {
		if (this.balance < value) {
			return false;
		}
		else {
			this.balance = this.balance - value;
			return true;
		}
	}
	
	void deposit(double value) {
		if (value > 0) {
			this.balance += value;
		}
		else {
			System.out.println("Depósito inválido. O valor a ser depositado precisa ser positivo.");
		}
		}
	
	boolean transferTo(Account destination, double value) {
		boolean retirou = this.withdraw(value);
		if (retirou == false) {
			// não foi possível transferir
			return false;
		}
		else {
			destination.deposit(value);
			return true;
		}
	}
	
	double calcYield() {
		Yield = this.balance * 0.1;
		return Yield;

	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
		}

	
	public String getNumber() {
		return this.number;
	}
	
	public void setNumber(String number) {
		this.number = number;
		}
	
	public String getBankAgency() {
		return this.bankAgency;
	}
	
	public void setBankAgency(String bankAgency) {
		this.bankAgency = bankAgency;
		}
	
	public double getYield() {
		return this.Yield;
	}
	
	public String getDateOfActivation() {
		return this.dateOfActivation;
	}
	
	public void setDateOfActivation(String dateOfActivation) {
		this.dateOfActivation = dateOfActivation;
		}
	
	public String getOwner() {
		return this.owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
		}
}
