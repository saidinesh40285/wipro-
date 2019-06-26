package fundamentals;

public class prime {
	public static void main(String args[]) {
		int i,c=0,l=Integer.parseInt(args[0]);
		if(l==0)
			System.out.print(l+" is neither prime nor composite");
		else if(l==1)
			System.out.print(l+" is neither prime nor composite");
		else if(l==2)
			System.out.print(l+" is neither prime nor composite");
		else {
		for(i=2;i<=l/2;i++) {
			c=0;
			if(l%i==0)
				c++;
		}
		if(c==0)
			System.out.print(l+" is a prime");
		else 
			System.out.print(l+" is a composite");
		
	}
	}

}
