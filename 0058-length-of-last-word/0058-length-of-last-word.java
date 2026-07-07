class Solution {
    public int lengthOfLastWord(String s) {
        String t=s.trim();
      int str=t.lastIndexOf(" ");
        int o=t.length()-1-str;
       return o;
    }
}