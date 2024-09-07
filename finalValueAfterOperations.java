class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int num=0;
        for(String n:operations){
            if(n.equals("--X")||n.equals("X--")){
                num--;
            }
            else if(n.equals("X++")||n.equals("++X")){
                num++;
            }
        }
        return num;
    }
}
