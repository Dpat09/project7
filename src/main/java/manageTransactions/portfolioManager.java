package manageTransactions;

import Stock.stockCalc;
import Stock.stockStore;
import Utilities.queryHandler;
import Utilities.scannerInputs;
import Utilities.transactionBridge;

public class portfolioManager extends transactionBridge {

    public static void portfolioManagerMenu(Portfolio portObj, stockStore stockObj){
        int input = 0;
        String title = "\n\n\n\t\t========================\n" +
                "\t        Manage Portfolio        \n" +
                "\t\t========================\n\n";
        String question = "1.) See investment breakdown"
                + "\n2.) Predicted investment trajectory"
                + "\n3.) Change Aggression"
                + "\n4.) Go back to Main Menu"
                + "\nEnter Choice: ";
        while (input != 4) {
            input = queryHandler.optionsQuery(title + question, 4);
            switch(input){
                case 1://Do something
                    portfolioBreakdown(portObj, stockObj);
                    break;
                case 2://Do something

                    break;
                case 3://Do something
                    changeAggression(portObj);
                    break;
            }
        }
    }

    public static Portfolio createPortfolio(Portfolio portObj, Bank bankObj, stockStore stockObj){
        System.out.println("\n\n\n\t\t========================\n" +
                "\t       Create a Portfolio!        \n" +
                "\t\t========================");

        changeAggression(portObj);
        stockCalc.setStocks(portObj,stockObj);
        addFunds(portObj,bankObj);

        return portObj;
    }

    public static void changeAggression(Portfolio portObj){
        String question = "Select investing aggression: \n\n1.) Conservative \n2.) Moderate \n3.) Aggressive \n4.) Cancel \n\nEnter Choice:";
        int input = queryHandler.optionsQuery(question,4);
        portObj.aggression = input != 4 ? input : portObj.aggression;
    }

    public static void addFunds(Portfolio portObj, Bank bankObj){
        System.out.print("\nAdd money to Investment Funds\n\nEnter amount to add from bank:");
        double amount = scannerInputs.scanDouble();
        transactionBridge.bankToPortfolio(bankObj,portObj,amount);
    }

    public static void portfolioBreakdown(Portfolio portObj, stockStore stockObj){
        System.out.println("\n\n\n\t\t========================\n" +
                "\t       Portfolio Breakdown!        \n" +
                "\t\t========================\n\n");
        switch (portObj.getAggression()) {
            case 1:
                System.out.printf("Percentage growth of Busch: %.3f\n", stockObj.getChangeOfStock(0));
                System.out.printf("Percentage growth of Bank Of America: %.3f\n", stockObj.getChangeOfStock(1));
                System.out.printf("Percentage growth of Johnson and Johnson: %.3f\n", stockObj.getChangeOfStock(2));
                break;
            case 2:
                System.out.printf("Percentage growth of CVS: %.3f\n", stockObj.getChangeOfStock(0));
                System.out.printf("Percentage growth of Walgreens: %.3f\n", stockObj.getChangeOfStock(1));
                System.out.printf("Percentage growth of Walmart: %.3f\n", stockObj.getChangeOfStock(2));
                break;
            case 3:
                System.out.println("Percentage growth of TEVA: %.3f\n" + stockObj.getChangeOfStock(0));
                System.out.println("Percentage growth of Scientific Games: %.3f\n" + stockObj.getChangeOfStock(1));
                System.out.println("Percentage growth of Super Value Games: %.3f\n" + stockObj.getChangeOfStock(2));
                break;
        }
        String temp = queryHandler.inputInfo("1.) Go back: ");

    }
}
