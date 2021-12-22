import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int value;
        do {
            System.out.println("Введи 10");
            value=scanner.nextInt();
        }while(value!=10);
        System.out.println("Вы ввели 10");
    }
}
