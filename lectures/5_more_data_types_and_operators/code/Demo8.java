// Display the bits in a byte
class Demo8 {

	public static void main(String[] args) {
		int t;
		byte val = 123;
		for (t = 128; t > 0; t = t / 2) {
			if ((val & t) != 0) {
				System.out.print("1 ");
			} else {
				System.out.print("0 ");
			}
		}
		System.out.println("");
		val = (byte) ~val;
		for (t = 128; t > 0; t = t / 2) {
			if ((val & t) != 0) {
				System.out.print("1 ");
			} else {
				System.out.print("0 ");
			}
		}
	}
}
