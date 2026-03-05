import java.util.*;

public class Cau2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập văn bản:");
        String input = sc.nextLine();

        input = input.replace(".", "").replace(",", "");

        String[] words = input.split("\\s+");

        Map<Integer, Set<String>> map = new TreeMap<>();

        for (String word : words) {
            int length = word.length();

            map.putIfAbsent(length, new HashSet<>());
            map.get(length).add(word);
        }

        for (Map.Entry<Integer, Set<String>> entry : map.entrySet()) {
            System.out.println("Độ dài " + entry.getKey() + ": " + entry.getValue());
        }
    }
}