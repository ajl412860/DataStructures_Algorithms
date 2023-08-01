import java.util.Iterator;
import java.util.Random;
import java.util.Arrays;

public class ShuffleArrays{
	
public static void main(String[] args) {
	
	int[] array1 = {2,5,4, 3, 4, 211, 32 }; 
	
	int lengthOfArray = array1.length ;   
	//int[] counter = new int[lengthOfArray]
	shuffle(array1); 
	printAll(array1);
	
	
}
	
	public static void shuffle(int[] array1){
		if(array1.length < 2) {
			System.out.println("Please enter an array bigger than 1");
		}
		
		for(int i = 0; i < array1.length; i++ ) {
		 Random ran = new Random(); 
		 int a = array1.length; 
		 
		 int b = ran.nextInt(a); 
		 
		 swapElements(array1,i,b);
		}
	}
		
	
	private static void swapElements(int[] nums, int i, int b) {
		int temp = nums[i];
		nums[i] = nums[b];
		nums[b] = temp; 
		
	}
	
	public static void printAll(int[] array2 ) {
		
		System.out.println("The Array is " + Arrays.toString(array2) );
		
	}
}
