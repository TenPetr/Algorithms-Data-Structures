class Main {
  public static void main(String[] args) {
    int numbers[] = {1, 5, 8, 12, 30, 50, 55, 62, 73};
    int desiredNumber = 50;
    int index = JumpSearch.search(numbers, desiredNumber);
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

/*
Jump Search is a searching algorithm for sorted arrays. The basic idea is to check fewer elements (than linear search) by jumping ahead by fixed steps or skipping some elements in place of searching all elements.
*/
class JumpSearch {
  public static int search(int numbers[], int desiredNumber) {

    // Finding block size to be jumped, the best step size is √numbers.length 
    int step = (int)Math.floor(Math.sqrt(numbers.length));
    int prev = 0;

    // Finding the block where element is present (if it is present) 
    while (numbers[Math.min(step, numbers.length) - 1] < desiredNumber) {
      prev = step;
      step += (int)Math.floor(Math.sqrt(numbers.length));

      if (prev >= numbers.length) {
        return -1;
      }
    }

    // Doing a linear search for desiredNumber in block beginning with prev
    while (numbers[prev] < desiredNumber) {
      prev++;

      // If we reached next block or end of array, element is not present
      if (prev == Math.min(step, numbers.length)) {
        return -1;
      }
    }

    // If element is found 
    if (numbers[prev] == desiredNumber) {
      return prev;
    }

    return -1;
  }
}