package Tuan_1_A;

public class bai10 {
    public static void main(String[] args) {
        System.out.println("Bài 10: Cho trước số tự nhiên N bất kỳ (đã gán trước đó). In ra màn hình tất cả các ước số nguyên tố khác nhau của N");

        long N = 91653120L;

        System.out.println("Cac uoc so nguyen to cua " + N + " la: ");
        long N2 = N, i = 2L, j = 1L;
        while (N2 > 1) {
            if (N2 % i == 0) {
                N2 /= i;
                if (i != j) {
                    System.out.print(i + " ");
                    j = i;
                }
            }
            else
                i++;
        }
        System.out.println("\n\nTran Trung Nghia - 20173281");
    }
}
