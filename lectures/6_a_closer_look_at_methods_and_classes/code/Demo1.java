package java_course32;

public class Demo1 {
	private double accountBalance;

	Demo1(double startingBalance){
		this.accountBalance = startingBalance;
	}
	
	public double getAccountBalance() {
		return accountBalance;
	}

	public void depositMoney(double money){
		accountBalance += money;
	}
	
	public boolean withdrawMoney(double money){
		if(money <= accountBalance){
			accountBalance -= money;
			return true;
		} else {
			return false;
		}
	}

}
