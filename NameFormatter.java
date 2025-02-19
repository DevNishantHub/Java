import java.util.Scanner;

public class NameFormatter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter full name: ");
        String input = scanner.nextLine();

        char[] name = new char[input.length()];

        for (int i = 0; i < input.length(); i++) {
            name[i] = input.charAt(i);
        }

        System.out.print(name[0] + ". ");
        for (int i = 1; i < name.length; i++) {
            if (name[i - 1] == ' ') {
                System.out.print(name[i] + ". ");
                break;
            }
        }

        int lastSpace = -1;
        for (int i = name.length - 1; i >= 0; i--) {
            if (name[i] == ' ') {
                lastSpace = i;
                break;
            }
        }

        for (int i = lastSpace + 1; i < name.length; i++) {
            System.out.print(name[i]);
        }
    }
}
