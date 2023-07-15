public class DomesticTour extends Tour{
    private String state;
    private boolean privateTours;
    private boolean honeymoonTours;

    protected DomesticTour(){
        this(0,new NormalPrice(),new PeakPrice(),"Unknown",false,false);
    }
    protected DomesticTour(int days, Price normalPrice, Price peakPrice,String state, boolean privateTours,boolean honeymoonTours){
        super(days,normalPrice,peakPrice);
        this.state = state;
        this.privateTours = privateTours;
        this.honeymoonTours = honeymoonTours;
    }

    public String getState() {
        return state;
    }

    public boolean getHoneymoonTours(){
        return honeymoonTours;
    }

    public boolean getPrivateTours(){
        return privateTours;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setHoneymoonTours(boolean honeymoonTours){
        this.honeymoonTours = honeymoonTours;
    }

    public void setPrivateTours(boolean privateTours){
        this.privateTours = privateTours;
    }
    public String getYesOrNo(boolean value) {
        if(value){
            return "Yes";
        }
            return  "No";
    }



    @Override
    public String toString() {
        return "Domestic Tour " +
                "\n[ State: " + state + "]" +
                "\n[ Has Private Tour = " + getYesOrNo(privateTours) + "]" +
                "\n[ Has Honeymoon Tour = " + getYesOrNo(honeymoonTours) + "]" +
                "\n[ Duration: " + super.getDays() + " days]" +
                "\nNormal Price: " + super.getNormalPrice().toString() + "\n]" +
                "\nPeak Price: " + super.getPeakPrice().toString() + "\n]"
                ;
    }
}
