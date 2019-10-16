package tran_trung_nghia_20173281;

public class bai10 {

    public static void main(String[] args) {
        System.out.println("Bài 10: Cho một dãy số nguyên bất kỳ, hãy tìm ra 1 một dãy số liền nhau dài nhất bao gồm các số bằng nhau. Hãy in ra số lượng và các chỉ số đầu tiên của dãy con này.");
        int arr[] = {0, 0, 0, 0, 0, 0, 12, 5, 0, 0, 12, 53, 65, 0, -12, 0, 0, 0, 3};
        System.out.println("Day so ban dau la: ");
        for (int e: arr)
            System.out.print(e + " ");
        int seqstart = 0, seqend = 0, seqlen = 1, maxlen = 1, startmax = 0;
        while (seqend != arr.length - 1) {
            if (arr[seqend] == arr[seqend+1]) {
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
        if (maxlen > 1) {
            System.out.println("\nDo dai cua day con lien nhau bang nhau la: " + maxlen + ", chi so bat dau: " + startmax + ", chi so ket thuc: " + (startmax+maxlen-1));
        } else {
            System.out.println("\nDay khong co so nao giong nhau.");
        }
        System.out.println("\nTran Trung Nghia - 20173281");
    }
}
