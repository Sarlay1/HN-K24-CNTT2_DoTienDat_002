import java.util.*;

public class Cau1 {
        public static void main(String[] args) {

                List<String> hocBong = new ArrayList<>();

                hocBong.add("101");
                hocBong.add("102");
                hocBong.add("101");
                hocBong.add("104");
                hocBong.add("105");
                hocBong.add("103");
                hocBong.add("108");
                hocBong.add("105");

                List<String> khongTrung = new ArrayList<>();

                for (String ma : hocBong) {
                        if (!khongTrung.contains(ma)) {
                                khongTrung.add(ma);
                        }
                }

                Collections.sort(khongTrung);

                System.out.println("Danh sách học sinh điểm cao nhất: " + khongTrung);
                System.out.println("Số học sinh nhận học bổng: " + khongTrung.size());
        }
}