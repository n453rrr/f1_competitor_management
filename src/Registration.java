import java.util.ArrayList;
import java.util.List;

// Registration class managing the registration of competitors
class Registration {
    private List<Competitor> competitors;

    public Registration() {
        this.competitors = new ArrayList<>();
    }

    public void registerCompetitor(Competitor competitor) {
        competitors.add(competitor);
    }

    public Competitor searchCompetitor(int competitorNumber) {
        for (Competitor competitor : competitors) {
            if (competitor.getCompetitorNumber() == competitorNumber) {
                return competitor;
            }
        }
        return null;
    }

    public void requestResultsDetails() {
        // Implementation to retrieve and display results details
        System.out.println("Results details requested.");
    }
}

// CompetitorManager interface in the Business Logic Tier
interface CompetitorManager {
    void registerCompetitor(Competitor competitor);
    Competitor searchCompetitor(int competitorNumber);
    void requestResultsDetails();

    // Additional method for lap time recording
    void recordLapTime(float lapTime, Competitor competitor, int lapNumber);
}
