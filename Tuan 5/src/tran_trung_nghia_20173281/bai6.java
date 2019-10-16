package tran_trung_nghia_20173281;

public class bai6 {
    public static void main(String[] args) {
        System.out.println("Bài 06: Cho một dãy số tự nhiên, hãy in ra tất cả các số hạng của dãy trên thỏa mãn: số này là ước số thực sự của 1 số hạng khác trong dãy trên.");
        int arr[] = {2, 3, 15, 5, 7, 105, 315};
        System.out.print("Mang: ");
        for (int e: arr)
            System.out.print(e + " ");

        for (int e: arr)
            uocTrongMang(arr, e);

        System.out.println("\n\nTran Trung Nghia - 20173281");
    }

    public static void uocTrongMang(int arr[], int n) {
        boolean coUoc = false;
        boolean uocThuNhat = true;
        for (int e: arr) {
            if (e == n)
                continue;
            if (n % e == 0) {
                coUoc = true;
                if (uocThuNhat) {
                    uocThuNhat = false;
                    System.out.print("\nCac uoc cua " + n + " trong mang la: ");
                }
                System.out.print(e + " ");
            }
        }
        if (!coUoc)
            System.out.print("\nSo " + n + " khong co uoc trong mang.");
    }
}
