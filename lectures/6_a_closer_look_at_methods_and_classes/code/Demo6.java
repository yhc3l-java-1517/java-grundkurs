package java_course32;

public class Demo6 {
	public static void emptyAccount(Demo1 account){
		account.withdrawMoney(account.getAccountBalance());
	}
	public static void emptyAccount(Double money){
		money = 0.0;
	}
}
