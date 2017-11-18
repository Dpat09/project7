package Stroage;

/**
 * Created by Kingsley on 11/16/17.
 */
import User.User;
import java.io.*;
import  java.lang.*;
import  java.util.*;


import java.io.IOException;

public class UserStorage {


   public UserStorage(){


   }

   public void writeFile(User user){

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












     return true;
   }






















}
