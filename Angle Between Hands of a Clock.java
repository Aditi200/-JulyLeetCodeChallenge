class Solution {
    public double angleClock(int hour, int minutes) {
        double alpha = ((hour * 60  + minutes) / 2.0) % 360.0;
        double beta = minutes * 6;
        double angle = Math.abs(beta - alpha);
        return Math.min(angle, 360 - angle);
    }
}