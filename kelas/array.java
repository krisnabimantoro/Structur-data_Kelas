public class array {

  public static void main(String[] args) {
    int[] input = {
      11,
      10,
      21,
      22,
      47,
      40,
      42,
      45,
      7,
      80,
      82,
      5,
      18,
      100,
      102,
    };

    bubbleSort(input);

    int[][] groups = new int[input.length][input.length];
    // for (int i = 0; i < input.length; i++) {
    //   System.out.println(input[i]);
    // }

    int x = 10;
    int y = 0;

    for (int i = 0; i < input.length; i++) {
      if (input[i] < x) {
        groups[y][i] = input[i];
        // System.out.print(input[i] + ", ");
        // System.out.print("Array "+y+" : "+groups[y][i]);
      } else {
        y++;
        x += 10;
        // System.out.println(x);
        // System.out.println();
      }
    }

    for (int i = 0; i < groups.length; i++) {
      System.out.print("Array " + i + " : ");
      for (int j = 0; j < groups.length; j++) {
        // if (groups[i][j] == 0) {} else {
        // }
        System.out.print(groups[i][j] + ", ");
      }
      System.out.println();
    }
  }

  //   for (int num : input) {
  //   int groupNumber = num / 10;
  //   if (groups[groupNumber] <= 0)
  //     groups[groupNumber] = num;
  //   else
  //     groups[groupNumber] = groups[groupNumber] * 1000 + num;
  // }

  // for (int i = 0; i < groups.length; i++) {
  //   System.out.print("Array " + i + " = ");
  //   int temp = groups[i];
  //   while (temp > 0) {
  //     int digit = temp % 100;
  //     System.out.print(digit);
  //     temp /= 100;
  //     if (temp != 0) System.out.print(", ");
  //   }
  //   System.out.println();
  // }

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
