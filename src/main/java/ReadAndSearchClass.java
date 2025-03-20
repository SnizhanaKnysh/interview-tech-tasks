import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.apache.logging.log4j.core.Logger;

public class ReadAndSearchClass {

    private final String filePath = "src/main/resources/file.txt";
    private List<Integer> numbers = new ArrayList<>();
    private Logger logger;

    public int findLongestSequence(String filePath) {
        return findLongestSequence(readFile(filePath));
    }

    private List<Integer> readFile(String filePath) {
        File file = new File(filePath);

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextInt()) {
                numbers.add(sc.nextInt());
            }
        } catch (IOException exception) {
            logger.error(exception);
        }
        return numbers;
    }

    private int findLongestSequence(List<Integer> numbers) {
        int maxlength = 1;
        int currentLength = 1;

        try {
            for (int i = 1; i < numbers.size(); i++) {
                if (numbers.get(i) > numbers.get(i - 1)) {
                    currentLength++;
                } else {
                    if (currentLength > maxlength) {
                        maxlength = currentLength;
                    }
                    currentLength = 1;
                }
            }
        } catch (Exception exception) {
            logger.error(exception);
        }

        return maxlength;

    }

}
