public class bai1 {
    public static void main(String[] args) {
        System.out.println("Bài 01: Cho trước 1 xâu ký tự là họ tên người đầy đủ nhưng khi nhập có thể thừa một số dấu cách. Hãy xóa đi các dấu cách thừa và in ra họ tên chính xác.");
        String ten = "    Tran   Trung Nghia    ";
        System.out.println("Xau ban dau:\n" + ten);

        ten = ten.trim().replaceAll("\\s+", " ");
        System.out.println("\nXau da chinh sua:\n" + ten);
        System.out.println("\n\nTran Trung Nghia - 20173281");
    }
}