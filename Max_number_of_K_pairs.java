public class Max_number_of_K_pairs {

    public int maxOperations(int[] nums, int k) {
        int i =0;
        int j =0;
        int result= 0;
        int t=0;
        while(i<nums.length-1){
            if(i<j && nums[i]+nums[j]==k){
//                This is new pull
//                this is test for seccond commit
                result++;
            }
        }
        return result;
    }

}
