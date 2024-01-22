package challenge3;

public enum LetterBingo {
    B(1, 15, 5), I(16,30,5), N(31,45,4), G(46,60,5) ,O(61,75,5);
    private int min;
    private int max;
    private int lon;

    LetterBingo(int min, int max, int lon) {
        this.min = min;
        this.max = max;
        this.lon = lon;
    }
    public String getLetter(){
        return this.name();
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getLon() {
        return lon;
    }

    public void setLon(int lon) {
        this.lon = lon;
    }
}
