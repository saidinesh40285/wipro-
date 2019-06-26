package fundamentals;

public class lowerupperswitch {
	public static void main(String args[]) {
		char s;
		s=args[0].charAt(0);
		if((s>='a')&&(s<='z')) {
			System.out.println(Character.toUpperCase(s));
			}
		else if ((s>='A')&&(s<='Z')) {
			System.out.println(Character.toLowerCase(s));
		}
			
	}

}
