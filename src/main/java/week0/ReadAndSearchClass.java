package week0;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.apache.logging.log4j.core.Logger;

public class ReadAndSearchClass {


    private Logger logger;

    public int findLongestSequence(String filePath) {
        return findLongestSequence(readFile(filePath));
    }

    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        File file = new File(filePath);

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextInt()) {
                numbers.add(sc.nextInt());
            }
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
        return numbers;
    }

    private int findLongestSequence(List<Integer> numbers) {
        return 0;
    }
}
