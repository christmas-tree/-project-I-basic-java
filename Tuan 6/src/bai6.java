public class bai6 {
    public static void main(String[] args) {
        System.out.println("Bài 06: Cho trước xâu ký tự S, in ra xâu S1 ngược lại xâu S.");
        String xauBanDau = "ASantaLivedAsaDevilAtNASA";
        System.out.println("Xau ban dau:\t\t" + xauBanDau);

        String xauLonNguoc = "";

        for (int i = (xauBanDau.length()-1); i >= 0; i--)
            xauLonNguoc += xauBanDau.charAt(i);
        System.out.println("Xau da lon nguoc:\t" + xauLonNguoc);

        System.out.println("\n\nTran Trung Nghia - 20173281");
    }
}