import java.util.Arrays;

public class Main {


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static double sumExpenses(int[] arr){
        double sumExpenses = 0;
        for (int i : arr) {
            sumExpenses = sumExpenses + i;
        }
        return sumExpenses;
    }
    public static double checkMiddlePayment(double a,int b) {
        return a/b;
    }
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        double total = sumExpenses(arr);
        double middlePayment = checkMiddlePayment(total,arr.length);
        System.out.println(middlePayment);


    }
}