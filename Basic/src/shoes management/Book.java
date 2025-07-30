package Basic.src;

public class Book implements Priceable, Returnable {
    private int priceCents;
    private boolean isReturned = false;

    public Book(int priceCents) {
        this.priceCents = priceCents;
    }

    public int getPrice() {
        return priceCents;
    }

    public boolean processReturn() {
        if (!isReturned) {
            isReturned = true;
            return true;
        }
        return false;
    }

    public String toString() {
        return String.format("Book Price INR %d (returned %s)", priceCents, isReturned);
    }
}
