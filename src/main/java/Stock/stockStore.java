package Stock;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public class stockStore {

    private static ConcurrentHashMap<String,Double> priceList;
    private ArrayList<Double> changeOfStock;

    public stockStore(){
        priceList = new ConcurrentHashMap<String, Double>();
        changeOfStock = new ArrayList<Double>();
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

    public Double getChangeOfStock(int number){
        return changeOfStock.get(number);
    }

    public void setChangeOfStock(Double value){
        changeOfStock.add(value);
    }
}
