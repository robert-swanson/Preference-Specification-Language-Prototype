package generation.classes;

import java.util.ArrayList;

public class EvaluatorGenerator {
    public static String courseNameIn(String courseName) {
        return String.format("evaluator.courseName('%s')", courseName);
    }

    public static String nCourseNamesIn(int n, ArrayList<String> courseNames) {
        return String.format("evaluator.nCourseNamesIn(%d, [%s])", n, arrayListToPython(courseNames));
    }

    public static String violatesLeftBeforeRight(String left, String right) {
        return String.format("evaluator.violatesLeftBeforeRight('%s', '%s')", left, right);
    }

    public static String totalCredits() {
        return "evaluator.totalCredits()";
    }

    private static String minsSinceMidnightToArmyTime(String minsSinceMidnight) {
        return String.format("ut.minsSinceMidnightToArmyTime(%s)", minsSinceMidnight);
    }

    public static String totalCreditGreaterThanEqualToCourseNumber(int courseNumber) {
        return String.format("evaluator.totalCreditsGreaterThanEqualToCourseNumber(%d)", courseNumber);
    }

    public static String averageStartTime() {
        return "evaluator.averageStartTime()";
    }




    private static String arrayListToPython(ArrayList<String> list) {
        StringBuilder rv = new StringBuilder();
        boolean first = true;
        for (String s: list) {
            if (!first) {
                rv.append(", ");
            }
            rv.append(String.format("'%s'", s));
            first = false;
        }
        return rv.toString();
    }


}
