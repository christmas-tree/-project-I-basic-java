public class bai15 {
    public static void main(String[] args) {
        System.out.println("Bài 15: Cho trước 2 xâu ký tự S, S2. Hãy chèn xâu S1 vào giữa xâu S2 và in kết quả.");
        String xau1 = "Toi ten la Nghia.";
        String xau2 = "Tran Trung ";
        int viTriChen = 11;
        System.out.println("\nXau 1 la: \"" + xau1 + "\", xau 2 la: \"" + xau2 + "\", chen vao vi tri thu " + viTriChen + ".");

        String xauMoi = xau1.substring(0, viTriChen) + xau2 + xau1.substring(viTriChen);
        System.out.println("Xau moi la: " + xauMoi);
        System.out.println("\nTran Trung Nghia - 20173281");
    }
}
   //Chua xong