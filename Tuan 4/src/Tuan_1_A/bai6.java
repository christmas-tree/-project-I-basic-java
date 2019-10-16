package Tuan_1_A;

public class bai6 {
//    public static void main(String[] args) {
//        System.out.println("Bài 06: In ra màn hình 5 số hoàn hảo đầu tiên (Số hoàn hảo là số có tổng bằng các ước số của mình kể cả 1");
//        int count = 0;
//        long i = 1L;
//
//        while (count < 5) {
//            i++;
//            long tongUoc = 1L;
//            long canBac2 = Math.round(Math.sqrt(i));
//            for (int j = 2; j <= canBac2; j++) {
//                if (i % j == 0) {
//                    tongUoc += j;
//                    if (j != i/j)
//                        tongUoc += i/j;         // Vi o day co lenh if nay nen j dau tien duoc dat bang 2. Neu j = 1 thi o cau if nay tongUoc += i.
//                }
//            }
//            if (tongUoc == i) {
//                count++;
//                System.out.print(i + " ");
//            }
//        }
//
//        System.out.println("\n\nTran Trung Nghia - 20173281");
//    }

    public static void main(String[] args) {
        System.out.println("Bài 06: In ra màn hình 5 số hoàn hảo đầu tiên (Số hoàn hảo là số có tổng bằng các ước số của mình kể cả 1");

        int count = 0;
        int p = 1;

        while (count < 5) {
            p++;
            boolean pLaSoNguyenTo = true;
            for (int j = 2; j <= p/2; j++) {
                if (p % j == 0) {
                    pLaSoNguyenTo = false;
                    break;
                }
            }
            if (pLaSoNguyenTo) {
                boolean duDieuKien = true;
                long m = (long) (Math.pow(2, p) - 1);
                for (long j = 2; j <= m/2; j++) {
                    if (m % j == 0) {
                        duDieuKien = false;
                        break;
                    }
                }
                if (duDieuKien) {
                    long n = (long) (Math.pow(2, p-1) * m);
                    System.out.print(n + " ");
                    count++;
                }
            }
        }

        System.out.println("\n\nTran Trung Nghia - 20173281");
    }
}
