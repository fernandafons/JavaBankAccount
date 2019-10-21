
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
	
	void deposit(double quantidade) {
		this.balance += quantidade;
	}
	
	boolean transferTo(Account destination, double valor) {
		boolean retirou = this.withdraw(valor);
		if (retirou == false) {
			// não foi possível transferir
			return false;
		}
		else {
			destination.deposit(valor);
			destination.balance = destination.balance + valor;
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
	
	public String getbankAgency() {
		return this.bankAgency;
	}
	
	public void setbankAgency(String bankAgency) {
		this.bankAgency = bankAgency;
		}
	
	public double getYield() {
		return this.Yield;
	}
	
	public String getdateOfActivation() {
		return this.dateOfActivation;
	}
	
	public void setdateOfActivation(String dateOfActivation) {
		this.dateOfActivation = dateOfActivation;
		}
	
	public String getOwner() {
		return this.owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
		}
}


