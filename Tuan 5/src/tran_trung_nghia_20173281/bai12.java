package tran_trung_nghia_20173281;

public class bai12 {
    public static void main(String[] args) {
        System.out.println("Bài 12: Dãy số a[] được gọi là dãy con của b[] nếu từ b [] xóa đi 1 vài số sẽ thu được a[]. Cho trước 2 dãy số nguyên a[]; b[]. Hãy kiểm tra xem a[] có là dãy con của b[] hay không?.");
        int a[] = {1, 2, 5, 9, 0, 0, 12, 5, 0, 0, 12, 53, 65, 0, -12, 0, 0, 0, 3};
        int b[] = {1, 2, 9, 0, 12, 0, 0, 53, 65, -12, 0, 0, 3};

        System.out.print("\nDay so a: ");
        for (int e: a)
            System.out.print(e + " ");
        System.out.print("\nDay so b: ");
        for (int e: b)
            System.out.print(e + " ");

        if (b.length > a.length)
            System.out.println("\nDay b khong phai day con cua a.");
        else {
            int i = 0;
            boolean laDayCon = true;
            for (int e: b) {
                if (i == a.length)
                    laDayCon = false;
                else
                    while (i < a.length)
                        if (e == a[i++])
                            break;
            }
            if (!laDayCon)
                System.out.println("\nDay b khong phai day con cua a.");
            else
                System.out.println("\nDay b la day con cua a.");
        }

        System.out.println("\n\nTran Trung Nghia - 20173281");
    }
}
