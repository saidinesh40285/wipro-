package fundamentals;

public class floyds {
	public static void main(String args[]) {
		int i,k,l=Integer.parseInt(args[0]);
				if(l>0) {
					for(i=1;i<=l;i++) {
						for(k=1;k<=i;k++) {
							System.out.print(" * ");
							
						}
						System.out.println();
						
					}
				}
				else
					System.out.println("Please enter an integer number");
					
	}

}
