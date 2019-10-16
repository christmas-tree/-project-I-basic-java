package tran_trung_nghia_20173281;

public class bai9 {
    public static void main(String[] args) {
        System.out.println("Bài 09: Cho một dãy số nguyên bất kỳ, cho trước 1 số c. Hãy đếm có bao nhiêu số của dãy trên =c; >c; <c.");
        int arr[] = {31, 0, 12, 5, 0, 12, 53, 65, 0, -12, 0, 0, 0, 3};
        int c = 5;

        System.out.println("Day so ban dau la: ");
        int lonHon = 0, nhoHon = 0, bang = 0;
        for (int e: arr) {
            System.out.print(e + " ");
            if (e > c)
                lonHon++;
            else if (e < c)
                nhoHon++;
            else
                bang++;
        }
        System.out.println("\nc = " + c);
        System.out.println("\nCo " + nhoHon + " so nho hon c, " + lonHon + " so lon hon c va " + bang + " so bang c.");

        System.out.println("\n\nTran Trung Nghia - 20173281");
    }
}
