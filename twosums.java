class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        for(int i=1;i<nums.length;i++){
           if(nums[i-1]+nums[i]==target){
            arr[0]=i-1;
            arr[1]=i;
           }
            
        }
        return arr;
    }
}
