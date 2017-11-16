package Utilities;

import java.util.ArrayList;

public class query {
    public static String optionsQuery(String question, ArrayList<Integer> array, String store, String type) {
        boolean flag = true;
        while (flag) {
            System.out.print(question);
            store = scannerInputs.scanStringInput();
            for (int i = 0; i < array.size(); i++) {
                if (array.get(i).equals(Integer.parseInt(store))) {
                    flag = false;
                    break;
                } else
                    System.out.print("\nPlease choose one of the options!\n");
            }
        }
        return store;
    }
}
