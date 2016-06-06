package by.bsu.tasks.t3;

/** Этот класс демонстрирует рекурсивный способ вычисления факториалов. Этот
 * метод многократно вызывает сам себя, основываясь на формуле n! = n * (n-1)!
 */

public class Factorial2 {
    public static long factorial(long x) {
        if (x < 0) throw new IllegalArgumentException("x должен быть >=0");
        if (x <= 1) return 1;   // Здесь рекурсия прекращается
        else return x * factorial(x - 1); // Шаг рекурсии - вызов самого себя


    }
}