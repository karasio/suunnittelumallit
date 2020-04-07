package chainofresponsibility;

// ConcreteHandler2
public class HeadOfUnit extends Handler {
    private double factor = 5;

    public HeadOfUnit() { }

    @Override
    public void handlePayRaise(double percentage) {
        if (percentage < factor) {
            super.print(WAGE * (1+percentage/100),"Head of Unit, Mr. Nielsen");
        } else {
            super.handlePayRaise(percentage);
        }
    }

}
