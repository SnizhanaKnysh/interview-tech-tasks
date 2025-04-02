package week1.day3.ghostLegs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GhostLegs {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt();
        int H = in.nextInt();

        List<String> lines = new ArrayList<>();

        if (in.hasNextLine()) {
            in.nextLine();
        }
        for (int i = 0; i < H; i++) {
            String line = in.nextLine();
            lines.add(line);
        }
        String topLine = lines.get(0);
        String bottomLine = lines.get(lines.size() - 1);
        List<Integer> topPositions = new ArrayList<>();

        for (int i = 0; i < topLine.length(); i++) {
            char c = topLine.charAt(i);
            if (c != ' ') {
                topPositions.add(i);
            }
        }

        for (int i = 0; i < topPositions.size(); i++) {
            int verticalLinePosition = topPositions.get(i);
            int currentPosition = verticalLinePosition;

            for (int j = 1; j < lines.size() - 1; j++) {
                String line = lines.get(j);

                if (currentPosition - 1 >= 0 && line.charAt(currentPosition - 1) == '-') {
                    currentPosition = currentPosition - 3;
                } else if (currentPosition + 1 < line.length() && line.charAt(currentPosition + 1) == '-') {
                    currentPosition = currentPosition + 3;
                }
            }
            char topChar = topLine.charAt(verticalLinePosition);
            char bottomChar = bottomLine.charAt(currentPosition);

            System.out.println(topChar + "" + bottomChar);
        }


    }

}
