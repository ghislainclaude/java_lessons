import java.util.Scanner;

public class GetInput1{ 
     public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("What's your Name:");        
        String name = in.nextLine();
        System.out.println("What is your surname");
        String surname = in.nextLine();
        System.out.println("Your name: " + name + " " + surname);
    }
}
