public class bai16 {
    public static void main(String[] args) {
        System.out.println("Bài 16: Cho trước 2 xâu S1, S2. Hãy xét xem xâu S1 có phải là xâu con của S2 nếu xóa bỏ vài kí tự của xâu S2 ta được xâu S1.");
        String xau1 = "Ten toi la Tran Trung Nghia - MSSV: 20173281.";
        String xau2 = "Toi la Nghia - MS 3281";
        System.out.println("Xau 1 la: " + xau1);
        System.out.println("Xau 2 la: " + xau2);

        boolean laXauCon = true;
        if (xau1.length() < xau2.length())
            laXauCon = false;
        else {
            int i = 0;
            for (int j = 0; j < xau2.length(); j++)
                if (i == xau1.length())
                    laXauCon = false;
                else
                    while (i < xau1.length() && xau2.charAt(j) != xau1.charAt(i))
                        i++;
        }
        if (laXauCon)
            System.out.println("Xau 2 la xau con cua xau 1.");
        else
            System.out.println("Xau 2 khong phai la xau con cua xau 1.");
        System.out.println("\nTran Trung Nghia - 20173281");
    }
}