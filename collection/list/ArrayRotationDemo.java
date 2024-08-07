package java_codes.collection.list;

import java.util.Arrays;

public class ArrayRotationDemo {
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5};
	System.out.println("Original array is : " + Arrays.toString(arr));

	int n=1;

	for(int i=0; i<n; i++) {
		int lastEle=arr[arr.length-1];
			for(int j=arr.length-1; j>0; j--) {
			arr[j]=arr[j-1];
			}
			arr[0]=lastEle;
	}
	System.out.println(" ");
	System.out.println("Array after Rotation : ");
    for (int j : arr) {
        System.out.print(j + ", ");
    }
}
}
