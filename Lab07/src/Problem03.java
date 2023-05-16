import java.util.Arrays;

public class Problem03 {
    public static void main(String[] args) {
        Integer[] integers = {8, 2, 6, 5, 1, 9, 3};
        System.out.println("Sorting integers");
        System.out.println("Before:");
        printArray(integers);
        selectionSort(integers);
        System.out.println("After:");
        printArray(integers);
        System.out.println();

        Student[] students = {
                new Student("StudentD", 2.5, 1998),
                new Student("StudentA", 4.0, 2001),
                new Student("StudentB", 3.0, 2001),
                new Student("StudentC", 3.5, 2000)
        };
        System.out.println("Sorting students by name");
        System.out.println("Before:");
        printArray(students);
        selectionSort(students, new CompareByName());
        System.out.println("After:");
        printArray(students);
        System.out.println();

        BigRational[] rationals = {
                BigRational.parseBigRational("5/7"),
                BigRational.parseBigRational("1/2"),
                BigRational.parseBigRational("7/2"),
                BigRational.parseBigRational("1/3")
        };
        System.out.println("Sorting rationals");
        System.out.println("Before:");
        printArray(rationals);
        selectionSort(rationals);
        System.out.println("After:");
        printArray(rationals);
        System.out.println();
    }

    private static void selectionSort(Integer[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
        }
    }

    public static <T extends MyComparable<T>> void selectionSort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
        }
    }

    public static <T> void selectionSort(T[] array, MyComparator<T> comparator) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (comparator.compare(array[j], array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
        }
    }

    private static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    private static void printArray(Object[] array) {
        System.out.println(Arrays.toString(array));
    }

    interface
    MyComparable<T> {
        int compareTo(T other);
    }

    interface MyComparator<T> {
        int compare(T o1, T o2);
    }
    static class Student implements MyComparable<Student> {
        private String name;
        private double GPA;
        private int birthYear;
        public Student(String name, double GPA, int birthYear) {
            this.name = name;
            this.GPA = GPA;
            this.birthYear = birthYear;
        }
        public String getName() {
            return name;
        }
        @Override
        public int compareTo(Student other) {
            return name.compareTo(other.name);
        }
        @Override
        public String toString() {
            return "Student{name='" + name + "', GPA=" + GPA + ", birthYear=" + birthYear + "}";
        }
    }
    static class CompareByName implements MyComparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            return s1.getName().compareTo(s2.getName());
        }
    }
    static class BigRational implements MyComparable<BigRational> {
        private int numerator;
        private int denominator;
        public BigRational(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
        }
        public static BigRational parseBigRational(String rationalString) {
            String[] parts = rationalString.split("/");
            int numerator = Integer.parseInt(parts[0]);
            int denominator = Integer.parseInt(parts[1]);
            return new BigRational(numerator, denominator);
        }
        @Override
        public int compareTo(BigRational other) {
            double value1 = (double) numerator / denominator;
            double value2 = (double) other.numerator / other.denominator;
            return Double.compare(value1, value2);
        }
        @Override
        public String toString() {
            return numerator + "/" + denominator;
        }
    }
}