import java.util.Scanner;

public class CurrencyNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        int[] notes = {500, 100, 50, 20, 10, 5, 2, 1};
        int[] count = new int[8];

        for (int i = 0; i < notes.length; i++) {
            if (amount >= notes[i]) {
                count[i] = amount / notes[i];
                amount = amount % notes[i];
            }
        }

        System.out.println("Total number of notes:");
        for (int i = 0; i < notes.length; i++) {
            System.out.println(notes[i] + " : " + count[i]);
        }
    }
}
