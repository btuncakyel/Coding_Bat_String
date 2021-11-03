package Array1;

public class midThree {
    /*

Given an array of ints of odd length,
 return a new array length 3 containing the elements from the middle of the array.
 The array length will be at least 3.
     */
    public int[] midThree(int[] nums) {

        int[] array = new int[3];

        array[0] = nums[(nums.length/2) -1];
        array[1] = nums[(nums.length/2) ];
        array[2] = nums[(nums.length/2) +1];


        return array;
    }


}
