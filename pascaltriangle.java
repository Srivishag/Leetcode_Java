class Solution {
    public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> arr=new ArrayList<List<Integer>>();
            if(numRows<=0){
                return arr;
            }
            arr.add(new ArrayList<Integer>());
            arr.get(0).add(1);
            for(int i=1;i<numRows;i++){
                arr.add(new ArrayList<Integer>());
                arr.get(i).add(1);
                for(int j=1;j<arr.get(i-1).size();j++){
                    arr.get(i).add(arr.get(i-1).get(j-1)+arr.get(i-1).get(j));
                }
                arr.get(i).add(1);
            }
            return arr;
    }
}
