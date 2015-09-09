class Demo3 {

	public static void main(String[] args) {
		int r, c;
		int [][]table = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 },
				{ 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };
		for (r = 0; r < table.length; r++) {
			for (c = 0; c < table[r].length; c++) {
				table[r][c] = (r * 5) + (c + 1);
				System.out.print(table[r][c] + "\t");
			}
			System.out.println();
		}
	}

}
