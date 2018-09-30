package dailyproblems;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

/**
 * A unival tree (which stands for "universal value") is a tree where all nodes under it have the same value.
 *
 * Given the root to a binary tree, count the number of unival subtrees.
 *
 * For example, the following tree has 5 unival subtrees:
 *
 *    0
 *   / \
 *  1   0
 *     / \
 *    1   0
 *   / \
 *  1   1
 */
public class UnivalTreeTest {
  @Test
  public void it_should_return_true_if_all_value_left_and_right_are_equals() {
    int nodeValue = 1;
    int right = 1;
    int left = 1;
    UnivalTree tree = new UnivalTree.Root(nodeValue, new UnivalTree.Leaf(left), new UnivalTree.Leaf(right));

    assertThat(tree.isUnival()).isTrue();
  }

  @Test
  public void it_should_return_false_when_any_value_is_different() {
    int nodeValue = 1;
    int right = 0;
    int left = 1;
    UnivalTree tree = new UnivalTree.Root(nodeValue, new UnivalTree.Leaf(left), new UnivalTree.Leaf(right));

    assertThat(tree.isUnival()).isFalse();
  }

  @Test
  public void it_should_return_true_when_both_left_and_right_are_null() {
    int nodeValue = 1;
    UnivalTree tree = new UnivalTree.Leaf(nodeValue);

    assertThat(tree.isUnival()).isTrue();
  }

  @Test
  public void it_should_throw_an_exception_when_creating_root_tree_with_null_left_or_right() {
    assertThatThrownBy(() -> new UnivalTree.Root(1, null, null)).isInstanceOf(Exception.class);
  }

  @Test
  public void it_should_return_one_when_tree_is_leaf() {
    assertThat(new UnivalTree.Leaf(1).countUnivalSubTrees()).isEqualTo(1);
  }

  @Test
  public void it_should_return_two_when_left_and_right_are_leaf_but_different_value_than_root() {
    assertThat(
        new UnivalTree.Root(1, new UnivalTree.Leaf(0), new UnivalTree.Leaf(0)).countUnivalSubTrees()).isEqualTo(2);
  }

  @Test
  public void it_should_return_three_when_left_and_right_are_leaf_with_same_value_than_root() {
    assertThat(
        new UnivalTree.Root(1, new UnivalTree.Leaf(0), new UnivalTree.Leaf(0)).countUnivalSubTrees()).isEqualTo(2);
  }

  @Test
  public void it_should_count_number_of_unival_subtrees_in_a_complex_tree() {
    UnivalTree tree = new UnivalTree.Root(
        0,
        new UnivalTree.Leaf(1),
        new UnivalTree.Root(0,
            new UnivalTree.Root(1,
                new UnivalTree.Leaf(1),
                new UnivalTree.Leaf(1)
            ),
            new UnivalTree.Leaf(0)
        )
    );

    assertThat(tree.countUnivalSubTrees()).isEqualTo(5);
  }
}
