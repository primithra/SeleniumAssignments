package collectionsprogram;

public class RemoveDuplicatesWords {

	/*
	 * Pseudo code 

	 * a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";
	 *
	 *Output= We learn java basics as part of sessions in week1
	 *
	 * Psuedocode
	 *
	 * b) Split the String based on white spaces and save as String Array ,Then iterate the Array	  
	 * c) Create a empty Set 
	 * d) Iterate the String array
                 d.1) add each word into Set
	 * e) Print the Set values which is having unique words
	 */
}
	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] split1 = text.split(" ");
		
		Set<String> set = new LinkedHashSet<>();
		
		for (int i = 0; i < split1.length; i++)
		{
			set.add(split1[i]);
		}
		
		System.out.println(set);
		//use join to set to string with space as deliimiter
		String removedString = String.join(" ", set);
		System.out.println(removedString);
		
		}

}

