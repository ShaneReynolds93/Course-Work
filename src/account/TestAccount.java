package account;

public class TestAccount extends Account {

	@Override
	public void display() {

	}

	public static void main(String[] args) {

		// create objects
		BankAccount shaneAccount = new BankAccount(135, "shane");
		BankAccount sharnAccount = new BankAccount(705, "sharn", 10f);
		BankAccount hisAccount = new BankAccount(shaneAccount);
		BankAccount starterAccount = new BankAccount();

		// using our objects
		shaneAccount.display();
		sharnAccount.displayBalance();
		starterAccount.display();
		hisAccount.display();

	}

}
