package fundamentals;

public class reverse {
	public static void main(String args[]){
		int l=Integer.parseInt(args[0]),k=0;
		do{
			k=k*10+l%10;
			l=l/10;
		}while(l!=0);
		System.out.println(k);
	}
	

}
