package Array;

import java.util.Arrays;

public class Array_2 {

	public static void main(String[] args) {
		
		int a[] = new int[] {10,20,4,35, 10};
		int b[] = {1,2,3,4,5,6};
		int c[] = new int[10];
		for(int i =0;i<c.length;i++) {
			c[i]=i;
			System.out.print(c[i]);
		}
		
		System.out.println();
		System.out.println(Arrays.toString(c));
	}
}
