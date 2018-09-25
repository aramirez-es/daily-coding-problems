package dailyproblems;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
 *
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 *
 * Follow-up: what if you can't use division?
 */
public class ArrayProductTest {
  @Test
  public void it_should_multiply() {
    int [] numbers = {3, 2, 1};
    int [] expectedOutput = {2, 3, 6};
    assertThat(new ArrayProduct().execute(numbers)).isEqualTo(expectedOutput);
  }
  @Test
  public void it_should_multiply_big_arrays() {
    int [] numbers = {1, 2, 3, 4, 5};
    int [] expectedOutput = {120, 60, 40, 30, 24};
    assertThat(new ArrayProduct().execute(numbers)).isEqualTo(expectedOutput);
  }
}
