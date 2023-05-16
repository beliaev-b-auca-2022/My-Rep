import java.math.BigInteger;
import java.util.Arrays;
public class Problem01 {
    public static void main(String[] args) {
        int[] integers = {8, 2, 6, 5, 1, 9, 3};
        System.out.println("Sorting integers");
        System.out.println("Before:");
        System.out.println(Arrays.toString(integers));
        Arrays.sort(integers);
        System.out.println("After:");
        System.out.println(Arrays.toString(integers));
        System.out.println();

        String[] strings = {"Java", "C++", "Kotlin", "C#", "Scala", "C"};
        System.out.println("Sorting strings");
        System.out.println("Before:");
        System.out.println(Arrays.toString(strings));
        Arrays.sort(strings);
        System.out.println("After:");
        System.out.println(Arrays.toString(strings));
        System.out.println();

        BigInteger[] bigIntegers = {
                new BigInteger("3874357438573487"),
                new BigInteger("-587485748753874357438573487"),
                new BigInteger("758437584756847534785983749587439587398457"),
                new BigInteger("938493849839584758475847")
        };
        System.out.println("Sorting big integers");
        System.out.println("Before:");
        System.out.println(Arrays.toString(bigIntegers));
        Arrays.sort(bigIntegers);
        System.out.println("After:");
        System.out.println(Arrays.toString(bigIntegers));
        System.out.println();

        Rational[] rationals = {
                new Rational(5, 7),
                new Rational(1, 2),
                new Rational(7, 2),
                new Rational(1, 3)
        };
        System.out.println("Sorting rationals");
        System.out.println("Before:");
        System.out.println(Arrays.toString(rationals));
        Arrays.sort(rationals);
        System.out.println("After:");
        System.out.println(Arrays.toString(rationals));
        System.out.println();
    }

    static class Rational implements Comparable<Rational> {
        private int numerator;
        private int denominator;

        public Rational(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
        }
        @Override
        public int compareTo(Rational other) {
            double thisValue = (double) numerator / denominator;
            double otherValue = (double) other.numerator / other.denominator;
            return Double.compare(thisValue, otherValue);
        }

        @Override
        public String toString() {
            return numerator + "/" + denominator;
        }
    }
}