package Tuan_1_A;

public class bai5 {
    public static void main(String[] args) {
        System.out.println("Bài 05: In ra màn hình các số nằm giữa 1000 và 2000 đồng thời chia hết cho 3,5,7");

        for (int i = 1000; i <= 2000; i++) {
            if (i % 105 == 0)
                System.out.print(i + " ");
        }

        System.out.println("\n\nTran Trung Nghia - 20173281");
    }
}