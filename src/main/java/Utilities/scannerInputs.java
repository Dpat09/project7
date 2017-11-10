package Utilities;

import java.util.Scanner;

public class scannerInputs {

    public static void scanStringInput(String store){
        try{
            Scanner scanner = new Scanner(System.in);
            store = scanner.next();
            scanner.close();
        }catch (Exception e){
            System.out.println("scanStringInput Error! \nPlease check Utilities >> scannerInputs >> scanStringInput");
        }
    }

    public static void scanIntegerInput(int store){
        try{
            Scanner intScanner = new Scanner(System.in);
            store = intScanner.nextInt();
            intScanner.close();
        }catch (Exception e){
            System.out.println("scanIntegerInput Error! \nPlease check Utilities >> scannerInputs >> scanIntegerInput");
        }
    }

    public static void scanDoubleInput(double store){
        try{
            Scanner doubleScanner = new Scanner(System.in);
            store = doubleScanner.nextDouble();
            doubleScanner.close();
        }catch (Exception e){
            System.out.println("scanDoubleInput Error! \nPlease check Utilities >> scannerInputs >> scanDoubleInput");
        }
    }
}
