import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String registeredUserName, registeredPassword,restartPassword,newPassword;
        registeredUserName = "enes";
        registeredPassword = "erz3425";

        String userName, password;

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter your username = ");
        userName = input.nextLine();
        System.out.println("Please enter your password to get into the system.");
        password = input.nextLine();

        if ((userName.equals(registeredUserName) && (password.equals(registeredPassword)))) {
            System.out.println("You are logged in.");
        } else {
            System.out.println("Wrong username or password.");
        }
        boolean sifreYenileme = !(password.equals("erz3425"));
        if (sifreYenileme){
            System.out.print
                    ("Do you wanna change your password ?\nIf you want to change your password, say 'yes' otherwise 'no'.\n Answer:  " );

        }

        restartPassword= input.nextLine();
        if(restartPassword.equals("yes")){
            System.out.println("Enter your new password: ");
            newPassword=input.nextLine();
            if (newPassword.equals(registeredPassword)){
                System.out.println("New password musn't identical with your old password. ");
            }else{
                System.out.println("Your password succesfully changed! :) ");
            }

        }else if (restartPassword.equals("no")){
            System.out.println("You didn't approve to obtain a new password.");
        }  else {
            System.out.println("You entered wrong words. You may enter 'yes' or 'no'. ");
        }





    }
}