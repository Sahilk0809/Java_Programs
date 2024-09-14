import java.util.Scanner;

public class AdditionOfTwoArrays {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] arr3 = new int[n];

        System.out.println("Enter the elements of the 1st array: ");
        for (int i = 0; i < n; i++) {
            System.out.print("arr1[" + i + "]: ");
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter the elements of the 2nd array: ");
        for(int i = 0; i < n; i++){
            System.out.print("arr2[" + i + "]: ");
            arr2[i] = sc.nextInt();
            arr3[i] = arr1[i] + arr2[i];
        }
        System.out.println("Addition of two arrays is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
