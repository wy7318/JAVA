
public class Project1 {
	
	// Part 1 - non-recursive function to compute n!
	public static int fact(int n) {
		int ret = 1;
		if (n > 1) {
			for (int ii=n;ii>1;ii--)
				ret = ret * ii;
		}
		return ret;
	}
	
	// Part 2 - Prompt for number, print 1 .. N with conditions
	public static void printThem(int n) {
		for (int ii=1;ii<=n;ii++) {
			if (ii % 5 == 0) {
				continue;
			}
			if (ii % 4 == 0) {
				System.out.print("ffff");
			}
			if (ii % 7 == 0) {
				System.out.print("seven");
			}
			if ( (ii % 4 != 0) && (ii % 7 != 0) ) {
				System.out.print(ii);
			}
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		System.out.println("Factorial:");
		for (int ii=0;ii<20;ii++)
			System.out.println("  " + ii + "!=" + fact(ii));
	
		System.out.println("\n qqqqseven(10)");
		printThem(10);

		System.out.println("\n qqqqseven(40)");
		printThem(40);
		
		MapColoring.colorMap();
	}
}
