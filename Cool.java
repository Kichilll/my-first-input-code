import java.util.Scanner;

public class Cool {

    public static void main(String[] args) {
         
        Scanner Yoo = new Scanner(System.in);

        String name;
        int age;
        System.out.println("What ur name");

        name = Yoo.next();

        System.out.println("wat r age");
        age = Yoo.nextInt();

        System.out.println("My name is :" + name);

        System.out.println("My age is " + age + " years");

        System.out.println("Thanks for ur time ....");



        Yoo.close();



    }
    
}
