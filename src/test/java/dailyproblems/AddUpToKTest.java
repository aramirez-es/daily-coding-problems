package dailyproblems;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

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
  public void it_should_return_true_because_one_number() {
    int [] numbers = {17, 29};
    assertThat(new AddUpToK().execute(numbers, 17)).isTrue();
  }

  @Test
  public void it_should_return_true_because_second_number() {
    int [] numbers = {10, 17};
    assertThat(new AddUpToK().execute(numbers, 17)).isTrue();
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
  public void it_should_return_true_because_combining_all_three_numbers() {
    int [] numbers = {3, 4, 10};
    assertThat(new AddUpToK().execute(numbers, 17)).isTrue();
  }

  @Test
  public void it_should_return_false_because_combining_all_three_numbers() {
    int [] numbers = {3, 4, 11};
    assertThat(new AddUpToK().execute(numbers, 17)).isFalse();
  }

  @Test
  public void it_should_return_true_because_combining_all_numbers() {
    int [] numbers = {1, 2, 3, 4, 5, 2};
    assertThat(new AddUpToK().execute(numbers, 17)).isTrue();
  }

  @Test
  public void it_should_return_true_because_combining_all_latest_numbers() {
    int [] numbers = {1, 2, 3, 10, 5, 2};
    assertThat(new AddUpToK().execute(numbers, 17)).isTrue();
  }

  @Test
  public void it_should_return_true_because_combining_all_latest_numbers_but_one() {
    int [] numbers = {1, 2, 3, 10, 5, 7};
    assertThat(new AddUpToK().execute(numbers, 17)).isTrue();
  }

  @Test
  public void it_should_return_true_because_it_is_at_the_middle() {
    int [] numbers = {1, 1, 1, 17, 1, 1};
    assertThat(new AddUpToK().execute(numbers, 17)).isTrue();
  }
}
