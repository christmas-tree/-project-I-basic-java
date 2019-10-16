public class bai14 {
    public static void main(String[] args) {
        System.out.println("Bài 14: Dãy xâu ký tự S1, S2, … được cho theo quy tắc sau: S1= “1111100000”, Sk thu được từ Sk-1 bằng cách thay đổi cho lần lượt các vị trí 1-2; 2-3; 3-4; 4-5; 5-6; 6-7; 7-8; 8-9; 9-10. Cho trước số tự nhiên N, Hãy in ra xâu Sn.");
        String xauS1 = "1111100000";
        int n = 3;
        System.out.println("Xau S1: \'" + xauS1 + "\'");
        System.out.println("Xau S" + n + ": \'" + S(xauS1, n) + "\'");
        System.out.println("\n\nTran Trung Nghia - 20173281");
    }
    public static String S(String S1, int n) {
        if (n == 1)
            return S1;
        else {
            String Sn_1 = S(S1, n-1);
            return Sn_1.substring(1, 10) + Sn_1.charAt(0);
        }
    }
}