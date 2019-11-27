import java.util.Scanner;
/**
 * Задача № 6
 * Написать программу, которая будет выполнять следующие действия:
 * 1) Ввод трех чисел с клавиатуры x, y, z
 * 2) Нахождение и вывод на экран среднего арифметического чисел x, y, z
 * 3) Деление среднего арифметического на 2 без остатка
 * 4) Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
 */

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int a = (x + y + z ) / 3 ;
        System.out.println(a);

        if (a / 2 > 3) System.out.println("Программа выполнена корректно!");
    }
}
