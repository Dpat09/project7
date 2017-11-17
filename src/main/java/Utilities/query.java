package Utilities;

import java.util.ArrayList;

public class query {
    public static int optionsQuery(String question, ArrayList<Integer> array) {
        boolean flag = true;
        int store = 0;
        while (flag) {
            System.out.print(question);
            store = scannerInputs.scanIntegerInput();
            for (int i = 0; i < array.size(); i++) {
                if (array.get(i).equals(store)) {
                    flag = false;
                    break;
                }
            }
            if (!flag){
                System.out.print("\nPlease choose one of the options!\n");
            }
        }
        return store;
    }
}
