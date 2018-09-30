package dailyproblems;

import java.util.Objects;

interface UnivalBinaryTree {
  int getValue();
  int countUnivalSubTrees();
  boolean isUnival();

  class Root implements UnivalBinaryTree {
    private final int value;
    private UnivalBinaryTree left;
    private UnivalBinaryTree right;

    Root(int value, UnivalBinaryTree left, UnivalBinaryTree right) {
      this.value = value;
      this.right = Objects.requireNonNull(right);
      this.left = Objects.requireNonNull(left);
    }

    @Override
    public boolean isUnival() {
      return value == right.getValue() && right.getValue() == left.getValue();
    }

    @Override
    public int countUnivalSubTrees() {
      int base = 0;
      if (isUnival()) {
        base++;
      }
      return base + left.countUnivalSubTrees() + right.countUnivalSubTrees();
    }

    @Override
    public int getValue() {
      return value;
    }
  }

  class Leaf implements UnivalBinaryTree {
    private final int value;

    Leaf(int value) {
      this.value = value;
    }

    @Override
    public boolean isUnival() {
      return true;
    }

    @Override
    public int countUnivalSubTrees() {
      return 1;
    }

    @Override
    public int getValue() {
      return value;
    }
  }
}
