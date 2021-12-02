package oop_labs;

import static org.junit.jupiter.api.Assertions.*;
import junit.framework.TestCase;

import org.junit.jupiter.api.Test;

class SubArrayTest {
         @Test
	     public void testMax(){
	         int x = 1;  //test cases
	         int y = 2;
	         int z = -1;
	         SubArray  sub = new SubArray();
	         int result1 = sub.max(x, y);
	         int result2 = sub.max(y,x);
	         int result3 = sub.max(z, x);
	         assertTrue(result1 == y);
	         assertTrue(result2 == y);
	         assertTrue(result3 == 1);
	     }
	     
         @Test
	     public void testMaxSubArr(){
	         
	         int arr1[] ={1,2,3,-1}; //test cases
	         int arr2[] = {1,2,-4,8,4,-4,6,-2,1};
	         int  arr3[] ={-4,-2,-1,-3};
	         int arr4[] = {-4,2,-4,2,-1};
	         SubArray sub = new SubArray();
	         
	         
	         assertTrue(sub.maxSubArr(arr1) == 6);
	         assertTrue(sub.maxSubArr(arr2) == 14);
	         assertTrue(sub.maxSubArr(arr3) == -1);
	         assertTrue(sub.maxSubArr(arr4) == 2);
	}

}
