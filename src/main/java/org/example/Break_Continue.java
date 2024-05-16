package org.example;

public class Break_Continue {
    public static class Break {
        public static void main(String[] args) {
            int i = 1;
            while (true) {
                if (i == 15) {
                    break;
                } else {
                    System.out.println(i);
                    i++;
                }
            }
            System.out.println("Loop is end");
        }
    }
    public static class Continue {
        public static void main(String[] args) {
            for (int i = 0; i <= 15; i++) {
                if (i%2 == 0) {
                    continue;
                }
                System.out.println("Нечётное число " + i);
            }
        }
    }
}

