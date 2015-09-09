/* 
	 *	|	1	2	3	4	5	6	7	8	9
	--------------------------------------------
	 1	|	1	2	3	4		6	7	8	9	
	 2	|	2	4	6	8		12	14	16	18	
	 3	|	3	6	9	12		18	21	24	27	
	 4	|	4	8	12	16		24	28	32	36	
	 5	|	
	 6	|	6	12	18	24		36	42	48	54	
	 7	|	7	14	21	28		42	49	56	63	
	 8	|	8	16	24	32		48	56	64	72	
	 9	|	9	18	27	36		54	63	72	81

	Adjust your code from the nested loop exercise so that you do not calculate multiples of 5.

	Instead of if and else, use an if with a continue statement to achieve this.
 */
class Continue {
	public static void main(String[] args){
		System.out.println(" *\t|\t1\t2\t3\t4\t5\t6\t7\t8\t9");
		System.out.println("--------------------------------------------------------------------------------------");
		for(int y = 1; y <= 9; y++){
			System.out.print(" " + y);
			System.out.print("\t|\t");
			if(y == 5){
				System.out.println();
				continue;
			}
			for(int x = 1; x <=9; x++){
				if(x == 5){
					System.out.print("\t");
					continue;
				}
				System.out.print(x * y);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}