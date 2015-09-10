public class UserTest {

	public static void main(String[] args) {
		User tom = new User("Tom", "blackmore");
		User fred = new User();
		User lotta = new User("lotta");
		
		fred.setFirstname("fred");
		fred.setLastname("west");
		
		if(fred.getUsername().equals("fred.west")){
			System.out.println("Correct username for Fred");
		} else {
			System.out.println("Wrong username for Fred");
		}
		if(lotta.getUsername().equals("lotta")){
			System.out.println("Correct username for Lotta");
		} else {
			System.out.println("Wrong username for Lotta");
		}
		if(tom.getUsername().equals("tom.blackmore")){
			System.out.println("Correct username for Tom");
		} else {
			System.out.println("Wrong username for Tom");
		}

		if(fred.getFirstname().equals("Fred")){
			System.out.println("Correct Firstname for Fred");
		} else {
			System.out.println("Wrong Firstname for Fred");
		}
		if(lotta.getFirstname().equals("Lotta")){
			System.out.println("Correct Firstname for Lotta");
		} else {
			System.out.println("Wrong Firstname for Lotta");
		}
		if(tom.getFirstname().equals("Tom")){
			System.out.println("Correct Firstname for Tom");
		} else {
			System.out.println("Wrong Firstname for Tom");
		}
	}
}