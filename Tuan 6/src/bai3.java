public class bai3 {
    public static void main(String[] args) {
        System.out.println("Bài 03: Cho trước 1 xâu ký tự là họ tên người đầy đủ, hãy tách ra phần tên của người này");
        String hoTen = "Tran Trung Nghia";
        System.out.println("Ho va ten: " + hoTen);

        String[] tenThanhPhan = hoTen.split(" ");
        String ten = tenThanhPhan[tenThanhPhan.length - 1];

        System.out.println("Ten rieng la: " + ten);
        System.out.println("\n\nTran Trung Nghia - 20173281");
    }
}