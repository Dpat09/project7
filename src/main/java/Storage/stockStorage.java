package Storage;

import User.User;
import Utilities.readingWrite;
import manageTransactions.Portfolio;

public class stockStorage {
    public static boolean writeFile(Portfolio portfolio, User user){
        return readingWrite.writeFile(user,portfolio,null,"stock");
    }
    public static boolean readFile(Portfolio portfolio, User user){
        return readingWrite.readFile(user,portfolio,null,"stock");
    }
}
