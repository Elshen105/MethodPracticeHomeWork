import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        findRandomNumber();
    }


    public static void findRandomNumber() {
        int randomNum = getRandomNumber();
        int enterNum;
        while (true) {

            enterNum = enterNumber();

            if (enterNum > randomNum) {
                System.out.println("Daha kiçik rəqəm daxil edin");
            } else if (enterNum < randomNum) {
                System.out.println("Daha böyük rəqəm daxil edin");
            } else {
                congratulationMessage();
                break;
            }
        }


    }

    public static int getRandomNumber() {
        return new Random().nextInt(100) + 1;
    }


    public static int enterNumber() {
        System.out.print("Bir rəqəm təxmin edin (1-100 arasında) : ");
        return new Scanner(System.in).nextInt();
    }

    public static void congratulationMessage() {
        System.out.println("Tebrikler dogru reqemi tapdiniz");
    }

}
