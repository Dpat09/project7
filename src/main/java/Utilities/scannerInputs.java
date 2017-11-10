package Utilities;

import java.util.Scanner;

public class scannerInputs {

    public static void scanInput(String store){
        try{
            Scanner scanner = new Scanner(System.in);
            store = scanner.next();
            scanner.close();
        }catch (Exception e){
            System.out.println("scanInput Error! \nPlease check Utilities >> scannerInputs >> scanInput");
        }

    }
}
