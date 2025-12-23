import java.util.Scanner;

public class Lab604 {

    public static void display_array(int[] numbers) {
        System.out.print("List of numbers in array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
    public static boolean check_index(int[] numbers, int index) {

        if (index >= 0 && index < numbers.length) {
            return true;
        } else {
            return false;
        }
    }
    public static int input_index(int[] numbers) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter index: ");
        int index = scan.nextInt();


        while (!check_index(numbers, index)) {
            System.out.print("Invalid index!! Enter index, again: ");
            index = scan.nextInt();
        }

        return index;
    }
    public static void main(String[] args) {

        int[] numbers = {47, 13, 82, 17, 61, 29, 94, 36};


        display_array(numbers);


        int currentIndex = input_index(numbers);
        System.out.println();
        System.out.println("The number at index " + currentIndex + " is " + numbers[currentIndex]);
        System.out.print("The number before index " + currentIndex + " is ");

        if (check_index(numbers, currentIndex - 1)) {
            System.out.println(numbers[currentIndex - 1]);
        } else {
            System.out.println("Out of range!!");
        }

        System.out.print("The number after  index " + currentIndex + " is ");
        if (check_index(numbers, currentIndex + 1)) {
            System.out.println(numbers[currentIndex + 1]);
        } else {
            System.out.println("Out of range!!");
        }
    }
}