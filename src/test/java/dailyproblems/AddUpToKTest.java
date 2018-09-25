package dailyproblems;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

/**
 * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 *
 * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 *
 * Bonus: Can you do this in one pass?
 */
public class AddUpToKTest {
  @Test
  public void it_should_add_two_numbers() {
    int [] numbers = {10, 7};
    assertThat(new AddUpToK().execute(numbers, 17)).isTrue();
  }

  @Test
  public void it_should_add_two_numbers_but_fail() {
    int [] numbers = {10, 8};
    assertThat(new AddUpToK().execute(numbers, 17)).isFalse();
  }

  @Test
  public void it_should_return_true_combination_of_two_numbers() {
    int [] numbers = {10, 4, 7};
    assertThat(new AddUpToK().execute(numbers, 17)).isTrue();
  }

  @Test
  public void it_should_return_true_combination_of_other_two_numbers() {
    int [] numbers = {4, 10, 7};
    assertThat(new AddUpToK().execute(numbers, 17)).isTrue();
  }

  @Test
  public void it_should_return_false_because_combining_all_three_numbers() {
    int [] numbers = {3, 4, 11};
    assertThat(new AddUpToK().execute(numbers, 17)).isFalse();
  }

  @Test
  public void it_should_return_true_because_combining_all_latest_numbers_but_one() {
    int [] numbers = {1, 2, 3, 10, 5, 7};
    assertThat(new AddUpToK().execute(numbers, 17)).isTrue();
  }

  @Test
  public void it_should_return_true_even_combining_a_zero() {
    int [] numbers = {4, 0, 17};
    assertThat(new AddUpToK().execute(numbers, 17)).isTrue();
  }
}
