package fundamentals;

public class palindrome {
	public static void main(String args[]) {
		int i=Integer.parseInt(args[0]),j=i,l,m=0,q=0;
		do {
			i=i/10;
			m++;
		}while(i!=0);
		int[] a=new int[m];
		for(l=0;l<m;l++) {
			a[l]=j%10;
			j=j/10;
		}
		for(l=0;l<m;l++) {
			if(a[l]==a[m-l-1])
				q++;
		}
		if(q==m)
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
	}

}
