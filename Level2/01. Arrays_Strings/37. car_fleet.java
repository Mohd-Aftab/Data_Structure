class Solution {
    public class Pair implements Comparable<Pair>{
        int pos;
        int speed;
        double time;
        Pair(){
            
        }
        Pair(int pos, int speed, double time){
            this.pos = pos;
            this.speed = speed;
            this.time = time;
        }
        public int compareTo(Pair o){
            return this.pos - o.pos;
        }
    }
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        Pair[] arr = new Pair[n];
        for(int i=0; i<n; i++){
            int p = position[i];
            int s = speed[i];
            double time = ((1.0)*(target-p))/s;
            arr[i] = new Pair(p, s, time);
        }
        Arrays.sort(arr);
        
        int fleet = 1;
        double ftime = arr[n-1].time;
        for(int i=n-2; i>=0; i--){
            double ct = arr[i].time;
            if(ct <= ftime){
                
            }else{
                fleet += 1;
                ftime = ct;
            }
        }
        return fleet;
    }
}