package Tuan_1_A;

public class bai7 {

    public static void main(String[] args) {
        System.out.println("Bài 07: Trong các số tự nhiên <=100 hãy đếm xem có bao nhiêu số");

        int count;

        System.out.print("\ta) Chia hết cho 5: ");
        count = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0)
                count++;
        }
        System.out.println(count + " so");

        System.out.print("\tb) Chia 5 dư 1: ");
        count = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 1) {
                count++;
            }
        }
        System.out.println(count + " so");

        System.out.print("\tb) Chia 5 dư 2: ");
        count = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 2) {
                count++;
            }
        }
        System.out.println(count + " so");

        System.out.print("\tb) Chia 5 dư 3: ");
        count = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 3) {
                count++;
            }
        }
        System.out.println(count + " so");

        System.out.println("\n\nTran Trung Nghia - 20173281");
    }
}
