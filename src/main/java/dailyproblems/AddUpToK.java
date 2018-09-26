package dailyproblems;

class AddUpToK {
  boolean execute(int[] numbers, int k) {

    boolean found = false;
    int index = 0;

    while (!found && index < numbers.length) {
      for (int j = index + 1; j < numbers.length && !found; j++) {
        found = numbers[index] + numbers[j] == k;
      }
      index++;
    }

    return found;
  }
}
