package tran_trung_nghia_20173281;

public class bai4 {
    public static void main(String[] args) {
        System.out.println("Bài 04: Cho một dãy các số tự nhiên, tìm và in ra 1 giá trị max của dãy này và tất cả các chỉ số ứng với giá trị max này.");
        int arr[] = {621, 2, 612, 621, 15, 151, 621, 3};

        int max = arr[0];

        System.out.println("Day so ban dau: ");
        for (int ele: arr) {
            System.out.print(ele + " ");
            if (ele > max)
                max = ele;
        }
        System.out.println("\nSo lon nhat trong day la: " + max);
        System.out.print("Chi so trong day: ");
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (max == arr[i])
                System.out.print(i+ " ");
        }
        System.out.println("\n\nTran Trung Nghia - 20173281");
    }
}
