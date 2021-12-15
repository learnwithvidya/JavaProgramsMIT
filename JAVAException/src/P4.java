/*
 * invalid command line arguments passing
 */

//argument input is int type, if not it counts the invalid and displays.
public class P4 {

	public static void main(String[] args) {
		int tot_invalid = 0;		//invalid number counter
		int number, tot_valid = 0;
		for(int i = 0; i < args.length; i++) {
			try {
				number = Integer.parseInt(args[i]);
			}
			catch(NumberFormatException e) {
				tot_invalid++;			//caught an invalid number
				System.out.println("Invalid Integer  = " + args[i]);
				continue;
			}
			tot_valid++;				//valid number counter
			System.out.println("Valid Integer  = " + args[i]);
		}
		System.out.println("Number of invalid Integer = " + tot_invalid);
		System.out.println("Number of valid Integer = " + tot_valid);
	}
}
