public class bai10 {
    public static void main(String[] args) {
        System.out.println("Bài 10: Cho mảng xâu ký tự S1, S2, ..., Sn. Hãy tìm và in ra phần tử xâu có độ dài lớn nhất.");
        String mangXau[] = {"Day la xau hoi dai.", "Day la xau vo cung vo cung dai", "Xau ngan", "Xau hoi dai teo"};

        System.out.println("Cac xau trong mang la: ");
        for (int i = 0; i < mangXau.length; i++) {
            System.out.println((i+1) + ". " + mangXau[i]);
        }
        int maxLength = mangXau[0].length(), maxIndex = 0;
        for (int i = 0; i < mangXau.length; i++) {
            if (mangXau[i].length() > maxLength) {
                maxLength = mangXau[i].length();
                maxIndex = i;
            }
        }
        System.out.println("\nXau lon nhat trong mang la xau thu " + (maxIndex+1) + ": " + mangXau[maxIndex]);
        System.out.println("\nTran Trung Nghia - 20173281");
    }
}