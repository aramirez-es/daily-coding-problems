package dailyproblems;

import java.util.HashMap;
import java.util.Map;

class AddUpToK {
  boolean execute(int[] numbers, int k) {
    Map<Integer, Integer> map = new HashMap<>();

    boolean found = false;
    int i = 0;

    while (!found && i < numbers.length) {
      found = map.containsKey(k - numbers[i]);
      // Value is not relevant since we try to know if difference (stored in the key) is present in constant time.
      map.put(numbers[i], null);
      i++;
    }


    return found;
  }
}
