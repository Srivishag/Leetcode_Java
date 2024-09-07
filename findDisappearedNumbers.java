class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> arr=new ArrayList<>();
        Set<Integer> list=new HashSet<>();
        for(int i:nums){
            list.add(i);
        }
        for(int i=1;i<=nums.length;i++){
            if(!list.contains(i)){
                arr.add(i);
            }
        }
        return arr;
    }
}
