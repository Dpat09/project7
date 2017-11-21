package Storage;

import User.User;
import Utilities.readingWrite;
import manageTransactions.Bank;
import manageTransactions.Portfolio;

public class bankStorage {
    public static boolean writeFile(Bank bank, User user){

        return readingWrite.writeFile(user,null,bank,"bank");

    }

    public static boolean readFile(Bank bank,User user){

        return readingWrite.readFile(user,null,bank,"bank");

    }
}
