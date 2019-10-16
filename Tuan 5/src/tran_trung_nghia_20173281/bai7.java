package tran_trung_nghia_20173281;

public class bai7 {
    public static void main(String[] args) {
        System.out.println("Bài 07: Cho một dãy số tự nhiên, hãy tìm 1 số tự nhiên nhỏ nhất c không bằng bất cứ số nào trong dãy trên.");
        int arr[] = {1, 5, 2, 3, 2, 6, 2, 14, 7};

        System.out.println("Day so ban dau la: ");
        for (int e: arr)
            System.out.print(e + " ");

        int n = 1;
        boolean thoaMan;
        do {
            thoaMan = true;
            for (int i = 0; i < arr.length; i++)
                if (arr[i] == n) {
                    n++;
                    thoaMan = false;
                    break;
                }
        } while (!thoaMan);
        System.out.println("\nDap an: " + n);

        System.out.println("\n\nTran Trung Nghia - 20173281");
    }
}