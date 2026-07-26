class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int n = distance.length;
        if(start>destination){
            int temp = start;
            start = destination;
            destination = temp;
        }
        int total =0;
        int clockwise = 0;

        for(int dist : distance){
            total+=dist;
        }

        for(int i=start;i<destination;i++){
            clockwise+=distance[i];
        }

        return Math.min(clockwise, total-clockwise);
    }
}