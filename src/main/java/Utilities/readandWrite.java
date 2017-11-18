package Utilities;

/**
 * Created by Kingsley on 11/18/17.
 */
import User.User;
import manageTransactions.Portfolio;
import java.io.*;
import  java.lang.*;
import  java.util.*;

public class readandWrite {



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

                bw.write(portfolio.getAggression());
                bw.write(portfolio.getInvestmentInterval());
                bw.write(String.valueOf(portfolio.getInvestmentAmount()));
                bw.write(String.valueOf(portfolio.getIntervalSwitch()));
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


                while((line = Br.readLine()) != null){

                    System.out.println(line);
                }


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
