package fundamentals;

public class primenumbers {
	public static void main(String args[]) {
		int i,m,c=0;
		for(m=10;m<=99;m++)
		{ 
			c=0;
			for(i=2;i<=m/2;i++)
			{ 
				if(m%i==0)
				c++;
			}
			if(c==0)
				System.out.print(m+" ");
	
		}
	}
	}

