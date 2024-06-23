package java_codes.array;

import java.util.Arrays;

public class ArrayElementSwitch {
    public static void main(String[] args) {
        int arr[]= {1,0,2,0,0,3,0,0,4,5,6};
        int i;
        int j=0;
        for (i=0; i<arr.length; i++){
            if (arr[i]!=0){
                System.out.print(arr[j]=arr[i]);
                j++;
            }
        }
        System.out.println("--------------------");
        while(j<arr.length){

                System.out.print(arr[j]=0);
                j++;


        }
        System.out.println();
        System.out.println(arr[9]);
        System.out.print(Arrays.toString(arr));
    }

}
