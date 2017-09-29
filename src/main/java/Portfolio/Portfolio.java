package Portfolio;
import java.util.Scanner;


public class Portfolio {

    double currentBalance;
    double GovBondValue;
    double RealEstateStock;
    double corporateBondsValue;
    double EmergingMarketStock;
    double SmallCompanytStock;
    double LargeCompanyStock;

    public void setPortfolio(double CB,double GBV,double RES, double CBV, double EMS, double SCS, double LCS){

        currentBalance = CB;
        GovBondValue = GBV;
        RealEstateStock = RES;
        corporateBondsValue = CBV;
        EmergingMarketStock = EMS;
        SmallCompanytStock = SCS;
        LargeCompanyStock = LCS;

    }


    public void printPortfolio(){

        System.out.println("\t\t========================\n" +
                "\t\t   PORTFOLIO!  \n" +
                "\t\t========================\n\n");
        System.out.println(currentBalance);
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Government Bonds       $" + GovBondValue );
        System.out.println("Corporate Bonds        $" + corporateBondsValue);
        System.out.println("Real Estate Stocks     $" + RealEstateStock);
        System.out.println("Emerging Market Stocks $" + EmergingMarketStock);
        System.out.println("Small Company Stock    $" + SmallCompanytStock);
        System.out.println("Large Company Stock    $" + LargeCompanyStock);


        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");

        System.out.println("1. Exit the Application \n"+"2. Return to Main\n");
        int Nextoption = 0;

        try{
            Scanner respond = new Scanner(System.in);
            Nextoption = respond.nextInt();




        }catch(Exception e){


        }

    }


}
