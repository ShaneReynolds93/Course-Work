package account;

public class BankAccount extends Account {

	// attributes
	float accountBalance;

	// constructors
	public BankAccount(int accountNumber, String accountName) {
		this.accountBalance = accountNumber;
		this.accountName = accountName;
	}

	public BankAccount(int accountNumber, String accountName, float accountBalance) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}
	public BankAccount (BankAccount anAccount) {
		accountNumber = anAccount.accountNumber;
		accountName = anAccount.accountName;
	}
	
	// explicit default constructor
	public BankAccount(){
		accountNumber = 0;
		accountName = "default";
	}

	// methods
	public void display() {
		System.out.println("The Bank Account Number is " + this.accountNumber);
		System.out.println("The Bank Account Name is " + this.accountName);

	}

	// method to display the account balance
	public void displayBalance() {
		display();
		System.out.println("The Account Balance is " + this.accountBalance);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
