package Utilities;

/**
 * Created by Kingsley on 11/18/17.
 */

// While loop to iterate through a HashMap is implementing the logic from this link from github:
// https://stackoverflow.com/questions/1066589/iterate-through-a-hashmap#1066607
// https://stackoverflow.com/questions/5920135/printing-hashmap-in-java#5920157

import Stock.stockStore;
import User.User;
import manageTransactions.Bank;
import manageTransactions.Portfolio;
import java.io.*;
import  java.lang.*;
import  java.util.*;

public class readingWrite {

    public static boolean writeFile(User user, Portfolio portfolio, Bank bank, stockStore stocksList, String masterInstruction){

        String filename = "Storage//"+user.getEmail()+"//"+masterInstruction+".txt";
        File theDir = new File("Storage//" +user.getEmail());

        if (!theDir.exists()) {
            //System.out.println("creating directory: " + theDir.getName());
            boolean result = false;

            try{
                theDir.mkdirs();
                result = true;
            }
            catch(SecurityException se){
                //handle it
            }
            if(result) {
                //System.out.println("DIR created");
            }
        }
        BufferedWriter bw = null;
        FileWriter fw = null;
        try{
            File file = new File(filename);
            if (file.isFile()){
                //System.out.println("FILE EXISTS ALREADY");
                return false;
            }
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);

            if(masterInstruction.equalsIgnoreCase("user")){

                bw.write(user.getName());
                bw.newLine();
                bw.write(user.getPassword());
                bw.newLine();
                bw.write(user.getEmail());
                bw.newLine();
                bw.write(String.valueOf(user.isCorporate()));

                //System.out.print("userDone");

            }else if(masterInstruction.equalsIgnoreCase("portfolio")){

                bw.write(String.valueOf(portfolio.getAggression()));
                bw.newLine();
                bw.write(String.valueOf(portfolio.getInvestmentInterval()));
                bw.newLine();
                bw.write(String.valueOf(portfolio.getInvestmentAmount()));
                bw.newLine();
                bw.write(String.valueOf(portfolio.getIntervalSwitch()));
                bw.newLine();
                bw.write(String.valueOf(portfolio.getFunds()));

            }else if(masterInstruction.equalsIgnoreCase("bank")){
                bw.write(String.valueOf(bank.getBalance()));
                bw.newLine();
                bw.write(String.valueOf(bank.isOverDraw()));
                bw.newLine();
                bw.write(String.valueOf(bank.getCorporate()));
            }else if(masterInstruction.equalsIgnoreCase("stock")){
                System.out.println("Stock information saved here.");
//                Iterator i = stocksList.getMap().entrySet().iterator();
//                while (i.hasNext()){
//                    Map.Entry pairs = (Map.Entry)i.next();
//                    bw.write(String.valueOf(pairs.getKey()));
//                    bw.newLine();
//                    bw.write(String.valueOf(pairs.getValue()));
//                    i.remove();
//                }
                for(String key: stocksList.getMap().keySet()){
//                    String k = key.toString();
//                    String val = stocksList.getMap().get(key).toString();
//                    System.out.println(k+ " = "+val);
                    bw.write(String.valueOf(key));
                    bw.newLine();
                    bw.write(String.valueOf(stocksList.getMap().get(key)));
                    bw.newLine();
                }
            }else{
                //System.out.println("something went wrong");
            }

        }catch (IOException e){
            //System.out.print("something went wrong while writing ");
            e.printStackTrace();

        }finally {
            try{

                if (bw != null){

                    bw.close();
                }
                if (fw != null){

                    fw.close();
                }

            }catch (IOException ex) {

                ex.printStackTrace();

            }
        }
        return true;
    }

    public static boolean readFile(User user, Portfolio portfolio, Bank bank, stockStore stocksList, String masterInstruction ){

        String filename = "Storage//"+user.getEmail()+"//"+masterInstruction+".txt";

        BufferedReader Br = null;
        FileReader fr = null;
        String line;

        try{
            fr = new FileReader(filename);
            Br = new BufferedReader(fr);

            if(masterInstruction.equalsIgnoreCase("user")){
                   user.setName(Br.readLine());
                   user.setPassword(Br.readLine());
                   user.setEmail(Br.readLine());
                   user.setCorporate(Boolean.parseBoolean(Br.readLine()));

            }else if (masterInstruction.equalsIgnoreCase("portfolio")){
                  int aggression = Integer.parseInt(Br.readLine());
                  int investInterval = Integer.parseInt(Br.readLine());
                  double investmentAmount = Double.parseDouble(Br.readLine());
                  boolean intervalSwitch = Boolean.parseBoolean(Br.readLine());
                  double funds = Double.parseDouble(Br.readLine());

                  portfolio.setAggression(aggression);
                  portfolio.setInvestmentInterval(investInterval);
                  portfolio.setInvestmentAmount(investmentAmount);
                  portfolio.setIntervalSwitch(intervalSwitch);
                  portfolio.setFunds(funds);

            }else if (masterInstruction.equalsIgnoreCase("bank")){
                  bank.updateBalance(Double.parseDouble(Br.readLine()));
                  bank.setOverDraw(Boolean.parseBoolean(Br.readLine()));
            }
            else if (masterInstruction.equalsIgnoreCase("stock")){
                System.out.println("READING Stocks");
                stocksList.setInitPrice(Br.readLine(),Double.parseDouble(Br.readLine()));
                stocksList.setInitPrice(Br.readLine(),Double.parseDouble(Br.readLine()));
                stocksList.setInitPrice(Br.readLine(),Double.parseDouble(Br.readLine()));
            }
        }catch (IOException e){

            //System.out.println("something went wrong while reading ");
            //e.printStackTrace();
            return false;

        }finally {
            try{

                if (Br != null){
                    Br.close();
                }
                if (fr != null){
                    fr.close();
                }
            }catch (IOException ex) {

                ex.printStackTrace();

            }
        }
        return true;
    }

}