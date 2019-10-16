public class bai12 {
    public static void main(String[] args) {
        System.out.println("Bài 12: Cho danh sách họ tên đầy đủ học sinh. Hãy đếm xem có bao nhiêu bạn có phần đệm là “Thị”.");
        String dsHocSinh[] = {"Le Viet Hoang", "Le Thi Han", "Mai Thi Dung Ly", "Tran Quoc Hoan", "Tran Thi An", "Tran Trung Nghia", "Le Bao Thi"};
        System.out.println("Danh sach hoc sinh:");
        for (int i = 0; i < dsHocSinh.length; i++) {
            System.out.println((i+1) + ". " + dsHocSinh[i]);
        }

        int count = 0;
        for (String hocSinh: dsHocSinh)
            if (tenCoChuThi(hocSinh))
                count++;
        System.out.println("Co " + count + " hoc sinh co ten dem la \'Thi\'.");
        System.out.println("\nTran Trung Nghia - 20173281");
    }

    public static boolean tenCoChuThi(String hoTen) {
        return hoTen.matches(".* Thi .*");
    }
}