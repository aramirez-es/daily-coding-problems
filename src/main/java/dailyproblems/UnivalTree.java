package dailyproblems;

import java.util.Objects;

interface UnivalTree {
  boolean isUnival();
  int countUnivalSubTrees();

  interface ValueUnivalTree extends UnivalTree {
    int getValue();
  }

  class Root implements ValueUnivalTree {
    private final int value;
    private ValueUnivalTree left;
    private ValueUnivalTree right;

    Root(int value, ValueUnivalTree left, ValueUnivalTree right) {
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
    class Leaf implements ValueUnivalTree {
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

    class EmptyLeaf implements UnivalTree {
      public EmptyLeaf() {
      }

      @Override
      public boolean isUnival() {
        return false;
      }

      @Override
      public int countUnivalSubTrees() {
        return 0;
      }
    }
}
