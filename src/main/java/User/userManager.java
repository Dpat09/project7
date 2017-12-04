package User;

import static Utilities.queryHandler.*;

public class userManager {
    public static void userManagerMenu(User currentUser){
        int input = 0;
        String title = "\n\n\n\t\t========================\n" +
                "\t        Manage User             \n" +
                "\t\t========================\n\n";
        String question = "1.) Change password"
                +"\n2.) Go back to Main Menu"
                +"\nEnter Choice: ";

        while (input !=2){
            input = optionsQuery(title+question,2);
            switch (input){
                case 1:
                    changeUserPass(currentUser);
                    break;
                case 2:
                    break;
            }
        }
    }

    protected static void changeUserPass(User currentUser){
        while (true){
            System.out.println("\n\n\n\t\t========================\n" +
                    "\t        Change Password          \n" +
                    "\t\t========================\n\n");

            String oldPass = inputInfo("Enter current password:");
            String newPass = inputInfo("Enter new password:");

            if (oldPass.equals(currentUser.getPassword())){
                currentUser.setPassword(newPass);
                break;
            }
            else
                System.out.println("\n\nThe current password did not match.\nPlease try again.");
        }

    }

}
