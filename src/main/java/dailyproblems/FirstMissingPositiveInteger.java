package dailyproblems;

import java.util.Arrays;

class FirstMissingPositiveInteger {
  int execute(int[] input) {
    Arrays.sort(input);

    int firstMissingInteger;
    int possibleMissingInteger = 0;
    int index = 0;

    while (index < input.length - 1 && possibleMissingInteger < 2) {
      possibleMissingInteger = input[index+1] - input[index];
      index++;
    }

    if (possibleMissingInteger < 2) {
      firstMissingInteger = input[index] + 1;
    } else {
      firstMissingInteger = possibleMissingInteger;
    }

    return firstMissingInteger;
  }
}
