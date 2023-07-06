class CurrentAccount extends Account{

	void deposit(double amount){
		if(balance<=100000){
		balance=balance+amount;
		}
	}

	void withdrawal(double amount){
		if(balance>amount){
		balance=balance-amount;
	}
		else
		{
			System.out.println("Sufficient balance not available..!");
		}
	}
}