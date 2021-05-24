package Base;

import Base.Classes.Conjunction;
import Base.Classes.Inversion;
import Base.Classes.SimpleNode;
import Base.Interface.AbstractNode;

public class Main {

    public static void main(String[] args) {
        AbstractNode first = new Conjunction(
            new Conjunction(new SimpleNode(true), new Inversion(new SimpleNode(false))),
            new Inversion(new SimpleNode(true))
        );
        AbstractNode second = new Inversion(
                new Conjunction(
                    new Inversion(new SimpleNode(true)),
                    new Inversion(new SimpleNode(false))
                )
        );

        System.out.println("The first expression is: " + first + "\tValue is: " + first.calculate());
        System.out.println("The second expression is: " + second + "\tValue is: " + second.calculate());
    }
}
