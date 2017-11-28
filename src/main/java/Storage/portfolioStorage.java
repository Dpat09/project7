package Storage;


/**
 * Created by Kingsley on 11/17/17.
 */

import User.User;
import Utilities.readingWrite;
import manageTransactions.Portfolio;

public class portfolioStorage {
    public static boolean writeFile(Portfolio portfolio, User user){
        return readingWrite.writeFile(user,portfolio,null,null,"portfolio");
    }
    public static boolean ReadFile(Portfolio portfolio,User user){
        return readingWrite.readFile(user,portfolio,null,null,"portfolio");
    }
}