import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CompetitorList {
    private List<Competitor> competitors;

    public CompetitorList() {
        competitors = new ArrayList<>();
    }

    public void addCompetitor(Competitor competitor) {
        competitors.add(competitor);
    }

    public String getFullDetails() {
        StringBuilder details = new StringBuilder();
        for (Competitor competitor : competitors) {
            details.append(competitor.getFullDetails()).append("\n");
        }
        return details.toString();
    }

    public Competitor getHighestScorer() {
        if (competitors.isEmpty()) {
            return null;
        }

        Competitor highestScorer = competitors.get(0);
        for (Competitor competitor : competitors) {
            if (competitor.getOverallScore() > highestScorer.getOverallScore()) {
                highestScorer = competitor;
            }
        }
        return highestScorer;
    }

    public String getSummaryStatistics() {
        if (competitors.isEmpty()) {
            return "No competitors available.";
        }

        double totalScore = 0;
        double maxScore = Double.MIN_VALUE;
        double minScore = Double.MAX_VALUE;
        for (Competitor competitor : competitors) {
            double score = competitor.getOverallScore();
            totalScore += score;
            if (score > maxScore) {
                maxScore = score;
            }
            if (score < minScore) {
                minScore = score;
            }
        }
        double averageScore = totalScore / competitors.size();
        return String.format("Average Score: %.2f, Max Score: %.2f, Min Score: %.2f, Total Competitors: %d",
                averageScore, maxScore, minScore, competitors.size());
    }

    public String getFrequencyReport() {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (Competitor competitor : competitors) {
            for (int score : competitor.getScores()) {
                frequency.put(score, frequency.getOrDefault(score, 0) + 1);
            }
        }

        StringBuilder report = new StringBuilder();
        frequency.forEach((score, count) ->
                report.append("Score ").append(score).append(": ").append(count).append(" times\n")
        );
        return report.toString();
    }

    public Competitor findCompetitorByNumber(int number) {
        for (Competitor competitor : competitors) {
            if (competitor.getNumber() == number) {
                return competitor;
            }
        }
        return null;
    }
}
