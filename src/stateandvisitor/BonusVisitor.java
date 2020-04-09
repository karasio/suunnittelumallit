package stateandvisitor;

public class BonusVisitor implements Visitor {
    @Override
    public void visit(Charmander c) {
        c.activateBonusMode();
    }

    @Override
    public void visit(Charmeleon c) {
        c.activateBonusMode();
    }

    @Override
    public void visit(Charizard c) {
        c.activateBonusMode();
    }
}
