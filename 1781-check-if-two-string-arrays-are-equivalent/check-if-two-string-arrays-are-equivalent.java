class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int w1=0,w2=0,c1=0,c2=0;
        while(w1<word1.length&&w2<word2.length){
            if(word1[w1].charAt(c1)!=word2[w2].charAt(c2)){
                return false;
            }
                c1++;
                c2++;
            if(c1==word1[w1].length()){
                w1++;
                c1=0;
            }
            if(c2==word2[w2].length()){
                w2++;
                c2=0;
            }
        }
          return w1==word1.length&&w2==word2.length;       
    }
}