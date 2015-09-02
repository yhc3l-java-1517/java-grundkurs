class Demo7 {
	public static void main(String[] args){
		int j = 1;
		outer: for(int i = 0; i < 10; i++){
			j *= 2;
			System.out.println("i " + i);
			System.out.println("j " + j);
			while(j > 20){
				j++;
				if(j > 200){
					break outer;
				}
			}
			
		}
		System.out.println("Exited for");
		System.out.println("j " + j);
	}
}