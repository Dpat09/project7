package Utilities;

import java.util.ArrayList;

public class query {
    public static <T extends Comparable<T>> Comparable queryTest(String question, ArrayList<Comparable> array, String type){
        String store = "";
        scannerInputs.scanInput(store);
        //Comparable tempStore = queryHelper(type);
        System.out.print(question);

        for (int i = 0; i < array.size() ; i++){
            if (array.get(i).compareTo(store) == 0)
                return true;
        }
//        if (type.equalsIgnoreCase("int")) {
//            scannerInputs.scanStringInput(store);
//            tempStore = Integer.parseInt(store);
//        }
//        else if (type.equalsIgnoreCase("string")){
//            scannerInputs.scanStringInput(store);
//            tempStore = store;
//        }
//        else if (type.equalsIgnoreCase("double")){
//            scannerInputs.scanStringInput(store);
//            tempStore = Double.parseDouble(store);
//        }
//        else if (type.equalsIgnoreCase("char")){
//            scannerInputs.scanStringInput(store);
//            tempStore = Character.toUpperCase(store.charAt(0));
//        }
        return true;
    }

    private static Comparable queryHelper(String type){
        String store = "";
        Comparable tempStore = null;

        if (type.equalsIgnoreCase("int")) {
            scannerInputs.scanStringInput(store);
            return Integer.parseInt(store);
        }
        else if (type.equalsIgnoreCase("string")){
            scannerInputs.scanStringInput(store);
            return store;
        }
        else if (type.equalsIgnoreCase("double")){
            scannerInputs.scanStringInput(store);
            return Double.parseDouble(store);
        }
        else if (type.equalsIgnoreCase("char")){
            scannerInputs.scanStringInput(store);
            return Character.toUpperCase(store.charAt(0));
        }

        return true;
    }
}
