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

    public static String scanStringInput(){
        try{
            Scanner scanner = new Scanner(System.in);
            String store = scanner.nextLine();
            //scanner.close();
            return store;
        }catch (Exception e){
            System.out.println("scanStringInput Error! \nPlease check Utilities >> scannerInputs >> scanStringInput");
        }
        return "";
    }

    public static int scanIntegerInput(){
        try{
            Scanner intScanner = new Scanner(System.in);
            int store = intScanner.nextInt();
            //intScanner.close();
            return store;
        }catch (Exception e){
            System.out.println(e);
            System.out.println("scanIntegerInput Error! \nPlease check Utilities >> scannerInputs >> scanIntegerInput");
        }
        return 0;
    }

    public static double scanDoubleInput(){
        try{
            Scanner doubleScanner = new Scanner(System.in);
            double store = doubleScanner.nextDouble();
            //doubleScanner.close();
            return store;
        }catch (Exception e){
            System.out.println("scanDoubleInput Error! \nPlease check Utilities >> scannerInputs >> scanDoubleInput");
        }
        return 0;
    }
}
