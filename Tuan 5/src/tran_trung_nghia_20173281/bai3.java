package tran_trung_nghia_20173281;

import java.sql.SQLOutput;

public class bai3 {
    public static void main(String[] args) {
        System.out.println("Bài 03: Cho một dãy các số tự nhiên, tìm và in ra 1 giá trị min của dãy này và tất cả các chỉ số ứng với giá trị min này.");
        int arr[] = {4, 125, 6, 2, 6, 4, 2, 2, 6, 2};

        int min = arr[0];

        System.out.println("Day so ban dau: ");
        for (int ele: arr) {
            System.out.print(ele + " ");
            if (ele < min)
                min = ele;
        }
        System.out.println("\nSo nho nhat trong day la: " + min);
        System.out.print("Chi so trong day: ");
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (min == arr[i])
                System.out.print(i+ " ");
        }
        System.out.println("\n\nTran Trung Nghia - 20173281");
    }
}
