package chainofresponsibility;

// Handler
public abstract class Handler {
    private Handler h;
    protected final static double WAGE = 4000;
    private double percentage = 0;

    public void setHandler(Handler h) {
        this.h = h;
    }

    public void handlePayRaise(double percentage) {
        this.percentage = percentage;
        if (h != null) {
            h.handlePayRaise(percentage);
        }
    }

    public void print(double d,String approver) {
        System.out.println("Your new wage: " + d + " approved by: " + approver);
    }

}
