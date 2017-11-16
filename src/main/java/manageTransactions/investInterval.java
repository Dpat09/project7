package manageTransactions;

import Utilities.scannerInputs;

public class investInterval extends Portfolio{
    public void setreoccuring(Portfolio obj){

        obj.investment_interval = scannerInputs.scanStringInput();

//        try{
//            Scanner input = new Scanner(System.in);
//            obj.investment_interval = input.nextLine();
//            input.close();
//        }
//        catch(Exception e){
//            System.out.println("Error setting investment interval");
//        }

    }

    public boolean investAmount(Portfolio obj, double newAmount){
        obj.investment_amount = newAmount>=1 ? newAmount : obj.investment_amount;
        return newAmount>=1;
    }
    public void setSwitch(Portfolio obj, boolean flag){
        obj.interval_switch = flag;
    }


}
