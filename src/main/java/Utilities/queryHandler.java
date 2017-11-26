package Utilities;

public class queryHandler {
    public static int optionsQuery(String question, int numOptions) {
        boolean flag = true;
        int store = 0;
        while (flag) {
            System.out.print(question);
            store = scannerInputs.scanInteger();
            for (int i = 1; i <= numOptions; i++) {
                if (i == store) {
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.print("\nPlease choose one of the options!\n");
            }
        }
        return store;
    }

    public static String inputInfo (String title){
        System.out.print(title);
        return scannerInputs.scanString();
    }
}
