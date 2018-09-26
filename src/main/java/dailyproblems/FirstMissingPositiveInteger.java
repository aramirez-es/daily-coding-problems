package dailyproblems;

import java.util.Arrays;

class FirstMissingPositiveInteger {
  int execute(int[] input) {
    Arrays.sort(input);

    int firstMissingInteger = 1;
    int index = 0;

    while (index < input.length - 1 && firstMissingInteger == 1) {
      int possibleMissingInteger = input[index + 1] - input[index];
      if (input[index] > 0 && possibleMissingInteger > 1) {
        firstMissingInteger = possibleMissingInteger;
      }
      index++;
    }

    if (firstMissingInteger == 1 && input[index] > 0) {
      firstMissingInteger = input[index] + 1;
    }

    return firstMissingInteger;
  }
}
