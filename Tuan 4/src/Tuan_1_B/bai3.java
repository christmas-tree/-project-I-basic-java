package Tuan_1_B;

public class bai3 {
    public static void main(String[] args) {
        System.out.println("Bài 03: Cho số tự nhiên N bất kỳ,\n" +
                "Tính tổng S = 1+1/(1+2!) + 1/(1+2!+3!)+ ..+ 1/(1+2!+3!+..+N!)\n");

        int N = 4;

        double tong = 0;
        for (int j = 1; j <= N; j++) {
            tong += thuaSo(j);
        }
        System.out.println("Tong = " + tong);
        System.out.println("\n\nTran Trung Nghia - 20173281");
    }

    public static double thuaSo(int n) {
        long mauSo = 0;
        for (int i = 1; i <= n; i++) {
            mauSo += luyThua(i);
        }
        return 1.0/mauSo;
    }

    public static long luyThua(int n) {
        long ketQua = 1;
        for (int i = 1; i <= n; i++) {
            ketQua *= i;
        }
        return ketQua;
    }
}
