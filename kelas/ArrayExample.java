import java.util.ArrayList;

public class ArrayExample {

  public static void main(String[] args) {
    int[] input = { 24, 21, 47, 40, 42, 7, 80, 5 };

    // Sort the input array
    bubbleSort(input);

    // Create an ArrayList of ArrayLists to store groups of elements
    ArrayList<ArrayList<Integer>> groups = new ArrayList<>();

    // Initialize groups
    for (int i = 0; i < 5; i++) {
      groups.add(new ArrayList<>());
    }

    // Group elements based on their tens digit
    int currentTens = 0;
    for (int value : input) {
      int tensDigit = value / 10;
      if (tensDigit != currentTens) {
        currentTens = tensDigit;
      }
      groups.get(currentTens).add(value);
    }

    // Print the groups
    for (int i = 0; i < groups.size(); i++) {
      System.out.print("Array " + i + " : ");
      if (groups.get(i).isEmpty()) {
        System.out.println();
      } else {
        for (int j = 0; j < groups.get(i).size(); j++) {
          System.out.print(groups.get(i).get(j));
          if (j < groups.get(i).size() - 1) {
            System.out.print(", ");
          }
        }
        System.out.println();
      }
    }
  }

  public static void bubbleSort(int[] array) {
    int n = array.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          // Swap elements
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
  }
}
