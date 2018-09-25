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

//    boolean found = false;
//    int possibleCombinations = (int) Math.pow(2, numbers.length) - 1;
//    int index = 1;
//
//    while(!found && index <= possibleCombinations) {
//      String padded = String.format("%0" + numbers.length + "d", Integer.parseInt(Integer.toBinaryString(index)));
//      char[] chars = padded.toCharArray();
//      int acc = 0;
//      for(int i = 0; i < chars.length; i++) {
//        boolean enabled = Character.getNumericValue(chars[i]) == 1;
//        if (enabled) {
//          acc += numbers[i];
//        }
//      }
//      found = acc == k;
//      index++;
//    }

    return found;
  }
}
