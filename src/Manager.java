import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Manager {

    private CompetitorList competitorList;

    public Manager() {
        competitorList = new CompetitorList();
    }

    public void readCompetitorsFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(","); // Assuming CSV format
                int number = Integer.parseInt(data[0]);
                String name = data[1];
                String country = data[2];
                String level = data[3];
                int age = Integer.parseInt(data[4]);
                int[] scores = new int[data.length - 5]; // Remaining data are scores
                for (int i = 5; i < data.length; i++) {
                    scores[i - 5] = Integer.parseInt(data[i]);
                }
                Competitor competitor = new Competitor(number, name, country, level, age, scores);
                competitorList.addCompetitor(competitor);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void displayFullReport() {
        System.out.println("Full Details of All Competitors:");
        System.out.println(competitorList.getFullDetails());

        System.out.println("Competitor with Highest Overall Score:");
        Competitor highestScorer = competitorList.getHighestScorer();
        if (highestScorer != null) {
            System.out.println(highestScorer.getFullDetails());
        }

        // Implement and call other summary statistics and frequency report methods here
    }

    public void handleUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Competitor Number: ");
        int number = scanner.nextInt();
        Competitor competitor = competitorList.findCompetitorByNumber(number);
        if (competitor != null) {
            System.out.println(competitor.getShortDetails());
        } else {
            System.out.println("Competitor not found.");
        }
        scanner.close();
    }

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.readCompetitorsFromFile("RunCompetitor.csv"); // Replace with your file path
        manager.displayFullReport();
        manager.handleUserInput();
    }
}
