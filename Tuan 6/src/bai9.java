public class bai9 {
    public static void main(String[] args) {
        System.out.println("Bài 09: Cho xâu S và 2 chỉ số i, j. Hãy đổi chỗ 2 vị trí i, j trong S.");
        String xau = "Day la xau mau.";
        int i = 13, j = 2;

        if (i > xau.length() || j > xau.length() || i < 0 || j < 0)
            System.out.println("i/j khong hop le.");
        else {
            if (i > j) {
                int temp = i;
                i = j;
                j = temp;
            }
            System.out.println("Xau ban dau: " + xau);
            String xauKetQua = xau.substring(0, i) + xau.charAt(j) + xau.substring(i + 1, j) + xau.charAt(i) + xau.substring(j + 1);
            System.out.println("Xau moi la: " + xauKetQua);
            System.out.println("\n\nTran Trung Nghia - 20173281");
        }
    }
}