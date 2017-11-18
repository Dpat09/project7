package Storage;


/**
 * Created by Kingsley on 11/17/17.
 */

import User.User;
import Utilities.readingWrite;
import manageTransactions.Portfolio;

public class UserPortfolio {






    public void writeFile(Portfolio portfolio, User user){

        readingWrite write = new readingWrite();


        write.writeFile(user,portfolio,"portfolio");


    }

    public boolean ReadFile(Portfolio portfolio,User user){

        readingWrite read = new readingWrite();


        return read.ReadFile(user,portfolio,"portfolio");



    }




}
