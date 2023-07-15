import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //DataType
        ArrayList<Tour> tourList = new ArrayList<Tour>();
        Price normalPriceOverSeas = new NormalPrice(4297,4097,3897,500);
        Price peakPriceOverSeas = new PeakPrice(5097,4897,4697,500);
        Price normalPriceDomestic = new NormalPrice(1647,1447,1247,500);
        Price peakPriceDomestic = new PeakPrice(2447,2247,2047,500);

        Tour overseasTour = new OverseasTour(6,normalPriceOverSeas,peakPriceOverSeas,"Korean","Seoul",true,true);
        Tour domesticTour = new DomesticTour(3,normalPriceDomestic,peakPriceDomestic,"Sabah",true,false);

        tourList.add(overseasTour);
        tourList.add(domesticTour);

        for(Tour tour : tourList){
            System.out.println("\n" + tour.toString());
        }

        Scanner input = new Scanner(System.in);
        boolean validInput = false;
        int isModified = 0;

        while (!validInput){
            try{
                System.out.print("\n Do you want view the modified information? (1:YES Other:NO): ");
                isModified = input.nextInt();
                validInput = true;
            }catch (Exception e){
                System.out.println("\nInvalid input! Please enter a correct value. ");
                input.nextLine();
            }
        }

        if(isModified == 1) {

            System.out.println("\n-----------------------Modified Information----------------------------");

            // Modified the tour information and pricing details
            // For Overseas
            overseasTour.getPeakPrice().setAdultPrice(2000);
            overseasTour.getPeakPrice().setChildWithExtraBedPrice(2000);
            overseasTour.getPeakPrice().setChildWithNoExtraBedPrice(2000);
            overseasTour.getPeakPrice().setInfantPrice(2000);
            overseasTour.getNormalPrice().setAdultPrice(1000);
            overseasTour.getNormalPrice().setChildWithExtraBedPrice(1000);
            overseasTour.getNormalPrice().setChildWithNoExtraBedPrice(1000);
            overseasTour.getNormalPrice().setInfantPrice(1000);
            overseasTour.setDays(10);
            ((OverseasTour) overseasTour).setState("BangKok");
            ((OverseasTour) overseasTour).setCountry("Thailand");
            ((OverseasTour) overseasTour).setJoinedTours(false);

            // For domestic
            domesticTour.getPeakPrice().setAdultPrice(3000);
            domesticTour.getPeakPrice().setChildWithExtraBedPrice(3000);
            domesticTour.getPeakPrice().setChildWithNoExtraBedPrice(3000);
            domesticTour.getPeakPrice().setInfantPrice(3000);
            domesticTour.getNormalPrice().setAdultPrice(1500);
            domesticTour.getNormalPrice().setChildWithExtraBedPrice(1500);
            domesticTour.getNormalPrice().setChildWithNoExtraBedPrice(1500);
            domesticTour.getNormalPrice().setInfantPrice(1500);
            domesticTour.setDays(9);
            ((DomesticTour) domesticTour).setState("Kuala Lumpur");
            ((DomesticTour) domesticTour).setHoneymoonTours(true);


            for (Tour tour : tourList) {
                System.out.println("\n" + tour.toString());
            }

        }else{
            System.exit(0);
        }

        }
    }