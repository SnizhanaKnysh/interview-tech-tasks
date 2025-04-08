package week1.day4.logicGates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LogicGates {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        Map<String, String> inputSignals = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String inputName = in.next();
            String inputSignal = in.next();
            inputSignals.put(inputName, inputSignal);
        }

        List<String[]> taskElements = new ArrayList<>(); //тут допомога куди зберігати taskElements

        for (int i = 0; i < m; i++) {
            String outputName = in.next();
            String type = in.next();
            String inputName1 = in.next();
            String inputName2 = in.next();
            taskElements.add(new String[]{outputName, type, inputName1, inputName2});
        }

        for (String[] taskElement : taskElements) {     //тут треба була допомога як пройти по списку масивів, не розуміла як це через for-loop
            StringBuilder result = new StringBuilder();
            String outputName = taskElement[0];
            String gateType = taskElement[1];
            String inputName1 = taskElement[2];
            String inputName2 = taskElement[3];

            String signal1 = inputSignals.get(inputName1); //тут допомога як дістатись до етапу порівняння 2 сигналів
            String signal2 = inputSignals.get(inputName2);

            for (int i = 0; i < signal1.length(); i++) { //create some way to avoid unneeded condition checks
                char s1 = signal1.charAt(i);
                char s2 = signal2.charAt(i);

                if (gateType.equals("AND")) {
                    if (s1 == '-' && s2 == '-') {
                        result.append('-');
                    } else {
                        result.append('_'); //does not complete the iteration
                    }
                }
                if (gateType.equals("OR")) {
                    if (s1 == '_' && s2 == '_') {
                        result.append('_');
                    } else {
                        result.append('-');
                    }
                }
                if (gateType.equals("XOR")) {
                    if ((s1 == '_' && s2 == '_') || (s1 == '-' && s2 == '-')) {
                        result.append('_');
                    } else {
                        result.append('-');
                    }
                }
                if (gateType.equals("NAND")) {
                    if (s1 == '-' && s2 == '-') {
                        result.append('_');
                    } else {
                        result.append('-');
                    }
                }
                if (gateType.equals("NOR")) {
                    if (s1 == '_' && s2 == '_') {
                        result.append('-');
                    } else {
                        result.append('_');
                    }
                }
                if (gateType.equals("NXOR")) {
                    if ((s1 == '_' && s2 == '_') || (s1 == '-' && s2 == '-')) {
                        result.append('-');
                    } else {
                        result.append('_');
                    }
                }
            }
            System.out.println(outputName + " " + result);
        }
    }

}
