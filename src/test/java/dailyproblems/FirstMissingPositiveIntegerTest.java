package dailyproblems;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.
 *
 * For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
 *
 * You can modify the input array in-place.
 */
public class FirstMissingPositiveIntegerTest {
  @Test
  public void it_should_find_first_missing_positive_given_an_array_with_two_elements() {
    int [] input = {1, 3};
    int expectedMissingPositiveInteger = 2;

    assertThat(new FirstMissingPositiveInteger().execute(input)).isEqualTo(expectedMissingPositiveInteger);
  }

  @Test
  public void it_should_find_first_missing_positive_given_an_array_with_numbers_duplicates() {
    int [] input = {1, 1, 3, 3};
    int expectedMissingPositiveInteger = 2;

    assertThat(new FirstMissingPositiveInteger().execute(input)).isEqualTo(expectedMissingPositiveInteger);
  }

  @Test
  public void it_should_find_first_missing_positive_given_an_array_sequential() {
    int [] input = {1, 2, 0};
    int expectedMissingPositiveInteger = 3;

    assertThat(new FirstMissingPositiveInteger().execute(input)).isEqualTo(expectedMissingPositiveInteger);
  }

  @Test
  public void it_should_find_first_missing_positive_given_an_array_with_negative_numbers() {
    int [] input = {3, 4, -1, 1};
    int expectedMissingPositiveInteger = 2;

    assertThat(new FirstMissingPositiveInteger().execute(input)).isEqualTo(expectedMissingPositiveInteger);
  }
}
