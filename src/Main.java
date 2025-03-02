import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1() {
        System.out.println("Задача 1.");
        int[] arr = {66666,66666,66666,66666,66666};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2.");
        int[] arr = {13332,13333,13334,13333,13332};
        int min = arr[0];
        int max = 0;
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
    }

    public static void task3() {
        System.out.println("Задача 3.");
        int[] mounth = {13332,13333,13334,13333,13332};
        int sum = 0;
        for (int i = 0; i < mounth.length; i++) {
            sum += mounth[i];
        }
            sum = sum / 5;
        System.out.println("Средняя сумма трат за месяц составила " + sum + " рублей ");
    }

    public static void task4() {
        System.out.println("Задача 4.");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            int a = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = (char) a;
        }
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }
    }
}