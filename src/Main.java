public class Main {
    public static void main(String[] args) {
        task1();
    }

    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    private static void task1() {
        //task1
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("Сумма трат за месяц стоставила " + sum + " рублей");
        //task2
        arr = generateRandomArray();
        int minSum = arr[0];
        int maxSum = arr[0];
        for (int current : arr) {
            if (current < minSum) {
                minSum = current;
            }
            if (current > maxSum) {
                maxSum = current;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSum + " рублей. " +
                "Максимальная сумма трат за день составила " + maxSum + " рублей");
        //task3
        arr = generateRandomArray();
        sum = 0;
        for (int i : arr) {
            sum += i;
        }
        double average = (double) sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");
        //task4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}








