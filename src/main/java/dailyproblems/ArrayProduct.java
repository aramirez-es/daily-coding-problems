package dailyproblems;

import java.util.Arrays;
import java.util.stream.IntStream;

class ArrayProduct {
  int[] execute(int[] numbers) {
    int product = Arrays.stream(numbers).reduce(1, (left, right) -> left * right);
    return IntStream.range(0, numbers.length).map(i -> product / numbers[i]).toArray();
  }
}
