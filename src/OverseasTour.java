public class OverseasTour extends Tour {
    private String country;
    private String state;
    private boolean privateTours;
    private boolean joinedTours;

    private OverseasTour(){
        this(0,new NormalPrice(),new PeakPrice(),"Unknown","Unknown",false,false);
    }

    protected OverseasTour(int days, Price normalPrice, Price peakPrice, String country, String state, boolean privateTours, boolean joinedTours){
        super(days,normalPrice,peakPrice);
        this.country = country;
        this.state = state;
        this.privateTours = privateTours;
        this.joinedTours = joinedTours;
    }
    public String getCountry() {return this.country;}

    public String getState() {return this.state;}

    public boolean getPrivateTours(){
        return this.privateTours;
    }

    public boolean getJoinedTours() {
        return joinedTours;
    }

    public void setCountry(String country) {this.country = country;}

    public void setState(String state){this.state =state;}

    public void setJoinedTours(boolean joinedTours) {
        this.joinedTours = joinedTours;
    }

    public void setPrivateTours(boolean privateTours) {
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
        return "Overseas Tour " +
                "\n[ Country: " + country + "]" +
                "\n[ State: " + state + "]" +
                "\n[ Has Joined Tour: " + getYesOrNo(joinedTours) + "]" +
                "\n[ Has Private Tour: " + getYesOrNo(privateTours) + "]" +
                "\n[ Duration: " + super.getDays() + " days]" +
                "\nNormal Price: " + super.getNormalPrice().toString() + "\n]" +
                "\nPeak Price: " + super.getPeakPrice().toString() + "\n]"
                ;
    }
}
