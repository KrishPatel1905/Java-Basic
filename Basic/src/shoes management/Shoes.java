package Basic.src;

public class Shoes implements Priceable, Discountable {
    private int priceCents;

    public Shoes(int priceCents) {
        this.priceCents = priceCents;
    }

    public int getPrice() { // ✅ Moved outside constructor and matches interface
        return priceCents;
    }

    public void applyDiscount(int percent) {
        priceCents = priceCents * (100 - percent) / 100;
    }

    public String toString() {
        return String.format("Shoes Price: INR %,d", priceCents);
    }
}
