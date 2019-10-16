package Tuan_1_A;

public class bai3 {
    public static void main(String[] args) {
        System.out.println("Bài 03: In ra màn hình tất cả các số nguyên tố từ 1000 đến 2000");
        for (int i = 1000; i < 2000; i++) {
            if (i % 2 == 0)
                continue;
            boolean laSoNguyenTo = true;
            for (int j = 1; j <= i/4; j++) {
                if (i % (2 * j + 1) == 0) {
                    laSoNguyenTo = false;
                    break;
                }
            }
            if (laSoNguyenTo) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n\nTran Trung Nghia - 20173281");
    }
}
