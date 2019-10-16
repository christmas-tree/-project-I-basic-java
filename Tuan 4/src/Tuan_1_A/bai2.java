package Tuan_1_A;

public class bai2 {
    public static void main(String[] args) {
        System.out.println("Bài 02: In ra màn hình 20 số nguyên tố đầu tiên");
        int count = 0, i = 1;
        while (count < 20) {
            i++;
            boolean laSoNguyenTo = true;
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    laSoNguyenTo = false;
                    break;
                }
            }
            if (laSoNguyenTo) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\n\nTran Trung Nghia - 20173281");
    }
}
