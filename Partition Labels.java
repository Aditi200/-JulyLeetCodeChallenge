class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> ans = new ArrayList<Integer>();
        if(S.length() == 0){
            return ans;
        }
        char[] arr = S.toCharArray();
        HashSet<Character> seen = new HashSet<Character>();
        int[] right = new int[26];
        for(char c:arr)
            right[c-'a']++;
        int count =0;
        for(char c:arr){
            count++;
            seen.add(c);
            if(--right[c-'a'] == 0){
                seen.remove(c);
                if(seen.isEmpty()){
                    ans.add(count);
                    count=0;
                }
            }
        }
        return ans;
    }
}