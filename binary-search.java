public class Algorithms {

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
            int middle = start + (end - start) / 2;

            if (numbers[middle] == desiredNumber) {
                return middle; 
            }

            if (numbers[middle] > desiredNumber) { 
                end = middle - 1;
            } else { 
                start = middle + 1; 
            }
        }
        
        return -1;
    }
}