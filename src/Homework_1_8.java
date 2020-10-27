public class Homework_1_8 {

    public static void main(String[] args) {

        checkYear(2020);
    }
    static void checkYear(int year) {
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println("Год " + year + " не високосный");
        else System.out.println("Год " + year + " високосный");
    }

}
