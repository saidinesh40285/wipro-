package fundamentals;
import java.util.Arrays;
public class alphabeticorder {
	public static void main(String args[])
	{
		int i,l=args.length;
		Arrays.sort(args);
		for(i=0;i<l;i++) {
			System.out.println(args[i]);
	      }
	}

}
