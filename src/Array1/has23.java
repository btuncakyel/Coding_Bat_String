package Array1;

public class has23 {
    /*

Given an int array length 2, return true if it contains a 2 or a 3.
     */


    public boolean has23(int[] nums) {
        if(nums[0] ==2 || nums[1] ==3 || nums[0] ==3 || nums[1] ==2){
            return true;
        }
        return false;
    }


}
