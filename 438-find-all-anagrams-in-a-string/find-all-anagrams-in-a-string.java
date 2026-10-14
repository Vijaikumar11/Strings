class Solution {
    public List<Integer> findAnagrams(String s, String p) {
    List<Integer> res=new ArrayList<>();
    if(s.length()<p.length()){
        return res;
    }
        int[] pCounts=new int[26];
        int[] sCounts=new int[26];
        for(int i=0;i<p.length();i++){
            pCounts[p.charAt(i)-'a']++;
            sCounts[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(pCounts,sCounts)){
            res.add(0);
        }
        for(int i=p.length();i<s.length();i++){
            sCounts[s.charAt(i)-'a']++;
            sCounts[s.charAt(i-p.length())-'a']--;
            if(Arrays.equals(pCounts,sCounts)){
                res.add(i-p.length()+1);
            }
        }
        return res;
    }
}