package Tuan_1_A;

public class bai9 {
    public static void main(String[] args) {
        System.out.println("Bài 09: Cho số tự nhiên N>1 bất kỳ (đã gán trước đó). In ra khai triển thành tích các số nguyên tố tính từ nhỏ đến lớn VD: 9\uF0E03.3; 12\uF0E02.2.3\n");

        int N = 1024;

        String ketQua = "";
        int N2 = N, i = 2;

        while (N2 > 1) {
            if (N2 % i == 0) {
                ketQua += i + " * ";
                N2 /= i;
            }
            else
                i++;
        }
        ketQua = ketQua.substring(0, ketQua.length() - 3);
        System.out.println(N + " = " + ketQua);

        System.out.println("\n\nTran Trung Nghia - 20173281");
    }
}
