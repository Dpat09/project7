package Utilities;

import java.util.Scanner;

public class scannerInputs {

    public static Comparable scanInput(){
        try{
            Scanner scanner = new Scanner(System.in);
            String store = scanner.next();
            //scanner.close();
            return store;
        }catch (Exception e){
            System.out.println("scanInput Error! \nPlease check Utilities >> scannerInputs >> scanInput");
        }
        return "";
    }

    public static String scanString(){
        try{
            Scanner scanner = new Scanner(System.in);
            String store = scanner.nextLine();
            //scanner.close();
            return store;
        }catch (Exception e){
            System.out.println("scanString Error! \nPlease check Utilities >> scannerInputs >> scanString");
        }
        return "";
    }

    public static int scanInteger(){
        try{
            Scanner intScanner = new Scanner(System.in);
            int store = intScanner.nextInt();
            //intScanner.close();
            return store;
        }catch (Exception e){
            System.out.println(e);
            System.out.println("scanInteger Error! \nPlease check Utilities >> scannerInputs >> scanInteger");
        }
        return 0;
    }

    public static double scanDouble(){
        try{
            Scanner doubleScanner = new Scanner(System.in);
            double store = doubleScanner.nextDouble();
            //doubleScanner.close();
            return store;
        }catch (Exception e){
            System.out.println("scanDouble Error! \nPlease check Utilities >> scannerInputs >> scanDouble");
        }
        return 0;
    }
}
