package dailyproblems;

import java.util.Arrays;

class ArrayProduct {
  int[] execute(int[] numbers) {
    int [] output = new int[numbers.length];

    int sum = Arrays.stream(numbers).reduce(1, (left, right) -> left * right);

    for (int i = 0; i < numbers.length; i++) {
      output[i] = sum / numbers[i];
    }

    return output;
  }
}
