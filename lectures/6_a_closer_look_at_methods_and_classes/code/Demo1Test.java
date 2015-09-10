package java_course32;

class Demo1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 tomsAccount = new Demo1(10045.0);
		Double withdrawl = 50000.0;
		tomsAccount.depositMoney(50000);
		if (tomsAccount.withdrawMoney(withdrawl)) {
			System.out.println("Withdrawn " + withdrawl + ":- ");
		} else {
			System.out.println("Can't withdraw " + withdrawl
					+ ":-, insufficient funds ");
		}
		System.out
				.println("Current balance " + tomsAccount.getAccountBalance());
	}

}
