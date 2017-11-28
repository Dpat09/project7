package Stock;

import java.util.concurrent.ConcurrentHashMap;

public class stockStore {

    private static ConcurrentHashMap<String,Double> priceList;

    public stockStore(){
        priceList = new ConcurrentHashMap<String, Double>();
    }

    public void setInitPrice(String name, double value){
        priceList.put(name,value);
    }

    public double getInitPrice(String stockName){
        return priceList.get(stockName);
    }

    public ConcurrentHashMap<String,Double> getMap(){
        return priceList;
    }

}
