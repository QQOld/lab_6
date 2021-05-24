package Base.Classes;

import Base.Interface.AbstractNode;

public class Inversion implements AbstractNode {
    private final AbstractNode node;

    public Inversion(AbstractNode node) {
        this.node = node;
    }

    @Override
    public boolean calculate() {
        return !node.calculate();
    }

    @Override
    public String toString() {
        return "¬(" + node + ")";
    }
}
