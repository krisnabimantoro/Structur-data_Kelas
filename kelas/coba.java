public class coba {

  public static void main(String[] args) {
    int[] input = { 4, 11, 21, 47, 40, 42, 7, 80, 5, 18, 100, 102 };

    bubbleSort(input);

    int[] groups = new int[input.length];

    for (int num : input) {
      int groupNumber = num / 10;
      if (groups[groupNumber] <= 0) groups[groupNumber] =
        num; 
        
        else groups[groupNumber] = groups[groupNumber] * 1000 + num;
    }

    for (int i = 0; i < groups.length; i++) {
      System.out.print("Array " + i + " = ");
      
        int temp = groups[i];
        while (temp > 0) {
          int digit = temp % 1000;
          System.out.print(digit);
          temp /= 1000;
          if (temp != 0) System.out.print(", ");
        }
        System.out.println();
      
    }
  }

  public static void bubbleSort(int[] array) {
    int n = array.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
  }
}
