package by.bsu.tasks.t3;
// Импортируем классы, которые намереваемся использовать в нашей программе.
// Импортировав класс, мы уже не обязаны называть его полным именем.
import java.math.BigInteger;    // Импортируем класс BigInteger из пакета java.math
import java.util.*;             // Импортируем все классы (включая ArrayList)
                                // пакета java.util

/** В этой версии программы применяются целые числа произвольно большого
 * размера, поэтому вычисляемые значения не ограничены сверху.
 * Для кеширования вычисленных значений в ней применяется объект ArrayList
 * вместо массивов фиксированного размера. Метод factorial() объявлен
 * как "synchronized", поэтому его можно смело использовать в
 * многопоточных программах. При изучении этого класса познакомьтесь
 * с java.math.BigInteger и java.util.ArrayList. Работая с версиями Java,
 * предшествующими Java 1.2, используйте Vector вместо ArrayList
 */
public class Factorial4 {

    protected static ArrayList table = new ArrayList();     // Создаем кэш

    static {    // Первый элемент кэша инициализируется значением 0! = 1
        table.add(BigInteger.valueOf(1));
    }
    /** Метод factorial(), использующий объекты BigInteger, сохраняемые в ArrayList */
    public static synchronized BigInteger factorial(int x) {
        if (x < 0) throw new IllegalArgumentException("x должен быть не отрицательным. ");
        for (int size = table.size(); size <= x; size++) {
            BigInteger lastfact = (BigInteger) table.get(size - 1);
            BigInteger nextfact = lastfact.multiply(BigInteger.valueOf(size));
            table.add(nextfact);
        }
        return (BigInteger) table.get(x);
    }
    /** Простой метод main(), который можно использовать в качестве
     * самостоятельной тестирующей программы для нашего метода factorial().
     */
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++)
            System.out.println(i + "! = " + factorial(i));
    }


}