package tran_trung_nghia_20173281;

public class bai11 {
    public static void main(String[] args) {
        System.out.println("Bài 11: Cho một dãy số nguyên bất kỳ. Hãy tìm 1 một dãy con liên tục đơn điệu tăng dài nhất của dãy trên.");

//        int arr[] = {1, 2, 5, 9, 0, 0, 12, 5, 0, 0, 12, 53, 65, 0, -12, 0, 0, 0, 3};
        int arr[] = {3, 3, 3, 3, 3, 3};
        System.out.println("Day so ban dau la: ");
        for (int e: arr)
            System.out.print(e + " ");
        int seqstart = 0, seqend = 0, seqlen = 1, maxlen = 1, startmax = 0;
        while (seqend != arr.length - 1) {
            if (arr[seqend] < arr[seqend+1]) {
                seqlen++;
                if (seqlen > maxlen) {
                    maxlen = seqlen;
                    startmax = seqstart;
                }
                seqend++;
            } else {
                seqlen = 1;
                seqstart = ++seqend;
            }
        }
        if (maxlen > 1)
            System.out.println("\nDo dai cua day con don dieu tang dan la: " + maxlen + ", chi so bat dau: " + startmax + ", chi so ket thuc: " + (startmax+maxlen-1));
        else
            System.out.println("\nKhong co day con don dieu tang dan.");
        System.out.println("\nTran Trung Nghia - 20173281");
    }
}