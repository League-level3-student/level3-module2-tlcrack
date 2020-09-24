package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter{
	public BubbleSorter() {
		type = "Bubble";
	}

	int swap = 0;
	//1. Use the bubble sorting algorithm to sort the array.
	//   You can use display.updateDisplay() to show the current
	//   progress on the graph.
	@Override
	void sort(int[] array, SortingVisualizer display) {
		for(int i = 0; i < array.length; i++) {
			for(int n = 1; n < array.length; n++) {
				if(array[i]>array[n]) {
					swap=array[n];
					array[n]=array[i];
					array[i]=swap;
				}
			}
			display.updateDisplay();
		}
		
	}
	
}
