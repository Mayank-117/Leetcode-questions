class Solution {
    public String reverseVowels(String s) {
        char[] st=s.toCharArray();
        int i=0;
        int j=st.length-1;
        char temp;
           while(i<j){
            while(i<j && !(st[i]=='A'|| st[i]=='a'|| st[i]=='E' || st[i]=='e' || st[i]=='I' || st[i]=='i' || st[i]=='O' || st[i]=='o' || st[i]=='U' || st[i]=='u')){
                  i++;
            }
            while(i<j && !(st[j]=='A'|| st[j]=='a'|| st[j]=='E' || st[j]=='e' || st[j]=='I' || st[j]=='i' || st[j]=='O' || st[j]=='o' || st[j]=='U' || st[j]=='u')){
                  j--;
            }
            if(i<j){
            temp=st[i];
            st[i]=st[j];
            st[j]=temp;
            i++;
            j--;
            }
        }
        return String.valueOf(st);
    }
}