package tran_trung_nghia_20173281;

public class bai1 {
    public static void main(String[] args) {
        System.out.println("Bài 01: Cho một dãy số tự nhiên, viết chương trình sắp xếp dãy này theo thứ tự giảm dần.");

        int arr[] = {3, 1, 6, 12, 7, 124, 161, 7};

        System.out.println("Day so ban dau: ");
        inDaySo(arr);
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.println("Day so da sap xep: ");
        inDaySo(arr);
        System.out.println("\n\nTran Trung Nghia - 20173281");
    }

    public static void inDaySo(int[] arr) {
        for (int element: arr) {
            System.out.print(element + " ");
        }
        System.out.println("");
    }
}
