import java.util.Scanner;

// the beginning of my class
public class Lol{

    //this section represent the main method.
    public static void main(String[] args) {
        Scanner inputInfo = new Scanner(System.in);

        System.out.println("Welcome to code academy ,please enter your log in on the next line below!");

        System.out.println("Please enter your user name here.");
       String inputname = inputInfo.nextLine();

       System.out.println("Please enter your password here");
    
    int inputPasscode = inputInfo.nextInt();

    System.out.println("Log in successful!");

    System.out.println("Your user name is "+ inputname + " " + " and your password is " + inputPasscode + " !!!" );

    System.out.println("Hope you'll like to save your log in on this browser");
        
     inputInfo.close();
    }
} 
    
