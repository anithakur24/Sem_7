import java.util.Scanner;

public class RockPaperScissorsGame {

    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);
        switch (choice) {
            case 0: return "rock";
            case 1: return "paper";
            default: return "scissors";
        }
    }

    public static String determineWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }

    public static String[][] getStats(int userWins, int compWins, int totalGames) {
        String[][] stats = new String[2][3];
        stats[0][0] = "User";
        stats[1][0] = "Computer";
        stats[0][1] = String.valueOf(userWins);
        stats[1][1] = String.valueOf(compWins);
        double userPercent = (totalGames == 0) ? 0 : (userWins * 100.0 / totalGames);
        double compPercent = (totalGames == 0) ? 0 : (compWins * 100.0 / totalGames);
        stats[0][2] = String.format("%.2f%%", userPercent);
        stats[1][2] = String.format("%.2f%%", compPercent);
        return stats;
    }

    public static void displayResults(String[][] results, String[][] stats) {
        System.out.printf("\n%-10s %-12s %-12s %-10s\n", "Game", "User Choice", "Computer", "Winner");
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < results.length; i++) {
            System.out.printf("%-10s %-12s %-12s %-10s\n", 
                              "Game " + (i + 1), results[i][0], results[i][1], results[i][2]);
        }
        System.out.println("\nOverall Stats:");
        System.out.printf("%-10s %-15s %-15s\n", "Player", "Wins", "Win %");
        System.out.println("------------------------------------------");
        for (String[] row : stats) {
            System.out.printf("%-10s %-15s %-15s\n", row[0], row[1], row[2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int games = sc.nextInt();
        sc.nextLine();
        String[][] results = new String[games][3];
        int userWins = 0, compWins = 0;
        for (int i = 0; i < games; i++) {
            System.out.print("\nEnter your choice (rock, paper, scissors): ");
            String user = sc.nextLine().trim().toLowerCase();
            while (!user.equals("rock") && !user.equals("paper") && !user.equals("scissors")) {
                System.out.print("Invalid input. Please enter rock, paper, or scissors: ");
                user = sc.nextLine().trim().toLowerCase();
            }
            String computer = getComputerChoice();
            String winner = determineWinner(user, computer);
            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
            results[i][0] = user;
            results[i][1] = computer;
            results[i][2] = winner;
        }
        String[][] stats = getStats(userWins, compWins, games);
        displayResults(results, stats);
        sc.close();
    }
}
