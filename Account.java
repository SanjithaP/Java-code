abstract class Account{
	int accNo;
	double balance;
	Account(){
		accNo=0;
		balance=0.0;
	}

	Account(int acc, double bal){
		accNo=acc;
		balance=bal;
	}

	void display(){
		System.out.println("Balance = "+balance);
	}

	abstract void deposit(double amount);
	abstract void withdrawal(double amount);
}