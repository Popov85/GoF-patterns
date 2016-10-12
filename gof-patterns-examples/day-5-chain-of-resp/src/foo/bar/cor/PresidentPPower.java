package foo.bar.cor;

public class PresidentPPower extends PurchasePower {

    private final double ALLOWABLE = 60 * base;

    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < ALLOWABLE)
            System.out
                    .println("President will approve $" + request.getAmount());
        else if (successor != null)
            successor.processRequest(request);
    }
}
