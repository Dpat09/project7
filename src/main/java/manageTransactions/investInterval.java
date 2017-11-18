package manageTransactions;

import Utilities.scannerInputs;

public class investInterval extends Portfolio{

    public void setreoccuring(Portfolio obj){

        //obj.investmentInterval = scannerInputs.scanStringInput();

    }

    public boolean investAmount(Portfolio obj, double newAmount){
        //obj.investmentAmount = newAmount>=1 ? newAmount : obj.investmentAmount;
        return newAmount>=1;
    }
    public void setSwitch(Portfolio obj, boolean flag){
        //obj.intervalSwitch = flag;
    }

}
