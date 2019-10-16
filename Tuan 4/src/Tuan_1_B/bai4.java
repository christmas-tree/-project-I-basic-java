package Tuan_1_B;

public class bai4 {
    public static void main(String[] args) {
        System.out.println("Bài 04: Dãy Fibonaxi 1, 2, 3, … F(k) = F(k-1) + F(k-2). Tính số Fibonaxi thứ N.");
        int N = 29;
        System.out.println("F(" + N + ") = " + fib(N));
        System.out.println("\n\nTran Trung Nghia - 20173281");
    }

    public static long fib(int n) {
        if (n == 1 || n == 2)
            return 1;
        else
            return fib(n-1) + fib(n-2);
    }
}