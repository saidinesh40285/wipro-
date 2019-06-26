package fundamentals;

public class percentintrest {
	public static void main(String args[]) {
		int age=Integer.parseInt(args[1]);
		if(args[0].equals("female")){
			if((age>=1)&&(age<=58)){
				System.out.println("the percentge of intrest is 8.2%");
			}
			else if((age>=59)&&(age<=100)) {
				System.out.println("the percentge of intrest is 9.2%");
			}
		}
			
			else if(args[0].equals("male")) {
				if((age>=1)&&(age<=58)) {
					System.out.println("the percentge of intrest is 8.4%");
			}
				else if((age>=59)&&(age<=100)) {
					System.out.println("the percentge of intrest is 10.5%");
				
		}
	}

}
}
