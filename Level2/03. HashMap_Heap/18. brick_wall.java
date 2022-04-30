class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer, Integer> hm = new HashMap<>(); // gap vs count
        for(List<Integer>list : wall){
            int psum = 0;
            for(int i=0; i<list.size() - 1; i++){
                psum += list.get(i);
                int nf = hm.getOrDefault(psum, 0) + 1;
                hm.put(psum, nf);
            }
        }
        int mgap = 0;
        for(int key : hm.keySet()){
            mgap = Math.max(mgap, hm.get(key));
        }
        return wall.size() - mgap;
    }
}