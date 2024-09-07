class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> arr=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(arr.containsKey(nums[i])){
                int j=arr.get(nums[i]);
                if((i-j)<=k){
                    return true;
                }
            }
                arr.put(nums[i],i);
        }
        return false;
    }
}
