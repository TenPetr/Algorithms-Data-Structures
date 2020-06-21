public class Main {

     public static void main(String []args){
        int numbers[] = {12, 13, 15, 16, 18, 20, 22, 23, 26};
        int index = BinarySearch.search(numbers, 20);
        printResult(index);
     }
     
     public static void printResult(int index) {
         if (index < 0) {
             System.out.println("Desired item not found.");
         } else {
             System.out.println("Desired item found at index " + index);
         }
     }
}

class BinarySearch {
    
    public static int search(int numbers[], int desiredNumber) {
        int start = 0;
        int end = numbers.length - 1;
        
        while (start <= end) {

	    // Calculate middle index
            int middle = start + (end - start) / 2;

	    // Check if desiredNumber is present at middle
            if (numbers[middle] == desiredNumber) {
                return middle; 
            }

	    // If desiredNumber is greater, ignore left half, else ignore right half
            if (numbers[middle] > desiredNumber) { 
                end = middle - 1;
            } else { 
                start = middle + 1; 
            }
        }
        
	// If we reach here, then element was not present 
        return -1;
    }
}
