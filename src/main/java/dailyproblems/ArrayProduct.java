package dailyproblems;

import java.util.Arrays;

class ArrayProduct {
  int[] execute(int[] numbers) {
    int product = Arrays.stream(numbers).reduce(1, (left, right) -> left * right);
    return Arrays.stream(numbers).map(number -> product / number).toArray();
  }
}
