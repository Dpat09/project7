package Storage;

import Stock.stockStore;
import User.User;
import Utilities.readingWrite;

public class stockStorage {
    public static boolean writeFile(stockStore stocksList, User user){
        return readingWrite.writeFile(user,null,null,stocksList,"stock");
    }
    public static boolean readFile(stockStore stocksList, User user){
        return readingWrite.readFile(user,null,null,stocksList,"stock");
    }
}
