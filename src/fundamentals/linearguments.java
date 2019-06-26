package fundamentals;

public class linearguments {
	public static void main(String args[]) {
		int l=0,i=args.length;
		if(i==0)
		{
			System.out.println(" No Values");
		}
		else
		{
			for(l=0;l<i;l++)
			{
						System.out.print(args[l]);
						if(l!=i-1)
							System.out.print(",");
			}
		}
	}

}
