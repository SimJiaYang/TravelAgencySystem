

public class Tour{
    private int days;
    private Price peakPrice;
    private Price normalPrice;

    protected Tour(){
        this(0,  new PeakPrice(), new NormalPrice());
    }

    protected Tour(int days,Price normalPrice,Price peakPrice) {
        this.days = days;
        this.peakPrice = peakPrice;
        this.normalPrice = normalPrice;
    }

    public int getDays(){
       return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public Price getPeakPrice(){
        return peakPrice;
    }

    public Price getNormalPrice(){
        return normalPrice;
    }

    @Override
    public String toString() {
        return "Tour " +
                "\n[ days = " + days + "]";
    }


}
