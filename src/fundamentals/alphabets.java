package fundamentals;

public class alphabets {
	public static void main(String args[]) {
		char c;
		String s=args[0];
		c=s.charAt(0);
		if ((c>='A'&&c<='Z')||(c>='a'&&c<='z')) 
			System.out.println("ALPHABET");
		else if(c>='0'&&c<='9')
			System.out.println("DIGIT");
		else
			System.out.println("SPECIAL CHARACTER");
		
		
	}

}
