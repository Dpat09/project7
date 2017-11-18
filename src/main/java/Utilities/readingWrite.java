package Utilities;

/**
 * Created by Kingsley on 11/18/17.
 */
import User.User;
import com.sun.org.apache.xpath.internal.operations.Bool;
import manageTransactions.Portfolio;
import java.io.*;
import  java.lang.*;
import  java.util.*;

public class readingWrite {



    public void writeFile(User user,Portfolio portfolio, String masterInstruction){

        String filename = "Storage//"+user.getEmail()+"//"+masterInstruction+".txt";
        File theDir = new File("Storage//" +user.getEmail());

        if (!theDir.exists()) {
            System.out.println("creating directory: " + theDir.getName());
            boolean result = false;

            try{
                theDir.mkdir();
                result = true;
            }
            catch(SecurityException se){
                //handle it
            }
            if(result) {
                System.out.println("DIR created");
            }
        }
        BufferedWriter bw = null;
        FileWriter fw = null;
        try{



            fw = new FileWriter(filename);
            bw = new BufferedWriter(fw);


            if(masterInstruction == "user"){

                bw.write(user.getName());
                bw.newLine();
                bw.write(user.getPassword());
                bw.newLine();
                bw.write(user.getEmail());

                System.out.print("userDone");

            }else if(masterInstruction == "portfolio"){

                bw.write(String.valueOf(portfolio.getAggression()));
                bw.newLine();
                bw.write(String.valueOf(portfolio.getInvestmentInterval()));
                bw.newLine();
                bw.write(String.valueOf(portfolio.getInvestmentAmount()));
                bw.newLine();
                bw.write(String.valueOf(portfolio.getIntervalSwitch()));
                bw.newLine();
                bw.write(String.valueOf(portfolio.getFunds()));


            }else{
                System.out.println("something went wrong");
            }



        }catch (IOException e){

            System.out.print("something went wrong while writing ");
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


    }

    public boolean ReadFile(User user,Portfolio portfolio, String masterInstruction ){

        String filename = "Storage//"+user.getEmail()+"//"+masterInstruction+".txt";

        BufferedReader Br = null;
        FileReader fr = null;
        String line;

        try{
            fr = new FileReader(filename);
            Br = new BufferedReader(fr);

            if(masterInstruction == "user"){

                while((line = Br.readLine()) != null){

                    System.out.println(line);
                }

            }else if (masterInstruction == "portfolio"){
                  int aggression = Integer.parseInt(Br.readLine());
                  int investInterval = Integer.parseInt(Br.readLine());
                  double investmentAmount = Double.parseDouble(Br.readLine());
                  boolean intervalSwitch = Boolean.parseBoolean(Br.readLine());
                  double funds = Double.parseDouble(Br.readLine());

                  portfolio = new Portfolio(aggression,investInterval,investmentAmount,intervalSwitch,funds);

                System.out.println(aggression);
                System.out.println(investInterval);

//                while((line = Br.readLine()) != null){
//
//                    System.out.println(line);
//                }


            }

        }catch (IOException e){

            System.out.println("something went wrong while reading ");
            e.printStackTrace();

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
