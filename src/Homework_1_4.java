public class Homework_1_4 {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        if(a + b >= 10 && a + b <= 20) {
            System.out.println(true);
        }
        else
            System.out.println(false);

    }

    // Второй вариант

    static boolean task04(int a, int b){

        int sum = a + b;
        if (sum >= 10 && sum <= 20)
            return true;
        else
            return false;
    }


}
