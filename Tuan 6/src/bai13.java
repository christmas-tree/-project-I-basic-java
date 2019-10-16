public class bai13 {
    public static void main(String[] args) {
        System.out.println("Bài 13: Cho danh sách họ tên đầy đủ học sinh. Hãy đếm xem có bao nhiêu bạn có tên bắt đầu bằng chữ “H”.");
        String dsHocSinh[] = {"Le Viet Hoang", "Le Han", "Mai Dung Ly", "Tran Quoc Hoan", "Tran Nam An", "Tran Minh Khoa", "Tran Trung Nghia", "Le Bao An"};
        System.out.println("Danh sach hoc sinh:");
        for (int i = 0; i < dsHocSinh.length; i++) {
            System.out.println((i+1) + ". " + dsHocSinh[i]);
        }

        int count = 0;
        for (String hocSinh: dsHocSinh)
            if (chuBatDauCuaTen(hocSinh) == 'H')
                count++;
        System.out.println("Co " + count + " hoc sinh co ten bat dau bang chu \'H\'.");
        System.out.println("\nTran Trung Nghia - 20173281");
    }

    public static char chuBatDauCuaTen(String hoTenHS) {
        return hoTenHS.replaceAll("^(.*)( )(\\w+)$", "$3").charAt(0);
    }
}
