package z_1;

public class PurchaseOnline {
    private String name;
    private long numberTIN;

    public PurchaseOnline(String name, long numberTIN) {
        this.name = name;
        this.numberTIN = numberTIN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumberTIN() {
        return numberTIN;
    }

    public void setNumberTIN(long numberTIN) {
        this.numberTIN = numberTIN;
    }
}