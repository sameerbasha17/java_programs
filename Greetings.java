import java.util.Scanner;
public class Greetings {             //errors are there
    public static void main(String [] args)
    {
        System.out.println("Hello there ! What's your name");
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        System.out.println("Hello "+name+"how are you?");
        String mood = sc.nextLine();

        int flag =0;
    
    do{
        if(mood == "good") {
            System.out.println("Hmm,it's good to hear. Nyc...");
            flag = 1;
        }
        if(mood == "bad"){
            System.out.println("Hoo... Don't worry , everything will be fine 😊");
            flag = 1 ;
        }
        else{
            System.out.println("Could you specify your mood is 'good' or 'bad' ");
            break;
        }
    }while(false);
}
}