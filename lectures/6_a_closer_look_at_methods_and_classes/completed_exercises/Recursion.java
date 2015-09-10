class Recursion {
	public static void main(String[] args){
		System.out.println(blocksInTriangle(4));
	}
	public static int blocksInTriangle(int rows){
		if(rows == 1){
			return rows;
		} else {
			return rows += blocksInTriangle(--rows); 
		}	
	}
}