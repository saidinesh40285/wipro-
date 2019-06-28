package fundamentals;

public class divisibles {
	public static void main(String args[]) {
		int i=0,k=0;
		while(i!=5) {
			k++;
			if((k%2==0)&&(k%3==0)&&(k%5==0)){
				System.out.println(k);
				i++;
			}
		}
			
	}
	

}
