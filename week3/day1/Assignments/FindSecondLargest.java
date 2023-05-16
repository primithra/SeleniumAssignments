package collectionsprogram;

public class FindSecondLargest {

	public static void main(String[] args) {

		// Here is the input
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		//       output= 7;

		/*
		 * Pseudo Code: 
		 * a) Create a empty Set Using TreeSet
		 * b) Declare for loop iterator from 0 to data.length and add into Set 
		 * c) converted Set into List
		 * d) Print the second last element from List
		 * 
		 * 
		 */
int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Arrays.sort(data);		
		
		Set<Integer> set1= new TreeSet<>();
		
		for (int i = 0; i < data.length; i++)
		{
			set1.add(data[i]);
		}
		System.out.println(set1);
		List<Integer> list = new ArrayList<>(set1);//[2,3,4,6,7,11]
		//to get 2nd largest num from list
		//listsize - 2 = (2nd largest num)[7] //size -3 =[6](3rd largest num)
		System.out.println(list.get(list.size()-2));
		



	}}
