// here starts the begining of the sacnner class
import java.util.Scanner;

//class begins here
public class Food{

    // main method begins
    public static void main(String[] args) {
        
        // scanner intialisaton.
        Scanner kofi = new Scanner(System.in);

        

        System.out.println("what is your favourite food .");
        String food = kofi.nextLine();

        System.out.println("Wow that's amazing.");
        kofi.close();
    }
}