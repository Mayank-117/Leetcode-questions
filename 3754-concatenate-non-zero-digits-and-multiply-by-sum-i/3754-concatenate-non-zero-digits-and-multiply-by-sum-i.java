class Solution {
    public long sumAndMultiply(int n) {
     String s=String.valueOf(n);
     String v=s.replace("0","");
     if(v.isEmpty()){
        return 0;
     }
     long num=Long.parseLong(v);
     long org=num;
     long sum=0;
     while(num!=0){
         long rem=num%10;
         num=num/10;
         sum+=rem;
     }
     return sum*org;
    }
}