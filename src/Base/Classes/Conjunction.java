package Base.Classes;

import Base.Interface.AbstractNode;

public class Conjunction implements AbstractNode {
    private final AbstractNode left;
    private final AbstractNode right;

    public Conjunction(AbstractNode left, AbstractNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean calculate() {
        return left.calculate() && right.calculate();
    }

    @Override
    public String toString() {
        return "(" + left + ") ∧ (" + right + ")";
    }
}
