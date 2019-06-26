package fundamentals;

public class sumofdigits {
	public static void main(String args[]) {
		int r,p=0,q,i=Integer.parseInt(args[0]);
		
		do{
			r=i/10;
			q=i%10;
			p=p+q;
			i=r;
		}while(r!=0);
		 
		System.out.println(p);
		
		
	}

}
