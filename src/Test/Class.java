package Test;

public class Class {

        public static void main(String[] args) {
            int number = 1000;
            minus(number);
        }

        public static void minus (int number) {
            if (number < 0 ) return;
            System.out.println(number);
            minus(--number);
        }
    }

