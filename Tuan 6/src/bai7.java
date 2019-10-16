public class bai7 {
    public static void main(String[] args) {
        System.out.println("Bài 07: Cho trước xâu ký tự S. Hãy biến đổi S theo quy tắc sau: Chữ số thì biến thành “$”, ký tự thì giữ nguyên.");
        String xau = "My 1st phone number is 037.444.2611. My 2nd phone number is 0000000.";
        System.out.println("Xau goc:\t\t" + xau);

        String xauDaBienDoi = xau.replaceAll("\\d", "\\$");

        System.out.println("Xau bien doi:\t" + xauDaBienDoi);

        System.out.println("\n\nTran Trung Nghia - 20173281");
    }
}