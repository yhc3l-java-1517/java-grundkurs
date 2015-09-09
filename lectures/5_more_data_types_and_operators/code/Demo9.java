// Display the bits in a byte
class Demo9 {

	public static void main(String[] args) {
		int val = 1;
		for (int i = 0; i < 8; i++) {
			for (int t = 256; t > 0; t = t / 2) {
				if ((val & t) != 0) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println("");
			val =  val << 1;
		}
		System.out.println("");
		for (int i = 0; i < 8; i++) {
			for (int t = 256; t > 0; t = t / 2) {
				if ((val & t) != 0) {
					System.out.print("1 ");
				} else {
					System.out.print("0 ");
				}
			}
			System.out.println("");
			val =  val >> 1;
		}

	}
}
