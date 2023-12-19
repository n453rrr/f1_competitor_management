// CompetitorManager interface in the Business Logic Tier
interface CompetitorManager {
    void registerCompetitor(Competitor competitor);

    Competitor searchCompetitor(int competitorNumber);

    void requestResultsDetails();

    // Additional method for lap time recording
    void recordLapTime(float lapTime, Competitor competitor, int lapNumber);
}
