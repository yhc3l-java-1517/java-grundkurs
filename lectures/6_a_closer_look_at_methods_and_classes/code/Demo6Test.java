package java_course32;

class Demo6Test {

	public static void main(String[] args) {
		Demo1 tomsAccount = new Demo1(10045.0);
		Demo6.emptyAccount(tomsAccount);
		System.out.println("Current balance " + tomsAccount.getAccountBalance());
		Demo1 fredsAccount = new Demo1(100.0);
		double a = 500;
		Demo6.emptyAccount(a);
		System.out.println("Current balance " + a);
	}

}
