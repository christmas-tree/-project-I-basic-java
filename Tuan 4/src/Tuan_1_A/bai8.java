package Tuan_1_A;

public class bai8 {
    public static void main(String[] args) {
        System.out.println("Bài 08: Cho số tự nhiên N bất kỳ (đã gán trước đó), tìm và in ra ước số nguyên tố nhỏ nhất của N");

        int N = 247, i = 2;

        while (i <= N)
            if (N % i == 0)
                break;
            else
                i++;
        System.out.println("Ước số nguyên tố nhỏ nhất của " + N + " là: " + i);

        System.out.println("\n\nTran Trung Nghia - 20173281");
    }
}
