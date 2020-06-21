class Main {
  public static void main(String[] args) {
    int numbers[] = {1, 5, 80, 2, 3, 50, 14};
    int desiredNumber = 100;
    int index = LinearSearch.search(numbers, desiredNumber);
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

class LinearSearch {
  public static int search(int numbers[], int desiredNumber) {
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == desiredNumber) {
        return i;
      }
    }
    return -1;
  }
}