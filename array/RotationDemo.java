package java_codes.array;

public class RotationDemo {
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5};
	int n=1;
	System.out.println("Original array is:");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+"");
	}
	for(int i=0;i<n;i++) {
		int lastele=arr[arr.length-1];
			for(int j=arr.length-1;j>0;j--) {
			arr[j]=arr[j-1];
			}
			arr[0]=lastele;
	}
	System.out.println(" ");
	System.out.println("Array after Rotation:");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+"");
	}
}
}
