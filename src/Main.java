import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);Random random = new Random();
        String [] playersName = new String[5] ;int userNumber=0;
        int randomNumber = random.nextInt(101)+1;
          System.out.println(randomNumber);
          arrayPlayersName(playersName);
           do {
                for (int i = 1; i < playersName.length; i++) {
                    System.out.println(playersName[i] + ", guess a number :");
                    userNumber = scanner.nextInt();
                    if (userNumber == randomNumber){
                        System.out.println("Correct guess! " + playersName[i] + " is the WINNER!");
                        break;
                    }
                    else if (userNumber > randomNumber)
                        System.out.println("Wrong , try a lower number.");
                    else System.out.println("Wrong , try a higher number.");

                }

            }  while (userNumber!=randomNumber);

    }
    public static String [] arrayPlayersName (String[] array){
        Scanner scanner = new Scanner(System.in);
        for (int i=1 ; i<array.length ; i++)
        {
            System.out.println("Player "+ i + ", enter your name :");
            array[i]=scanner.nextLine();
        }
        return array ;
    }

}
