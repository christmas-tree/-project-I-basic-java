package Tuan_1_B;

public class bai1 {
    public static void main(String[] args) {
        System.out.println("Bài 01: Cho số tự nhiên N bất kỳ\n" +
                "Tính tổng S=1+1/(1+2) + 1/(1+2+3) +…+ 1/(1+2+3+..+N)\n");
        int N = 7;

        double tong = 0;
        for (int j = 1; j <= N; j++) {
            tong += thuaso(j);
        }
        System.out.println("Tong = " + tong);
        System.out.println("\n\nTran Trung Nghia - 20173281");
    }

    public static double thuaso(int n) {
        long mauSo = 0;
        for (int i = 1; i <= n; i++) {
            mauSo += i;
        }
        return 1.0/mauSo;
    }
}
