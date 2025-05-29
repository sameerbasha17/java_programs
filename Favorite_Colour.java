import java.util.Scanner;
public class Favorite_Colour{
    public static void main(String [] args)
    {
        System.out.println("Guess my favorite colour");
        Scanner obj = new Scanner(System.in);
        String guess = obj.nextLine();
        
        if(guess.equals("blue"))
        {
            System.out.println("Yes , "+guess+" is my favorite colour");
        }
        else{
            System.out.println("No ," + guess + "is not my favorite colour. Try again 😊");
        }
    }
}