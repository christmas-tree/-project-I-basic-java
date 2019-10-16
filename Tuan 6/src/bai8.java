import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bai8 {
    public static void main(String[] args) {
        System.out.println("Bài 08: Cho trước 2 xâu ký tự S1, S2. Hãy đếm xem xâu S1 xuất hiện trong S2 tại bao nhiêu vị trí.");
        String xauS1 = "java";
        String xauS2 = "I am learning java. Java is interesting. Java is hard, but java is fun.";

        Pattern p = Pattern.compile(xauS1, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(xauS2);

        int count = 0;
        while(m.find())
            count++;
        System.out.println("Xau con \"" + xauS1 + "\" xuat hien " + count + " lan trong xau \"" + xauS2 + "\".");
        System.out.println("\n\nTran Trung Nghia - 20173281");
    }
}