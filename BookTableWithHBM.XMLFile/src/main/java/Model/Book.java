package Model;

public class Book {
    private int bId;
    private String bName;
    private double bPrice;

    public Book() {
    }

    public Book(int bId, String bName, double bPrice) {
        this.bId = bId;
        this.bName = bName;
        this.bPrice = bPrice;
    }

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public double getbPrice() {
        return bPrice;
    }

    public void setbPrice(double bPrice) {
        this.bPrice = bPrice;
    }
}
