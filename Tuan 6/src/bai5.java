
public class bai5 {
    public static void main(String[] args) {
        System.out.println("Bài 05: Cho một xâu ký tự bao gồm toàn các ký tự 0,1. Hãy biến đổi xâu này theo cách 0\uF0E01, 1\uF0E00 và in ra kết quả.");
        String zeroesAndOnes = "11010101001010100011010101111001011";
        System.out.println("Xau ban dau:\t\t" + zeroesAndOnes);

        String onesAndZeroes = "";

        for (int i = 0; i < zeroesAndOnes.length(); i++)
            if (zeroesAndOnes.charAt(i) == '1')
                onesAndZeroes += "0";
            else
                onesAndZeroes += "1";
        System.out.println("Xau da bien doi:\t" + onesAndZeroes);

        System.out.println("\n\nTran Trung Nghia - 20173281");
    }
}