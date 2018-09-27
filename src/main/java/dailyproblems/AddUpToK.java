package dailyproblems;

import java.util.Arrays;

class AddUpToK {
  boolean execute(int[] numbers, int k) {

    boolean found = false;
    int low = 0;
    int high = numbers.length -1;

    Arrays.sort(numbers);
    while (!found && low < high){
        int possiblePar = numbers[low] + numbers[high];
        found = possiblePar == k;

        if (possiblePar > k) {
          high--;
        } else if (possiblePar < k) {
          low++;
        }
    }


    return found;
  }
}
