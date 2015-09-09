class Demo1 {

	public static void main(String[] args) {
		int sample[] = new int[10];
		int i;
		for (i = 0; i < 10; i++) {
			sample[i] = i;
		}
		for (i = 0; i < 10; i++) {
			System.out.println("This is sample[" + i + "]: " + sample[i]);
		}
	}

}
