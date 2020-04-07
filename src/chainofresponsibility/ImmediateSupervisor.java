package chainofresponsibility;

// ConcreteHandler1
public class ImmediateSupervisor extends Handler {
    private double factor = 2;

    public ImmediateSupervisor() { }

    @Override
    public void handlePayRaise(double percentage) {
        if (percentage < factor) {
            super.print(WAGE * (1+percentage/100),"Immediate Supervisor Mr. Smith");
        } else {
            super.handlePayRaise(percentage);
        }
    }
}
