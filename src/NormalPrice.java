public class NormalPrice extends Price{
    private double adultPrice;
    private double childWithExtraBedPrice;
    private double childWithNoExtraBedPrice;
    private double infantPrice;

    protected NormalPrice() {
        this(0, 0, 0, 0);
    }

    protected NormalPrice(double adultPrice, double childWithExtraBedPrice, double childWithNoExtraBedPrice, double infantPrice) {
        this.adultPrice = adultPrice;
        this.childWithExtraBedPrice = childWithExtraBedPrice;
        this.childWithNoExtraBedPrice = childWithNoExtraBedPrice;
        this.infantPrice = infantPrice;
    }

    @Override
    public double getAdultPrice() {
        return adultPrice;
    }

    @Override
    public double getChildWithExtraBedPrice() {
        return childWithExtraBedPrice;
    }

    @Override
    public double getChildWithNoExtraBedPrice() {
        return childWithNoExtraBedPrice;
    }

    @Override
    public double getInfantPrice() {
        return infantPrice;
    }

    @Override
    public void setAdultPrice(double adultPrice) {
        this.adultPrice = adultPrice;
    }

    @Override
    public void setChildWithNoExtraBedPrice(double childWithNoExtraBedPrice) {
        this.childWithNoExtraBedPrice = childWithNoExtraBedPrice;
    }

    @Override
    public void setChildWithExtraBedPrice(double childWithExtraBedPrice) {
        this.childWithExtraBedPrice = childWithExtraBedPrice;
    }

    @Override
    public void setInfantPrice(double infantPrice) {
        this.infantPrice = infantPrice;
    }

    @Override
    public String toString() {
        return
                "\n[ \n" +
                        "  AdultPrice: RM " + adultPrice +
                        "\n  Child With Extra Bed Price: RM " + childWithExtraBedPrice +
                        "\n  Child With No Extra Bed Price: RM" + childWithNoExtraBedPrice +
                        "\n  Infant Price: RM" + infantPrice
                ;
    }
}
