// Example usage
public class F1CompetitionSystem {
    public static void main(String[] args) {
        // Sample Competitors
        Competitor competitor1 = new Competitor(100, "Lewis Hamilton", "Mercedes");
        Competitor competitor2 = new Competitor(101, "Sebastian Vettel", "Ferrari");

        // Registration
        CompetitorManager competitorManager = new CompetitorManager() {
            @Override
            public void registerCompetitor(Competitor competitor) {

            }

            @Override
            public Competitor searchCompetitor(int competitorNumber) {
                return null;
            }

            @Override
            public void requestResultsDetails() {

            }

            @Override
            public void recordLapTime(float v, Competitor competitor2, int i) {

            }
        };
        competitorManager.registerCompetitor(competitor1);
        competitorManager.registerCompetitor(competitor2);

        // Lap time recording
        competitorManager.recordLapTime(1.30f, competitor2, 1);
        competitorManager.recordLapTime(1.25f, competitor2, 2);

        // Accessing functionalities through the Competitor Manager
        Competitor foundCompetitor = competitorManager.searchCompetitor(100);
        if (foundCompetitor != null) {
            System.out.println("Competitor found: " + foundCompetitor.getName());
            competitorManager.requestResultsDetails();
            float overallPerformance = foundCompetitor.calculateOverallPerformance();
            System.out.println("Overall Performance: " + overallPerformance);
        } else {
            System.out.println("Competitor not found.");
        }
    }
}
