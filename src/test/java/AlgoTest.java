package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;

public class AlgoTest {

	Item[] Vector_1 = new Item[] {new Item(1), new Item(2), new Item(3), new Item(4), new Item(5)};
	
	//Node coverage and edge coverage test case 1
	
	@Test
	public void workingBubbleSort() {
		SortAlgos algos = new SortAlgos();
		
		Item[] b = new Item[] {new Item(5), new Item(4), new Item(3), new Item(2), new Item(1)};
		algos.bubbleSort(b);
		
		assertTrue(Vector_1[0].key == b[0].key);
		assertTrue(Vector_1[1].key == b[1].key);
		assertTrue(Vector_1[2].key == b[2].key);
		assertTrue(Vector_1[3].key == b[3].key);
		assertTrue(Vector_1[4].key == b[4].key);
	}

	//Edge Coverage test case 2 and Condition coverage test 3
	@Test
	public void BubbleSortForAlreadySortedItems() {
		SortAlgos algos = new SortAlgos();
			
		Item[] b = new Item[]{new Item(1),new Item(2),new Item(3),new Item(4),new Item(5)};
		algos.bubbleSort(b);		
		assertTrue(Vector_1[0].key == b[0].key);
		assertTrue(Vector_1[1].key == b[1].key);
		assertTrue(Vector_1[2].key == b[2].key);
		assertTrue(Vector_1[3].key == b[3].key);
		assertTrue(Vector_1[4].key == b[4].key);
			
	}
		
	//Edge and Condition coverage test 1	
	@Test
	public void BubbleSortForNull() {
		SortAlgos algos = new SortAlgos();
				
		try {
			algos.bubbleSort(null);
			} catch (NullPointerException e) {
				assertNull(e.getMessage());
			}
				
	}
			
	//Edge Condition coverage test 2
	@Test
	public void BubbleSortForOneInput() {
		SortAlgos algos = new SortAlgos();
						
		Item[] b = new Item[]{new Item(1)};
		algos.bubbleSort(b);
					
		assertTrue(1 == b[0].key);
									
					}
	
	//Test cases for insertion sort
	@Test
	public void workingInsertionSort() {
		SortAlgos algos = new SortAlgos();
		
		Item[] b = new Item[] {new Item(5), new Item(4), new Item(3), new Item(2), new Item(1)};
		algos.insertionSort(b);
		
		assertTrue(Vector_1[0].key == b[0].key);
		assertTrue(Vector_1[1].key == b[1].key);
		assertTrue(Vector_1[2].key == b[2].key);
		assertTrue(Vector_1[3].key == b[3].key);
		assertTrue(Vector_1[4].key == b[4].key);
	}

	@Test
	public void InsertionSortForAlreadySortedItems() {
		SortAlgos algos = new SortAlgos();
			
		Item[] b = new Item[]{new Item(1),new Item(2),new Item(3),new Item(4),new Item(5)};
		algos.insertionSort(b);		
		assertTrue(Vector_1[0].key == b[0].key);
		assertTrue(Vector_1[1].key == b[1].key);
		assertTrue(Vector_1[2].key == b[2].key);
		assertTrue(Vector_1[3].key == b[3].key);
		assertTrue(Vector_1[4].key == b[4].key);
			
	}
		

	@Test
	public void InsertionSortForNull() {
		SortAlgos algos = new SortAlgos();
				
		try {
			algos.insertionSort(null);
			} catch (NullPointerException e) {
				assertNull(e.getMessage());
			}
				
	}
			
	@Test
	public void InsertionSortForOneInput() {
		SortAlgos algos = new SortAlgos();
						
		Item[] b = new Item[]{new Item(3)};
		algos.insertionSort(b);
					
		assertTrue(3 == b[0].key);
									
					}
	
	//Test cases for selection sort
	@Test
	public void workingSelectionSort() {
		SortAlgos algos = new SortAlgos();
		
		Item[] b = new Item[] {new Item(5), new Item(4), new Item(3), new Item(2), new Item(1)};
		algos.selectionSort(b);
		
		assertTrue(Vector_1[0].key == b[0].key);
		assertTrue(Vector_1[1].key == b[1].key);
		assertTrue(Vector_1[2].key == b[2].key);
		assertTrue(Vector_1[3].key == b[3].key);
		assertTrue(Vector_1[4].key == b[4].key);
	}

	@Test
	public void SelectionSortForAlreadySortedItems() {
		SortAlgos algos = new SortAlgos();
			
		Item[] b = new Item[]{new Item(1),new Item(2),new Item(3),new Item(4),new Item(5)};
		algos.selectionSort(b);		
		assertTrue(Vector_1[0].key == b[0].key);
		assertTrue(Vector_1[1].key == b[1].key);
		assertTrue(Vector_1[2].key == b[2].key);
		assertTrue(Vector_1[3].key == b[3].key);
		assertTrue(Vector_1[4].key == b[4].key);
			
	}
		

	@Test
	public void SelectionSortForNull() {
		SortAlgos algos = new SortAlgos();
				
		try {
			algos.selectionSort(null);
			} catch (NullPointerException e) {
				assertNull(e.getMessage());
			}
				
	}
			
	@Test
	public void SelectionSortForOneInput() {
		SortAlgos algos = new SortAlgos();
						
		Item[] b = new Item[]{new Item(2)};
		algos.selectionSort(b);
					
		assertTrue(2 == b[0].key);
									
		}
	
	//Test cases for merge sort
	
	@Test
	public void workingMergeSort() {
		SortAlgos algos = new SortAlgos();
		
		Item[] b = new Item[] {new Item(5), new Item(4), new Item(3), new Item(2), new Item(1)};
		algos.mergeSort(b);
		
		assertTrue(Vector_1[0].key == b[0].key);
		assertTrue(Vector_1[1].key == b[1].key);
		assertTrue(Vector_1[2].key == b[2].key);
		assertTrue(Vector_1[3].key == b[3].key);
		assertTrue(Vector_1[4].key == b[4].key);
	}

	@Test
	public void MergeSortForAlreadySortedItems() {
		SortAlgos algos = new SortAlgos();
			
		Item[] b = new Item[]{new Item(1),new Item(2),new Item(3),new Item(4),new Item(5)};
		algos.mergeSort(b);		
		assertTrue(Vector_1[0].key == b[0].key);
		assertTrue(Vector_1[1].key == b[1].key);
		assertTrue(Vector_1[2].key == b[2].key);
		assertTrue(Vector_1[3].key == b[3].key);
		assertTrue(Vector_1[4].key == b[4].key);
			
	}
		

	@Test
	public void MergeSortForNull() {
		SortAlgos algos = new SortAlgos();
				
		try {
			algos.mergeSort(null);
			} catch (NullPointerException e) {
				assertNull(e.getMessage());
			}
				
	}
			
	@Test
	public void MergeSortForOneInput() {
		SortAlgos algos = new SortAlgos();
						
		Item[] b = new Item[]{new Item(2)};
		algos.mergeSort(b);
					
		assertTrue(2 == b[0].key);
									
		}
	
	//Test cases for Quick sort
	
	@Test
	public void workingQuickSort() {
		SortAlgos algos = new SortAlgos();
		
		Item[] b = new Item[] {new Item(5), new Item(4), new Item(3), new Item(2), new Item(1)};
		algos.quickSort(b);
		
		assertTrue(Vector_1[0].key == b[0].key);
		assertTrue(Vector_1[1].key == b[1].key);
		assertTrue(Vector_1[2].key == b[2].key);
		assertTrue(Vector_1[3].key == b[3].key);
		assertTrue(Vector_1[4].key == b[4].key);
	}

	@Test
	public void QuickSortForAlreadySortedItems() {
		SortAlgos algos = new SortAlgos();
			
		Item[] b = new Item[]{new Item(1),new Item(2),new Item(3),new Item(4),new Item(5)};
		algos.quickSort(b);		
		assertTrue(Vector_1[0].key == b[0].key);
		assertTrue(Vector_1[1].key == b[1].key);
		assertTrue(Vector_1[2].key == b[2].key);
		assertTrue(Vector_1[3].key == b[3].key);
		assertTrue(Vector_1[4].key == b[4].key);
			
	}
		

	@Test
	public void QuickSortForNull() {
		SortAlgos algos = new SortAlgos();
				
		try {
			algos.quickSort(null);
			} catch (NullPointerException e) {
				assertNull(e.getMessage());
			}
				
	}
			
	@Test
	public void QuickSortForOneInput() {
		SortAlgos algos = new SortAlgos();
						
		Item[] b = new Item[]{new Item(2)};
		algos.quickSort(b);
					
		assertTrue(2 == b[0].key);
									
		}
	
	//Test cases for heap sort
	
	@Test
	public void workingHeapSort() {
		SortAlgos algos = new SortAlgos();
		
		Item[] b = new Item[] {new Item(5), new Item(4), new Item(3), new Item(2), new Item(1)};
		algos.heapSort(b);
		
		assertTrue(Vector_1[0].key == b[0].key);
		assertTrue(Vector_1[1].key == b[1].key);
		assertTrue(Vector_1[2].key == b[2].key);
		assertTrue(Vector_1[3].key == b[3].key);
		assertTrue(Vector_1[4].key == b[4].key);
	}

	@Test
	public void HeapSortForAlreadySortedItems() {
		SortAlgos algos = new SortAlgos();
			
		Item[] b = new Item[]{new Item(1),new Item(2),new Item(3),new Item(4),new Item(5)};
		algos.heapSort(b);		
		assertTrue(Vector_1[0].key == b[0].key);
		assertTrue(Vector_1[1].key == b[1].key);
		assertTrue(Vector_1[2].key == b[2].key);
		assertTrue(Vector_1[3].key == b[3].key);
		assertTrue(Vector_1[4].key == b[4].key);
			
	}
		

	@Test
	public void HeapSortForNull() {
		SortAlgos algos = new SortAlgos();
				
		try {
			algos.heapSort(null);
			} catch (NullPointerException e) {
				assertNull(e.getMessage());
			}
				
	}
			
	@Test
	public void HeapSortForOneInput() {
		SortAlgos algos = new SortAlgos();
						
		Item[] b = new Item[]{new Item(2)};
		algos.heapSort(b);
					
		assertTrue(2 == b[0].key);
									
					}
	
	
	
}
