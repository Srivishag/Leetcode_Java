class Solution {
    public void moveZeroes(int[] nums) {
        int[] num=new int[nums.length];
        int n=nums.length,count=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                num[j]=nums[i];
                j++;
            }
            else{
                count++;
            }
        }
        for(int i=0;i<count;i++){
            num[j]=0;
            j++;
        }
        for(int i=0;i<n;i++){
            nums[i]=num[i];
        }
    }
}
