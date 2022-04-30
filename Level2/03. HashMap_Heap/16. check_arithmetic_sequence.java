class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                smin = min;
                min = arr[i];
            }else if(arr[i] < smin){
                smin = arr[i];
            }
            set.add(arr[i]);
        }
        if(set.size() == 1){
            return true;
        }
        if(set.size() < arr.length){
            return false;
        }
        int cd = smin - min;
        int term = min;
        for(int i=0; i<arr.length; i++){
            if(set.contains(term) == false){
                return false;
            }
            term += cd;
        }
        return true;
    }
}