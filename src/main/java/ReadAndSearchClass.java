import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndSearchClass {

    private final String filePath = "src/main/resources/file.txt";
    List<Integer> list = new ArrayList<>();

    public int readFilePrintLongestSeq() {
        File file = new File(filePath);

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextInt()) {
                list.add(sc.nextInt());
            }
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
        return searchLongestSequence(list);
    }

    private int searchLongestSequence(List<Integer> list) {
        int maxlength = 1;
        int currentLength = 1;

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > list.get(i - 1)) {
                currentLength++;
            } else {
                if (currentLength > maxlength) {
                    maxlength = currentLength;
                }
                currentLength = 1;
            }

        }
        return maxlength;

    }

}
