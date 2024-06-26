package day7;

import java.util.Arrays;

public class StaticEx {

	public static void main(String[] args) {
		int [] array1 = {1,5,7,9};
        int [] array2 = {3,6,-1,100,77};
        int [] array3 = ArrayUtil.concat(array1,array2);
        System.out.println(Arrays.toString(array3));
        //결과 : [1 5 7 9 3 6 -1 100 77 ]
	}

}
