import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите что нибудь");
        String string = sc.nextLine();
        System.out.println("ВЫ ввели " + string);

    }
}

