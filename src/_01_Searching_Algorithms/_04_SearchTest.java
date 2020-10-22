package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String value = "pig";
		String[] animals = {"goat", "cow", "pig", "axolotl"};
		assertEquals(2, _00_LinearSearch.linearSearch(animals, value));
		String winner = "glowy boi";
		String[] contestants = {"glowy boi", "chillager", "pi cow"};
		assertEquals(0, _00_LinearSearch.linearSearch(contestants, winner));
		String weekday = "Thursday";
		String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		assertEquals(3, _00_LinearSearch.linearSearch(days, weekday));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int value = 85;
		int[] values = {6, 9, 39, 85, 93, 402};
		assertEquals(3, _01_BinarySearch.binarySearch(values, 0, 4, value));
		
		int glowBerry = 117;
		int[] updates = {109, 111, 113, 116, 117, 120, 132};
		assertEquals(4, _01_BinarySearch.binarySearch(updates, 0, 5, glowBerry));
		
		int ID = 420;
		int[] IDs = {37, 69, 112, 146, 186, 239, 276, 314, 351, 419, 493};
		assertEquals(-1, _01_BinarySearch.binarySearch(IDs, 0, 10, ID));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int strings = 6;
		int[] possibleStrings = {4, 6, 8, 10};
		assertEquals(1, _02_InterpolationSearch.interpolationSearch(possibleStrings, strings));
		
		int color = 264;
		int[] colors = {232, 248, 264, 280};
		assertEquals(2, _02_InterpolationSearch.interpolationSearch(colors, color));
		
		int outlier = 121;
		int[] values = {45, 62, 79, 96, 113, 130};
		assertEquals(-1, _02_InterpolationSearch.interpolationSearch(values, outlier));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int volume = 21;
		int[] volumes = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22};
		assertEquals(20, _03_ExponentialSearch.exponentialSearch(volumes, volume));
		
		int day = 4;
		int[] days = {1,2,3,4,5,6,7};
		assertEquals(3, _03_ExponentialSearch.exponentialSearch(days, day));
		
		
		
		
		int indent = 4;
		int[] indents = {0, 1, 2, 3, 12};
		assertEquals(-1, _03_ExponentialSearch.exponentialSearch(indents, indent));
	}
}
