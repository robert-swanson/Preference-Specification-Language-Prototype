package generation.methods;

import generation.PythonGenerator;

public class ScorePlanGenerator extends MethodGenerator {

    public ScorePlanGenerator() {
        super("scorePlan");
        addLine("scorer = Scorer()");
        addLine("scorer.enableDiagnostics()");
        newLine();
    }

    @Override
    protected void endMethod() {
        newLine();
        addLine("print()");
        addLine("print(\"---------------------\")");
        addLine("print(\"Final Score: {:.0f}%\".format(scorer.getScore()))");
        addLine("print(\"---------------------\")");
        addLine("print()");
        super.endMethod();
    }
}
