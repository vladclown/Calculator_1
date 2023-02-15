import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Введите число 1 для вычисления суммы, число 2 для вычисления разности, число 3 для вычисления произведения или число 0 для остановки программа");

            int choiceOfAction = new Scanner(System.in).nextInt();

            //сумма
            if (choiceOfAction == 1) {
                System.out.println("Введите первое слагаемое");
                int a = new Scanner(System.in).nextInt();
                System.out.println("Введите первое слагаемое");
                int b = new Scanner(System.in).nextInt();
                int c = a + b;
                System.out.println("Сумма равна: " + c);
            }

            //разность
            if (choiceOfAction == 2) {
                System.out.println("Введите уменьшаемое");
                int a = new Scanner(System.in).nextInt();
                System.out.println("Введите вычитаемое");
                int b = new Scanner(System.in).nextInt();
                int d = a - b;
                System.out.println("Разность равна: " + d);
            }

            //произведение
            if (choiceOfAction == 3) {
                System.out.println("Введите первый множитель");
                int a = new Scanner(System.in).nextInt();
                System.out.println("Введите второй множитель");
                int b = new Scanner(System.in).nextInt();
                int e = a * b;
                System.out.println("Произведение равно: " + e);
            }

            //остановка программы
            if (choiceOfAction == 0) {
                System.out.println("Программа остановлена!");
                break;
            }

        }



    }
}