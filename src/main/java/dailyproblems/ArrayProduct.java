package dailyproblems;

class ArrayProduct {
  int[] execute(int[] numbers) {
    int [] output = new int[numbers.length];

    for (int i = 0; i < numbers.length; i++) {
      int acc = 1;
      for (int j = 0; j < numbers.length; j++) {
        if (i != j) {
          acc *= numbers[j];
        }
      }
      output[i] = acc;
    }

    return output;
  }
}
