package fundamentals;

public class calander {
	public static void main(String args[]) {
		if(args[0].equals("1")) 
			System.out.println("January");
		else if(args[0].equals("2")) 
			System.out.println("feb");
		else if(args[0].equals("3")) 
			System.out.println("march");
		else if(args[0].equals("4")) 
			System.out.println("April");
		else if(args[0].equals("5")) 
			System.out.println("may");
		else if(args[0].equals("6")) 
			System.out.println("June");
		else if(args[0].equals("7")) 
			System.out.println("July");
		else if(args[0].equals("8")) 
			System.out.println("august");
		else if(args[0].equals("9")) 
			System.out.println("september");
		else if(args[0].equals("10")) 
			System.out.println("october");
		else if(args[0].equals("11")) 
			System.out.println("november");
		else if(args[0].equals("12")) 
			System.out.println("december");
		else if(Integer.parseInt(args[0])>12) 
			System.out.println("Invalid month");
		else 
			System.out.println("Please enter months in numbers");
		
		
		
		
		
		
		 
	}

}
