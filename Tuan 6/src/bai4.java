public class bai4 {
    public static void main(String[] args) {
        System.out.println("Bài 04: Cho trước 1 xâu ký tự là họ tên người đầy đủ, hãy tách ra phần họ của người này");
        String hoTen = "Tran Trung Nghia";
        System.out.println("Ho va ten: " + hoTen);

        String[] tenThanhPhan = hoTen.split(" ");
        String tenHo = tenThanhPhan[0];

        System.out.println("Ten ho la: " + tenHo);
        System.out.println("\n\nTran Trung Nghia - 20173281");
    }
}