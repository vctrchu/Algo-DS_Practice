public class Main {

	public static int[] mergeArrays(int[] array1, int[] array2) {

		int[] mergedArrays = new int[array1.length + array2.length];
		int pointer1 = 0;
		int pointer2 = 0;
		int totalPointer = 0;

		while (totalPointer < mergedArrays.length) {
			if (pointer1 >= array1.length) {
				mergedArrays[totalPointer] = array2[pointer2];
				pointer2++;
			} else if (pointer2 >= array2.length) {
				mergedArrays[totalPointer] = array1[pointer1];
				pointer1++;
			} else if (array1[pointer1] < array2[pointer2]) {
				mergedArrays[totalPointer] = array1[pointer1];
				pointer1++;
			} else {
				mergedArrays[totalPointer] = array2[pointer2];
				pointer2++;
			}
			totalPointer++;
		}

		return mergedArrays;
	}


	public static void main(String[] args) {
		int[] array1 = {3,4};
		int[] array2 = {1,5};
		int[] result = mergeArrays(array1, array2);
		for (int num : result) {
			System.out.println(num);
		}
	}
}

/*
	Optimized
	[3,4]
	[1,5]
	
	3,4
	5
	1

	4
	5
	1,3

	[]
	5
	1,3,4

	time complexity of O(n) where n is the sum of array 1 and array 2.
	In the worst case, we will iterate n times to fill up the merged array.

/*


/*
	
	Brute force
	[3,4,1,5]

	3,4,1,5
	1,4,3,5
	1,3,4,5

	This method requires O((n+m^2) since we must fill an array which costs n*m 
	then check (n+m) (n+m) elements.

	How can we improve this?
	Let's do this in one loop... using two pointers







*/