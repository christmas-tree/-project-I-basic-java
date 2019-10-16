package tran_trung_nghia_20173281;

public class bai2 {
    public static void main(String[] args) {
        System.out.println("Bài 02: Cho dãy số tự nhiên, in ra màn hình tất cả các số nguyên tố của dãy này.");

        int arr[] = {1, 6, 71, 525, 52, 711, 13, 17, 19, 191, 1612};

        System.out.println("Day so ban dau: ");
        for (int element: arr)
            System.out.print(element + " ");

        System.out.println("\n\nCac so nguyen to trong day: ");
        for (int element: arr) {
            if (laSoNguyenTo(element))
                System.out.print(element + " ");
        }

        System.out.println("\n\nTran Trung Nghia - 20173281");
    }

    public static boolean laSoNguyenTo(int n) {
        for (int i = 2; i < n/2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
