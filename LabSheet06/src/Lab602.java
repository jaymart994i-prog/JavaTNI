import java.util.Scanner;

public class Lab602 {
    public static void main(String[] args) {
        String[] movies = {
                "Me Before You",
                "Titanic",
                "Before Sunrise",
                "The Holiday",
                "A Walk to Remember"
        };

        double[] ratings = {4.2, 4.9, 4.4, 3.7, 4.3};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a movie title: ");
        String inputTitle = scanner.nextLine();

        int foundIndex = -1;

        for (int i = 0; i < movies.length; i++) {
            if (movies[i].equalsIgnoreCase(inputTitle)) {
                foundIndex = i;
                break;
            }
        }
        if (foundIndex != -1) {
            System.out.println("\nThe rating score of \"" + movies[foundIndex] + "\" is " + ratings[foundIndex]);
            int rank = find_rank(ratings[foundIndex], ratings);
            System.out.println("This movie is ranked number " + rank);
        } else {
            System.out.println("\nCannot found this movie title...");
        }
        scanner.close();
    }

    public static int find_rank(double currentRating, double[] allRatings) {
        int rank = 1;
        for (double r : allRatings) {
            if (r > currentRating) rank++; {
            }
        }
        return rank;
    }
}