class Solution {
    public double angleClock(int hour, int minutes) {
        
        float angle = (hour%12) * 30 + minutes * 0.5f;
        int M_angle = minutes*6;
        float diff = Math.abs(angle-M_angle);
        float ans = Math.min(diff,360-diff);
        return ans;
    }
}