import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ыыедите максимальное количество попыток");
        int max = scanner.nextByte();
        System.out.println("введите верхний предел");
        int upper = scanner.nextInt();
        System.out.println("введите нижний предел");
        int lower = scanner.nextInt();

        Random random = new Random();
        int randomNumber;
        randomNumber = lower + random.nextInt(upper);
        int count = 1;
        boolean status = false;
        while (count <= max) {
            System.out.println("введите число");
            int userInput = scanner.nextInt();
            if (userInput == randomNumber) {
                System.out.println("Ты угадал");
                status = true;
                break;
            } else if (userInput > randomNumber) {
                System.out.println("мое число меньше");
                status = false;
            } else {
                System.out.println("мое число больше");
                status = false;
            }
            count++;
        }
        if (status == false) {
            System.out.println("Конец игры");
            System.out.println("я загадал " + randomNumber);
        }
    }
}
