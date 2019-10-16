package tran_trung_nghia_20173281;

public class bai5 {
    public static void main(String[] args) {
        int arr[] = {4, 2, 64, 16, 72, 191, 117, 19};
        System.out.print("Day so ban dau: ");
        for (int ele: arr)
            System.out.print(ele + " ");

        System.out.print("\n\nCac hop so trong day la: ");
        for (int ele: arr)
            if (laHopSo(ele))
                System.out.print(ele + " ");
        System.out.println("\n\nTran Trung Nghia - 20173281");
    }

    public static boolean laHopSo(int n) {
        for (int j = 2; j <= n / 2; j++)
            if (n % j == 0)
                return true;
        return false;
    }
}