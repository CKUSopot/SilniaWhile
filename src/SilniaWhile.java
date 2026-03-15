import java.util.Scanner;
/**
 * 2. Wzorując się na przykładzie 1 i znając algorytm wyliczania silni z przykładu 5 napisz
 * program SilniaWhile, który używając instrukcji while() obliczy silnię z
 * wprowadzonej liczby.
 */
public class SilniaWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą dodatnią: ");
        int liczba = scanner.nextInt();
        long silnia = 1;
        int i = 1;
        while (i <= liczba) {
            silnia *= i;
            i ++;
        }
        System.out.printf("Silnia: %d! = %d", liczba, silnia);
    }
}