package Tuan_1_A;

public class bai1 {
    public static void main(String[] args) {
        System.out.println("Bài 01: In ra màn hình tất cả các hợp số <100\n");

        for (int i = 4; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                boolean laHopSo = false;
                for (int j = 3; j < i / 2; j++) {
                    if (i % j == 0) {
                        laHopSo = true;
                        break;
                    }
                }
                if (laHopSo) {
                    System.out.print(i + " ");
                }
            }
        }

        System.out.println("\n\nTran Trung Nghia - 20173281");
    }
}
