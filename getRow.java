class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> arr=new ArrayList<>();
        long last=1;
        arr.add(1);
        //int val=1
        for(int i=1;i<rowIndex+1;i++){
            long current=(last*(rowIndex-i+1)/i);
            arr.add((int)current);
            last=current;
        }
        return arr;
    }
}
//pascall triangle 2
