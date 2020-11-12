package Test;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factor(5));
    }

    public static int factor (int number) {
        if (number < 0) throw new IllegalArgumentException("Значение должно быть больше 0");
        if (number == 1 || number == 0) return 1;
        return number * factor(number-1);
    }
}
