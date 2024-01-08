public class Competitor {
    private int number;
    private String name;
    private String country;
    private String level; // e.g., "Novice"
    private int age;
    private int[] scores; // Array of scores

    // Constructor
    public Competitor(int number, String name, String country, String level, int age, int[] scores) {
        this.number = number;
        this.name = name;
        this.country = country;
        this.level = level;
        this.age = age;
        this.scores = scores;
    }

    public Competitor() {

    }

    // Get and Set methods
    public int getNumber() { return number; }
    public String getName() { return name; }
    public String getCountry() { return country; }
    public String getLevel() { return level; }
    public int getAge() { return age; }
    public int[] getScores() { return scores; }

    public void setNumber(int number) { this.number = number; }
    public void setName(String name) { this.name = name; }
    public void setCountry(String country) { this.country = country; }
    public void setLevel(String level) { this.level = level; }
    public void setAge(int age) { this.age = age; }
    public void setScores(int[] scores) { this.scores = scores; }

    // getOverallScore method (to be modified later)
    public double getOverallScore() {
        // Calculate the overall score based on the scores array.
        // For simplicity, let's use the average of all scores.
        double sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }

    // getFullDetails method
    public String getFullDetails() {
        StringBuilder details = new StringBuilder();
        details.append("Competitor number ").append(number).append(", name ").append(name)
                .append(", country ").append(country).append(".\n")
                .append(name.split(" ")[0]).append(" is a ").append(level).append(" aged ").append(age)
                .append(" and received these scores : ");
        for (int score : scores) {
            details.append(score).append(",");
        }
        details.deleteCharAt(details.length() - 1); // Remove last comma
        details.append("\nThis gives him an overall score of ").append(getOverallScore()).append(".");
        return details.toString();
    }

    // getShortDetails method
    public String getShortDetails() {
        String initials = "";
        for (String part : name.split(" ")) {
            initials += part.charAt(0);
        }
        return "CN " + number + " (" + initials + ") has overall score " + getOverallScore() + ".";
    }
    public float calculateOverallPerformance() {
        // Example implementation
        // Replace this with the actual logic you need
        float performance = 0.0f;
        // Calculate performance based on Competitor's properties
        return performance;
    }
    // Main method for testing
    public static void main(String[] args) {
        int[] scores = {5, 4, 5, 4, 3};
        Competitor competitor = new Competitor(100, "Keith John Talbot", "UK", "Novice", 21, scores);

        System.out.println(competitor.getFullDetails());
        System.out.println(competitor.getShortDetails());
    }
}
