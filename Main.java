import java .util.Scanner;

public class Main{


 public static void main(String[] args) {
Scanner input = new Scanner(System.in);

boolean isOnRepeat =true;
 while(isOnRepeat) {
    System.out.println("Playing current song");

    System.out.println("Do you want to turn off repeat,if so say Yes");

    String userInPut = input.next();

    if(userInPut.equals("Yes")){
        isOnRepeat = false;
    }
    System.out.println("Playing next song");
 }




 }



    
}
