import java.util.Random;
import java.util.Scanner;

public class Homework_3 {

    public static void main(String[] args) {

        guessNumber();

    }

    public static void guessNumber(){

        // 1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
        // При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
        // После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

        Scanner input = new Scanner(System.in);

        Random random = new Random();
        int number = random.nextInt(10);
        System.out.println("Угадайте число от 0 до 9. Всего есть 3 попытки, чтобы угадать.");

        for (int i = 0; i < 3; i++){
            System.out.println("Попытка " + (i+1) + ": ");
            int guessNumber = input.nextInt();
            if (guessNumber < number) System.out.println("Число больше!");
            if (guessNumber > number) System.out.println("Число меньше!");
            if (guessNumber == number) {System.out.println("Вы угадали!");
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");

                int continueGame = input.nextInt();
                if (continueGame == 1) guessNumber();
                else {System.out.println("Спасибо за игру!");
                break;
                }
            }
        }
        System.out.println("Вы не угадали :(");
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        int continueGame = input.nextInt();
        if (continueGame == 1) guessNumber();
        else {System.out.println("Спасибо за игру!");
        }
    }
}



