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
    private String name;
    private String password;
    private String email;

   public UserStorage(User user){

       this.name = user.getName();
       this.email = user.getEmail();
       this .password = user.getPassword();

   }

   public void writeFile(){

       String filename = "Storage//test.txt";
       File theDir = new File("Storage//+email");
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
       bw.write(name);
       bw.newLine();
       bw.write(password);
       bw.newLine();
       bw.write(email);

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



















}
