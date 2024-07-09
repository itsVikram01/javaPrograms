package java_codes.array;

import java.util.Scanner;

public class ArrayElementPositionValue {
    public static void main(String[] args) {
        /*int [] arr = {1,1,2,4,7,13,24,44,81,149,274,...};*/

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no : ");
        int n = sc.nextInt();
        if(n<1){
            System.out.println("Please enter a greater than 0");
            sc.close();
            return;
        }

        int[] arr = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            if(i == 0 || i == 1){
                arr[i] = 1;
            } else if (i == 2) {
                arr[i] = arr[0] + arr[1];
            }else {
                arr[i] = arr[i - 1] + arr[i - 2] + arr[i - 3];
            }
        }
        System.out.println(n + " element value is: " + arr[n-1]);

        sc.close();
    }
}
