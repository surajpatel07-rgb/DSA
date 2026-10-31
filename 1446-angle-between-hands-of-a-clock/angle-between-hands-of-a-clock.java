class Solution {
    public double angleClock(int hour, int minutes) {
        // hour ka angle
        double hourangle = (hour % 12) * 30 + minutes * 0.5;
        double minangle = minutes * 6;
        // gap betwwn hands 
        double gap = Math.abs(hourangle - minangle);
        // min angle
        return Math.min(gap,360 - gap);
    }
}