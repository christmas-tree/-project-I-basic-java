package Tuan_1_A;

public class bai4 {
    public static void main(String[] args) {
        System.out.println("Bài 04: In ra màn hình các số <100 và chia hết cho 3,7");

        System.out.println("Cac so chia het cho 3:");
        for (int i = 3; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nCac so chia het cho 7:");
        for (int i = 7; i < 100; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nTran Trung Nghia - 20173281");
    }
}
