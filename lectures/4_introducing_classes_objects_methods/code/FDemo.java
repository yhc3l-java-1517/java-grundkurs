class FDemo {
	int x;
	FDemo(int i){
		x=i;
	}
	protected void finalize(){
		System.out.println("Finalizing " + x);
	}
	void generator(int i){
		FDemo o = new FDemo(i);
	}

}
