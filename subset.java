class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> llist = new ArrayList<>();
        llist.add(new ArrayList<>());
        
        for(int i: nums){
            List<List<Integer>> temp = new ArrayList<>();
            for(List<Integer> list: llist)
            {
                List<Integer> l = new ArrayList<>(list);
                l.add(i);
                temp.add(l);
            }
            llist.addAll(temp);
        }
        return llist;
    }
}