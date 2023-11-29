// LapTime class representing a lap time recorded during the race
class LapTime {
    private final float time;
    private final Competitor opponent;
    private final int lapNumber;

    public LapTime(float time, Competitor opponent, int lapNumber) {
        this.time = time;
        this.opponent = opponent;
        this.lapNumber = lapNumber;
    }

    public float getTime() {
        return time;
    }

    public int getLapNumber() {
        return lapNumber;
    }
}
