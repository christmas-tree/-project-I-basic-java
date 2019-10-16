public class bai11 {
    public static void main(String[] args) {
        System.out.println("Bài 11: Cho danh sách họ tên đầy đủ học sinh. Hãy đếm xem có bao nhiêu bạn tên “An”.");
        String dsHocSinh[] = {"Nguyen Thanh An", "Le An", "Mai Dung Ly", "Tran Quoc Hoan", "Tran Nam An", "Tran Minh Khoa", "Tran Trung Nghia", "Le Bao An"};
        System.out.println("Danh sach hoc sinh:");
        for (int i = 0; i < dsHocSinh.length; i++) {
            System.out.println((i+1) + ". " + dsHocSinh[i]);
        }

        int count = 0;
        for (String hocSinh: dsHocSinh)
            if (ten(hocSinh).equals("An"))
                count++;
        System.out.println("Co " + count + " hoc sinh ten la An.");
        System.out.println("\nTran Trung Nghia - 20173281");
    }
    public static String ten(String hoTenHS) {
        return hoTenHS.replaceAll("^(.*)( )(\\w+)$", "$3");
    }
}