package Portfolio;

import bottomOption.bottomOpt;
import dePosit_withDraw.Deposit_Withdraw;




public class Portfolio {

    double currentBalance;
    double GovBondValue;
    double RealEstateStock;
    double corporateBondsValue;
    double EmergingMarketStock;
    double SmallCompanyStock;
    double LargeCompanyStock;
    double internationalLargeStock;
    String TypeOfPortfolioStr;


    public void DisplayPortfolioOptions(double CB){

        System.out.println(" 1 Conservative \n");
        System.out.println(" 2 ModeratelyConservation \n");
        System.out.println(" 3 Moderate \n");
        System.out.println(" 4 ModeratelyAggressive \n");
        System.out.println(" 5 Aggressive \n");

        int respondsOption = Deposit_Withdraw.ask();


        setupPortfolioType(respondsOption);
        currentBalance = CB;
    }


    public void printPortfolio(){

        System.out.println("\t\t========================\n" +
                "\t\t   PORTFOLIO!  \n" +
                "\t\t========================\n\n");
        System.out.println("Your current balance is "+ currentBalance);
        System.out.println("Current Portfolio type: "+ TypeOfPortfolioStr);
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Government Bonds       $" + GovBondValue );
        System.out.println("Corporate Bonds        $" + corporateBondsValue);
        System.out.println("Real Estate Stocks     $" + RealEstateStock);
        System.out.println("Emerging Market Stocks $" + EmergingMarketStock);
        System.out.println("Small Company Stock    $" + SmallCompanyStock);
        System.out.println("Large Company Stock    $" + LargeCompanyStock);
        System.out.println("International Large co. stocks $" + internationalLargeStock );


        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");


        bottomOpt.nextRespond();
    }

    public void setupPortfolioType(int TypeOfPortfolio){

        if(TypeOfPortfolio == 1){
            TypeOfPortfolioStr = "Conservative";

            setupInvestmentSector(40,2,40,0,2,12,4);

        }else if(TypeOfPortfolio == 2){
            TypeOfPortfolioStr = "ModeratelyConservation";

            setupInvestmentSector(30,4,30,0,4,24,8);

        }else if(TypeOfPortfolio == 3){
            TypeOfPortfolioStr = "Moderate";

            setupInvestmentSector(20,6,20,3,10,29,12);

        }else if(TypeOfPortfolio == 4){
            TypeOfPortfolioStr = "ModeratelyAggressive";

            setupInvestmentSector(10,8,10,4,14,38,16);

        }else if(TypeOfPortfolio == 5){
            TypeOfPortfolioStr = "Aggressive";
            setupInvestmentSector(0,10,0,10,20,40,20);
        }





    }

    public void setupInvestmentSector(int GBV,int RES, int CBV, int EMS, int SCS, int LCS, int ILS){

         GovBondValue = generatePercent(GBV);
         RealEstateStock = generatePercent(RES);
         corporateBondsValue = generatePercent(CBV);
         EmergingMarketStock = generatePercent(EMS);
         SmallCompanyStock = generatePercent(SCS);
         LargeCompanyStock = generatePercent(LCS);
         internationalLargeStock = generatePercent(ILS);


    }


    public double generatePercent(int percent){

        double percentageValue = ((percent / 100) * currentBalance);

        return percentageValue;
    }





}