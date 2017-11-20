package Storage;

/**
 * Created by Kingsley on 11/16/17.
 */
import User.User;
import Utilities.readingWrite;

public class userStorage {

   public static boolean writeFile( User user){

      return readingWrite.writeFile(user,null,"user");

   }

   public static boolean readFile(User user){

      return readingWrite.readFile(user,null,"user");

   }
}