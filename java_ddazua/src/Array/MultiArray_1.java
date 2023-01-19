package Array;

import java.util.Arrays;

public class MultiArray_1 {
	
	public static void main(String[] args) {
		int[][] array= new int[2][5];
		
		System.out.println(array.length);
		System.out.println(array[0].length);
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[0].length;j++) {
				array[i][j]=1;
			}
		}
		System.out.println(Arrays.toString(array));
	}
}
