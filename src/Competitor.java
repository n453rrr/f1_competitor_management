import java.util.Arrays;

public class Competitor {
    private int competitorNumber;
    private String name;
    private String country;
    private String level;
    private int[] scores;

    // Constructor
    public Competitor(int competitorNumber, String name, String country, String level, int[] scores) {
        this.competitorNumber = competitorNumber;
        this.name = name;
        this.country = country;
        this.level = level;
        this.scores = scores;
    }

    public Competitor(int competitorNumber, String lewisHamilton, String mercedes) {
    }

    // Getter and Setter methods
    public int getCompetitorNumber() {
        return competitorNumber;
    }

    public void setCompetitorNumber(int competitorNumber) {
        this.competitorNumber = competitorNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    // Method to calculate overall score
    public double getOverallScore() {
        // Example: Calculate the average of all scores
        int sum = Arrays.stream(scores).sum();
        return (double) sum / scores.length;
    }

    // Method to get full details
    public String getFullDetails() {
        StringBuilder details = new StringBuilder();
        details.append("Competitor number ").append(competitorNumber).append(", name ").append(name)
                .append(", country ").append(country).append(".\n")
                .append(name).append(" is a ").append(level).append(" aged ").append(calculateAge()).append(" and received these scores: ")
                .append(Arrays.toString(scores)).append("\nThis gives him/her an overall score of ").append(getOverallScore()).append(".");
        return details.toString();
    }

    // Method to get short details
    public String getShortDetails() {
        return "CN " + competitorNumber + " (" + getInitials() + ") has an overall score of " + getOverallScore() + ".";
    }

    // Helper method to calculate age (you can implement your own logic)
    private int calculateAge() {
        // Implement your age calculation logic here
        return 21; // Example value
    }

    // Helper method to get initials from the name
    private String getInitials() {
        String[] nameParts = name.split(" ");
        StringBuilder initials = new StringBuilder();
        for (String part : nameParts) {
            if (!part.isEmpty()) {
                initials.append(part.charAt(0));
            }
        }
        return initials.toString().toUpperCase();
    }

    public static void main(String[] args) {
        // Example usage
        int[] scores1 = {5, 4, 5, 4, 3};
        Competitor competitor1 = new Competitor(100, "Lewis Hamilton", "UK", "Pro", scores1);
        System.out.println(competitor1.getFullDetails());

        int[] scores2 = {3, 3, 3, 2, 4};
        Competitor competitor2 = new Competitor(101, "Sergio Perez", "Mexico", "Pro", scores2);
        System.out.println(competitor2.getShortDetails());
    }

    public void recordLapTime(float v, Competitor competitor2, int i) {
    }

    public float calculateOverallPerformance() {
        return 0;
    }
}
