/*
 * week4CodingAssignment
 * 
 * Patrick Murray
 *
 * 11/28/2023
 * 
 */
package coding.assignment;

import java.util.Arrays;

public class week4CodingAssignment {

	public static void main(String[] args) {
		/*
		 * 1. Create an array of int called ages that contains the following values: 3,
		 * 9, 23, 64, 2, 8, 28, 93.
		 */
		System.out.println("Question 1");
		int[] ages = { 3, 9, 23, 64, 2, 8, 28, 93 };
		System.out.print("ages" + Arrays.toString(ages));
		System.out.println("\n");
		/*
		 * a. Programmatically subtract the value of the first element in the array from
		 * the value in the last element of the array (i.e. do not use ages[7] in your
		 * code). Print the result to the console.
		 */
		System.out.println("Question 1 a");
		System.out.println("ages[ages.length-1] - ages[0] = " + (ages[ages.length - 1] - ages[0]));
		System.out.println();

		/*
		 * b. Create a new array of int called ages2 with 9 elements (ages2 will be
		 * longer than the ages array, and have more elements).
		 */
		System.out.println("Question 1b");
		int[] ages2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.print("ages2" + Arrays.toString(ages2));
		System.out.println("\n");
		/*
		 * i. Make sure that there are 9 elements of type int in this new array.
		 */
		System.out.println("Question 1b i");
		System.out.println("ages2.length = " + ages2.length);
		System.out.println();
		/*
		 * ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the
		 * value of the first element in the new array ages2 from the last element of
		 * ages2).
		 */
		System.out.println("Question 1b ii");
		System.out.println("ages2[ages2.length-1] - ages2[0] = " + (ages2[ages2.length - 1] - ages2[0]));
		System.out.println("\n");

		/*
		 * iii. Show that using the index values for the elements is dynamic (works for
		 * arrays of different lengths).
		 */
		System.out.println("Question 1b iii");
		System.out.println("ages.length = " + ages.length);
		System.out.println("ages2.length = " + ages2.length);
		System.out.println();
		/*
		 * c. Use a loop to iterate through the array and calculate the average age.
		 * Print the result to the console.
		 */
		System.out.println("Question 1c");
		int sum = 0;
		for (int age : ages) {
			sum += age;
		}
		double average = (double) sum / ages.length;
		System.out.println("The average of ages array = " + average);

		/*
		 * 2. Create an array of String called names that contains the following values:
		 * “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		 */
		displaySeparator();
		System.out.println("Question 2");
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
		System.out.print("names" + Arrays.toString(names));
		System.out.println("\n");
		/*
		 * a. Use a loop to iterate through the array and calculate the average number
		 * of letters per name. Print the result to the console.
		 */
		System.out.println("Question 2a");
		int lettersPerName = 0;
		for (String name : names) {
			lettersPerName += name.length();
		}
		double averageLettersPerName = (double) lettersPerName / names.length;
		System.out.println("The average of length of each name in names is = " + averageLettersPerName);
		System.out.println();
		/*
		 * b. Use a loop to iterate through the array again and concatenate all the
		 * names together, separated by spaces, and print the result to the console.
		 */
		System.out.println("Question 2b");
		String concatNames = "";
		for (String name : names) {
			concatNames += name + " ";
		}
		System.out.println(concatNames.trim());

		/*
		 * 3. How do you access the last element of any array?
		 */
		displaySeparator();
		System.out.println("Question 3");
		System.out.println(
				"The last element of any array can be accessed by subtracting 1 from the length property of the array.");
		/*
		 * 4. How do you access the first element of any array?
		 */
		displaySeparator();
		System.out.println("Question 4");
		System.out.println("The first element of any array can be accessed using the index 0");

		/*
		 * 5. Create a new array of int called nameLengths. Write a loop to iterate over
		 * the previously created names array and add the length of each name to the
		 * nameLengths array.
		 */
		displaySeparator();
		System.out.println("Question 5");
		int len = names.length;
		int nameLengths[] = new int[len];
		for (int i = 0; i < len; i++) {
			nameLengths[i] = names[i].length();
		}
		System.out.println("nameLengths" + Arrays.toString(nameLengths));

		/*
		 * 6. Write a loop to iterate over the nameLengths array and calculate the sum
		 * of all the elements in the array. Print the result to the console.
		 */
		displaySeparator();
		System.out.println("Question 6");
		sum = 0;
		for (int item : nameLengths) {
			sum += item;
		}
		System.out.println("The sum of the elements in nameLenghts is: " + sum);
		/*
		 * 7. Write a method that takes a String, word, and an int, n, as arguments and
		 * returns the word concatenated to itself n number of times. (i.e. if I pass in
		 * “Hello” and 3, I expect the method to return “HelloHelloHello”).
		 */
		displaySeparator();
		System.out.println("Question 7");
		System.out.println("repeatWord(\"Hello\", 3)-> " + repeatWord("Hello", 3));
		/*
		 * 8. Write a method that takes two Strings, firstName and lastName, and returns
		 * a full name (the full name should be the first and the last name as a String
		 * separated by a space).
		 */
		displaySeparator();
		System.out.println("Question 8");
		System.out.println("printFullName(\"Patrick\", \"Murray\")-> " + printFullName("Patrick", "Murray"));
		/*
		 * 9. Write a method that takes an array of int and returns true if the sum of
		 * all the ints in the array is greater than 100.
		 */
		displaySeparator();
		System.out.println("Question 9");
		int[] array99 = { 25, 25, 25, 24 };
		int[] array100 = { 25, 25, 25, 25 };
		int[] array101 = { 25, 25, 25, 26 };
		System.out.println("sumIsGreaterThan100([25, 25, 25, 24])-> " + sumIsGreaterThan100(array99));
		System.out.println("sumIsGreaterThan100([25, 25, 25, 25])-> " + sumIsGreaterThan100(array100));
		System.out.println("sumIsGreaterThan100([25, 25, 25, 26])-> " + sumIsGreaterThan100(array101));
		/*
		 * 10. Write a method that takes an array of double and returns the average of
		 * all the elements in the array.
		 */
		displaySeparator();
		System.out.println("Question 10");
		double dblArray[] = { 10.0, 15.0, 20.0, 25.0, 32.5 }; // avg 20.5
		System.out.println("getAverage([10.0, 15.0, 20.0, 25.0, 32.5])-> " + getAverage(dblArray));
		/*
		 * 11. Write a method that takes two arrays of double and returns true if the
		 * average of the elements in the first array is greater than the average of the
		 * elements in the second array.
		 */
		displaySeparator();
		System.out.println("Question 11");
		double dblArray2[] = { 10.0, 15.0, 20.0, 25.0, 30.0 }; // avg 20.0
		System.out
				.println("isFirstAverageGreater(dblArray, dblArray2) -> " + isFirstAverageGreater(dblArray, dblArray2));
		System.out
				.println("isFirstAverageGreater(dblArray2, dblArray) -> " + isFirstAverageGreater(dblArray2, dblArray));
		System.out.println("isFirstAverageGreater(dblArray, dblArray) -> " + isFirstAverageGreater(dblArray, dblArray));
		/*
		 * 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and
		 * a double moneyInPocket, and returns true if it is hot outside and if
		 * moneyInPocket is greater than 10.50.
		 */
		displaySeparator();
		System.out.println("Question 12");
		System.out.println("willBuyDrink(true, 10.51) -> " + willBuyDrink(true, 10.51));
		System.out.println("willBuyDrink(false, 10.51) -> " + willBuyDrink(false, 10.51));
		System.out.println("willBuyDrink(true, 10.50) -> " + willBuyDrink(true, 10.50));
		System.out.println("willBuyDrink(true, 10.49) -> " + willBuyDrink(true, 10.49));

		/*
		 * 13. Create a method of your own that solves a problem. In comments, write
		 * what the method does and why you created it.
		 */
		displaySeparator();
		System.out.println("Question 13");
		double dataSet[] = { 5.2, 3.8, 7.0, 9.1, 6.4, 7.5, 8.3, 5.5 };
		displayStatistics(dataSet);

	}

	/** Method 13:<p>
	 * 
	 * <code>displayStatistics</code>
	 * 
	 * a method that takes in an array of type double and finds common descriptive statistics
	 * and prints theses values to the console.<p>
	 * 
	 * - Min is the minimum value in the dataset<p>
	 * - Max is the maximum value  in the dataset<p>
	 * - Mean is the average of the values in the dataset<p>
	 * - Median is the average of the centerpoint of the dataset<p>
	 * - Sum is the sum value of all data in the dataset<p>
	 * - Standard Deviation is the amount of the variation in the dataset<p>
	 * 
	 * I have created this method as a exercise to practice using arrays, methods,
	 * standard for loops and enhanced for loops,and if/else statements
	 * @author Patrick Murray
	 * @param dataSet an array of doubles containing the dataset
	 */
	public static void displayStatistics(double[] dataSet) {
		
		// Sort the dataset
		double sortedArr[] = (sortDoubleArray(dataSet));
		
		int len = sortedArr.length;
		double sum = 0;
		double mean = 0;
		double median = 0;
		double standardDeviation = 0;
		
		
		// min is first element of sorted array, max is last element
		double min = sortedArr[0];
		double max = sortedArr[sortedArr.length-1];
		
		//calculate sum
		for (int i = 0; i < len; i++) {
			// calculate sum
			sum += sortedArr[i];

		}
		// find median
		if (len % 2 == 0) {//if the dataset contains an even number of items
			// find average of two middle values
			median = (sortedArr[len / 2] + sortedArr[(len / 2) - 1]) / 2;
		} else { //if the dataset contains an odd number of items
			// find the middle value
			median = sortedArr[len / 2];
		}

		// calculate mean
		mean = sum / len;
		
		//calculate standard Deviation

		//The variance for each data point is calculated by subtracting
		//the mean from the value of the data point and then squaring the resulting value.
		//each variance is added to the sum of all variances
		for(double num: dataSet) {
            standardDeviation += Math.pow(num - mean, 2);
        }
		// calculate the square root of the sum of variances divided by 
		// the number of data points in the dataSet to find the standard deviation.
		standardDeviation =Math.sqrt(standardDeviation/len);
		
		// print statistics to the console
		System.out.println("Data Set: "+ Arrays.toString(sortedArr));
		System.out.println("Min Value: " + min);
		System.out.println("Max Value: " + max);
		System.out.printf("Mean Value: %.4f\n", mean);
		System.out.printf("Median Value: %.4f\n", median);
		System.out.printf("Sum: %.4f\n", sum);
		System.out.printf("Standard Deviation: %.4f\n", standardDeviation);

	}

	/**
	 * <code>sortDoubleArray</code>
	 * 
	 * a method that takes in an array of type double and returns a sorted array<p>
	 * 
	 * this method uses a selection sort to sort the array
	 * 
	 * @author Patrick Murray
	 * @param arr an array of doubles containing the data
	 * @return a sorted array of double values in ascending order
	 */
	public static double[] sortDoubleArray(double[] arr) {

		int pos; // position in the array of the current element we are evaluating
		double temp; // temporary placeholder variable

		// loop through each element in the array
		for (int i = 0; i < arr.length; i++) {
			pos = i; // fix the position of the current element
			
			// loop through the remainder of the array 
			for (int j = i + 1; j < arr.length; j++) {
				
				// find the index of the minimum element
				if (arr[j] < arr[pos]) {
					pos = j;
				}
			}
			// swap the current element with the minimum element
			temp = arr[pos];
			arr[pos] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}

	/**
	 * Method 12:
	 * <p>
	 * 
	 * <code>willBuyDrink</code>
	 * 
	 * a method that takes a boolean isHotOutside, and a double moneyInPocket, and
	 * returns true if it is hot outside and if moneyInPocket is greater than 10.50
	 * 
	 * @param isHotOutside boolean
	 * @param moneyInPocket double
	 * @return true if it is hot outside AND if moneyInPocket is greater than 10.50
	 */
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return (isHotOutside && moneyInPocket > 10.50);
	}

	/**
	 * Method 11:
	 * <p>
	 * 
	 * <code>isFirstAverageGreater</code>
	 * 
	 * a method that takes two arrays of double and returns true if the average of
	 * the elements in the first array is greater than the average of the elements
	 * in the second array
	 * 
	 * @param arr1 double[]
	 * @param arr2 double[]
	 * @return true if the average of the elements in the first array is greater than
	 *  the average of the elements in the second array
	 */
	public static boolean isFirstAverageGreater(double[] arr1, double[] arr2) {
		// uses getAverage to calculate the average of each array
		// and returns the result of the comparison
		return getAverage(arr1) > getAverage(arr2);
	}

	/**
	 * Method 10:
	 * <p>
	 * 
	 * <code>getAverage</code>
	 * 
	 * a method that takes an array of double and returns the average of all the
	 * elements in the array
	 * 
	 * @param arr double[]
	 * @return average(mean) value of all elements in the array
	 */
	public static double getAverage(double[] arr) {
		double sum = 0;
		double average = 0;
		for (double item : arr) {
			sum += item;
		}
		average = sum / arr.length;
		return average;
	}

	/**
	 * Method 9:
	 * <p>
	 * <code>sumIsGreaterThan100</code>
	 * 
	 * a method that takes an array of int and returns true if the sum of all the
	 * ints in the array is greater than 100
	 * 
	 * @param arr int[]
	 * @return true if the sum of all the integers in the array is greater than 100
	 */
	public static boolean sumIsGreaterThan100(int[] arr) {
		int sum = 0;
		for (int element : arr) {
			sum += element;
		}
		return sum > 100;
	}

	/**
	 * Method 8:
	 * <p>
	 * <code>printFullName</code>
	 * 
	 * a method that takes two Strings, firstName and lastName, and returns a full
	 * name (the full name should be the first and the last name as a String
	 * separated by a space)
	 * 
	 * @param firstName string
	 * @param lastName string
	 * @return the concatenation of firstName and lastName with a single space in between
	 */
	public static String printFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}

	/**
	 * Method 7:
	 * <p>
	 * <code>repeatWord</code>
	 * 
	 * a method that takes a String, word, and an int, n, as arguments and returns
	 * the word concatenated to itself n number of times
	 * 
	 * @param word string
	 * @param n int
	 * @return the input string concatenated to itself n number of times
	 */
	public static String repeatWord(String word, int n) {
		return word.repeat(n);
	}

	/**
	 * <code>displaySeparator</code>
	 * 
	 * Prints a line of 25 dashes to the console followed by a new line character.
	 * Used for separating output for each question.
	 * 
	 */
	public static void displaySeparator() {
		StringBuilder result = new StringBuilder("");
		for (int i = 0; i < 25; i++) {
			result.append("-");
		}
		result.append("\n");
		System.out.println(result);
	}

}
