import java.util.Random;

public class MapColoring {
	
	// Enum type for states with names & array index
	public enum ST {
		MS ("Mississippi", 0), 
		AL ("Alabama", 1), 
		LA ("Louisiana", 2), 
		TN ("Tennessee", 3), 
		AR ("Arkansas", 4);
	
		public final String state;
		public final int index;
		
		ST(String state, int index) {
			this.state = state;
			this.index = index;
		}
	};
	
	static void colorMap()
	{		
		Integer[] st_colors = new Integer[5];
		String[] colorvals = {"Red", "Blue", "Green"};
	    Random generator = new Random();
	    
	    // generate a random coloring then check if it is valid
		do {
			for (int ii =0; ii< 5; ii++)
				st_colors[ii]= generator.nextInt(3);
		} while (!validColors(st_colors));
		
		System.out.println("\nMap colors:");
		for (ST st : ST.values()) 
			System.out.println("  " + st.state + ": " + colorvals[st_colors[st.index]]);
	}
	
	static boolean validColors(Integer[] list)
	{
		if (list[ST.MS.index] == list[ST.AL.index])	return false;
		if (list[ST.MS.index] == list[ST.TN.index]) return false;
		if (list[ST.MS.index] == list[ST.AR.index])	return false;
		if (list[ST.MS.index] == list[ST.LA.index])	return false;
		if (list[ST.AL.index] == list[ST.TN.index])	return false;
		if (list[ST.LA.index] == list[ST.AR.index])	return false;
		if (list[ST.AR.index] == list[ST.TN.index])	return false;

		return true;
	}
}