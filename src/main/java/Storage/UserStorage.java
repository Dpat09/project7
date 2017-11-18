package Storage;

/**
 * Created by Kingsley on 11/16/17.
 */
import User.User;
import Utilities.readingWrite;
import manageTransactions.Portfolio;

import java.io.*;
import  java.lang.*;
import  java.util.*;


import java.io.IOException;

public class UserStorage {


   public UserStorage(){


   }

   /*public void writeFile(User user){

       String filename = "Storage//"+user.getEmail()+"//user.txt";
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
       bw.write(user.getName());
       bw.newLine();
       bw.write(user.getPassword());
       bw.newLine();
       bw.write(user.getEmail());

       System.out.print("Done");


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

   public boolean ReadFile(User user){

       String filename = "Storage//"+user.getEmail()+"//user.txt";

       BufferedReader Br = null;
       FileReader fr = null;
       String line;

       try{
           fr = new FileReader(filename);
           Br = new BufferedReader(fr);

           while((line = Br.readLine()) != null){

               System.out.println(line);
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


*/


   public void writeFile( User user){

      readingWrite write = new readingWrite();


      write.writeFile(user,null,"user");


   }

   public boolean ReadFile(User user){

      readingWrite read = new readingWrite();


      return read.ReadFile(user,null,"user");



   }















}
