package stateandvisitor;

public class BonusVisitor implements Visitor {
    @Override
    public void visit(Charmander c) {
        c.activateBonusMode(1.1);
    }

    @Override
    public void visit(Charmeleon c) {
        c.activateBonusMode(1.25);
    }

    @Override
    public void visit(Charizard c) {
        c.activateBonusMode(1.5);
    }
}
