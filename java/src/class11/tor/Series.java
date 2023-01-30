package class11.tor;

public class Series {
    private int first;
    private int diff;
    private int amount;

    public Series(int first, int diff, int amount) {
        this.first = first;
        this.diff = diff;
        this.amount = amount;
    }

    public int last() {
        return this.first + this.diff * (this.amount - 1);
    }

    public int getFirst() {
        return this.first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getDiff() {
        return this.diff;
    }

    public void setDiff(int diff) {
        this.diff = diff;
    }

    public int getAmount() {
        return this.amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
