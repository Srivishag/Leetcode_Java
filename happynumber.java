class Solution {
    public boolean isHappy(int n) {
        Set<Integer> s=new HashSet<>();
       while(n!=1&&!s.contains(n)){
        s.add(n);
        n=sum(n);
       }
       return n==1;
    }
    public int sum(int n){
            int s=n;
            int sum=0;
            while(s>0){
                sum+=((s%10)*(s%10));
                s/=10;
            }
            n=sum;
            return n;
        }
       
    
}
