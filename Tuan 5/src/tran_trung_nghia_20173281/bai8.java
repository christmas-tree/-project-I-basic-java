package tran_trung_nghia_20173281;

import java.util.Arrays;

public class bai8 {
    public static void main(String[] args) {
        System.out.println("Bài 08: Cho một dãy số nguyên bất kỳ, hãy xóa đi trong dãy này các số hạng =0 và in ra màn hình các số còn lại.\n");

        int arr[] = {0, 0, 0, 0, 1, 0, 2, 0, 3, 4, 0, 0, 0};
        System.out.println("Mang ban dau: "); inMang(arr);
        int newArrLength = arr.length;

        for (int i = 0; i <= newArrLength; i++) {
            while (arr[i] == 0 && i < newArrLength) {
                newArrLength--;
                for (int j = i; j < newArrLength; j++)
                    arr[j] = arr[j + 1];
            }
        }

        arr = Arrays.copyOfRange(arr, 0, newArrLength);

        System.out.println("\nMang sau khi da bo cac phan tu 0: "); inMang(arr);
        System.out.println("\n\nTran Trung Nghia - 20173281");
    }

    public static void inMang(int arr[]) {
        for (int e: arr) {
            System.out.print(e + " ");
        }
    }
}