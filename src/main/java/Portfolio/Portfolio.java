package Portfolio;

import bottomOption.bottomOpt;




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


        bottomOpt.nextRespond();
    }








}
