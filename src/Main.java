import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        System.out.println("Задача 1.");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " +sum+" рублей");
    }
    public static void task2() {
        System.out.println("Задача 2.");
        int[] arr = generateRandomArray();
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
        int[] arr = generateRandomArray();
        int sum = 0;
        int month = 30;
        for (int j :arr){
            sum +=j;
        }
        float middle = (float) sum / month;
        System.out.println("Средняя сумма трат за месяц составила " + middle + " рублей ");
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