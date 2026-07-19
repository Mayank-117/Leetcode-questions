class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        List<Boolean> l=new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(max<=candies[i]+extraCandies){
                l.add(true);
            }
            else{
                l.add(false);
            }
        }
        return l;
    }
}