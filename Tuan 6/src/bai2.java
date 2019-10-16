import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bai2 {
    public static void main(String[] args) {
        System.out.println("Bài 02: Cho trước xâu ký tự bất kỳ. Hãy đếm xem trong xâu có bao nhiêu lần xuất hiện xâu con “abc”");
        String xau = "My name, abc, is not abcde. I amabcde.";

        int count = 0;

        Pattern xauCon = Pattern.compile("abc");
        Matcher input = xauCon.matcher(xau);

        while (input.find())
            count++;

        System.out.println("Xau con \"abc\" xuat hien " + count + " trong xau ban dau: \"" + xau + "\"");
        System.out.println("\n\nTran Trung Nghia - 20173281");
    }
}