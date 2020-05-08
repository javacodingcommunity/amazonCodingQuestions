public class TripletSolution {
	
	
	// method that checks for triplets
	public static int check(int[] array) {
		int counter = 0; // number of triplets

		// we start by taking every element
		for(int i = 0;i<array.length-1;i++) { // length-1 because
			// we already check the last element with everything
			
			for(int j = i+1;j<array.length;j++) {
					// j= i+1 because we don't want duplicates
				   // so we ignore the elements we already
				// compared
				
					int sum = array[i] + array[j]; // calculate the sum
					
					for(int k = 0;k<array.length;k++) {
						// checks if sum is in the array
						if(sum == array[k]) {
							counter++;
						}
					}
				
			}

		}
		if(counter != 0) {
			return counter;
		}
		else
		return -1;
		
	}

	public static void main(String[] args) {
		int[] array_test = {1,3,5,2};
		System.out.println(check(array_test));
		
		int[] arr = {1,5,3,2,6,7};
		System.out.println(check(arr));
		
		
	}

}
