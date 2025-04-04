package week1.day3.rockPaperScissors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<Participant> participants = new ArrayList<>();
        Map<Integer, List<Integer>> fightingWith = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int NUMPLAYER = in.nextInt();
            String SIGNPLAYER = in.next();
            participants.add(new Participant(NUMPLAYER, SIGNPLAYER));
            fightingWith.put(NUMPLAYER, new ArrayList<>());
        }

        List<Participant> currentRoundWinners = participants;
        while (currentRoundWinners.size() > 1) {
            List<Participant> nextRoundWinners = new ArrayList<>();

            for (int i = 0; i < currentRoundWinners.size(); i += 2) {
                Participant currentRoundWinner = getWinner(currentRoundWinners.get(i), currentRoundWinners.get(i + 1));
                Participant currentRoundLoser =
                    currentRoundWinner == currentRoundWinners.get(i) ? currentRoundWinners.get(i + 1)
                        : currentRoundWinners.get(i);

                nextRoundWinners.add(currentRoundWinner);
                fightingWith.get(currentRoundWinner.number()).add(currentRoundLoser.number());

            }
            currentRoundWinners = nextRoundWinners;
        }

        Participant winner = currentRoundWinners.get(0);
        System.out.println(winner.number());

        List<Integer> opponents = fightingWith.get(winner.number());
        for (int i = 0; i < opponents.size(); i++) {
            System.out.print(opponents.get(i));
            if (i < opponents.size() - 1) {
                System.out.print(" ");
            }
        }

       // String.join(" ", opponents);


    }


    static Participant getWinner(Participant participant1, Participant participant2) {
        if (participant1.letter().equals("C") && participant2.letter().equals("P")) {
            return participant1;
        }
        if (participant1.letter().equals("P") && participant2.letter().equals("C")) {
            return participant2;
        }
        if (participant1.letter().equals("P") && participant2.letter().equals("R")) {
            return participant1;
        }
        if (participant1.letter().equals("R") && participant2.letter().equals("P")) {
            return participant2;
        }
        if (participant1.letter().equals("R") && participant2.letter().equals("L")) {
            return participant1;
        }
        if (participant1.letter().equals("L") && participant2.letter().equals("R")) {
            return participant2;
        }
        if (participant1.letter().equals("L") && participant2.letter().equals("S")) {
            return participant1;
        }
        if (participant1.letter().equals("S") && participant2.letter().equals("L")) {
            return participant2;
        }
        if (participant1.letter().equals("S") && participant2.letter().equals("C")) {
            return participant1;
        }
        if (participant1.letter().equals("C") && participant2.letter().equals("S")) {
            return participant2;
        }
        if (participant1.letter().equals("C") && participant2.letter().equals("L")) {
            return participant1;
        }
        if (participant1.letter().equals("L") && participant2.letter().equals("C")) {
            return participant2;
        }
        if (participant1.letter().equals("L") && participant2.letter().equals("P")) {
            return participant1;
        }
        if (participant1.letter().equals("P") && participant2.letter().equals("L")) {
            return participant2;
        }
        if (participant1.letter().equals("P") && participant2.letter().equals("S")) {
            return participant1;
        }
        if (participant1.letter().equals("S") && participant2.letter().equals("P")) {
            return participant2;
        }
        if (participant1.letter().equals("S") && participant2.letter().equals("R")) {
            return participant1;
        }
        if (participant1.letter().equals("R") && participant2.letter().equals("S")) {
            return participant2;
        }
        if (participant1.letter().equals("R") && participant2.letter().equals("C")) {
            return participant1;
        }
        if (participant1.letter().equals("C") && participant2.letter().equals("R")) {
            return participant2;
        }

        if (participant1.number() < participant2.number()) {
            return participant1;
        } else {
            return participant2;
        }
    }

    record Participant(
        int number,
        String letter) {

    }

}
