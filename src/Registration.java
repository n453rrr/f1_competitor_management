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
            if (competitor.getNumber() == competitorNumber) {
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

