package interview_questions;

import java.util.List;

public class ACompanyProblem4 {

    String build(int t) {
        StringBuilder sb = new StringBuilder("0");
        for (int i = 0; i < 30000; i++) {

            StringBuilder sb2 = new StringBuilder("");
            for (int j = 0; j < sb.toString().length(); j++) {
                if (sb.toString().length() > (t + 1)) {
                    return sb.toString();
                }
                String s = String.valueOf(sb.toString().charAt(j));
                if (s.equals("0")) {
                    sb2.append("1");
                } else if (s.equals("1")) {
                    sb2.append("2");
                } else if (s.equals("2")) {
                    sb2.append("0");
                }
            }
            sb.append(sb2.toString());

        }
        return sb.toString();
    }
    //011212201220200112
    public void go(String n) {
        int input = Integer.valueOf(n);
        String sequence = build(input);
        String result = String.valueOf(sequence.charAt(input));
        System.out.println(result);
    }
}
