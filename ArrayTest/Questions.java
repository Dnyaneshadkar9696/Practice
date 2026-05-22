package ArrayTest;

public class Questions {

	// Question 1
	// To reverse an array
	public void calling() {

		this.reverseArray();
		System.out.println();

		System.out.println();
		this.revArray(); // with like storing in another array

		System.out.println();
		System.out.println();
		this.findFrquency(); // basically finding the count in array

		System.out.println();
		System.out.println("Two Sum : ");
		this.twoSum();

		System.out.println();
		this.prefixSum();

	}

	public void reverseArray() {

		int[] arr1 = { 1, 2, 3, 4, 5 };

		System.out.println("Reversed Array : ");
		for (int i = arr1.length - 1; i >= 0; i--) {

			System.out.print(+arr1[i] + " ");
		}

	}

	// 2nd rev array if we want to store the array in another array

	public void revArray() {

		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = new int[arr1.length];

		int j = 0;

		for (int i = arr1.length - 1; i >= 0; i--) {

			arr2[j] = arr1[i];

			j++;
		}

		// now print the arr2
		System.out.println("Reversed Array: ");
		for (int t = 0; t < arr2.length; t++) {
			System.out.print(arr2[t] + " ");
		}

	}

	// find the frequency of the elements

	public void findFrquency() {

		int[] arrFre = { 1, 2, 2, 3, 1, 4 };

		int count = 0;

		boolean[] duplicate = new boolean[arrFre.length];

		for (int i = 0; i < arrFre.length; i++) {

			// we create array of boolean

			if (duplicate[i]) {
//				 it will check basically the value is True then get into the block and contiue, as the duplicate is already counted in the i
//				nner block
				continue;
			}

			for (int j = 0; j < arrFre.length; j++) {

				if (arrFre[i] == arrFre[j]) {
					count++;

					// we are making the values true in the boolean array

					duplicate[j] = true;
				}
			}

			System.out.println("Countof :" + arrFre[i] + " = " + count);

			count = 0;
		}
	}

	// Question 3

	// Two sum problem

	public void twoSum() {

		int[] arr = { 2, 7, 8, 34 };

//		target is like 9 so we have to return the index.
		int target = 9;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				if (arr[i] + arr[j] == target) {
					System.out.println("[ " + i + "," + j + " ]");
					return;

					// the method will print the value and one hit the return not print the value
					// further
				}
			}
		}
	}

	// Question 3 Prefix sum means add elements from the given range

	public void prefixSum() {

		int[] arrt = { 2, 4, 1, 5, 3 };

		// Queries
		// Sum(0 , 2)
		// Sum(1 , 4)

//		means do the addition from 0 to the 2
		int n = 3;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum = sum + arrt[i];
		}
		

		System.out.println(sum);

		int total = 0;
		int s = 5;

		for (int j = 1; j < s; j++) {
			total = total + arrt[j];
		}
		

		System.out.println(total);
	}
	
	

}
