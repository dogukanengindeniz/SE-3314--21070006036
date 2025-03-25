package week5;

import java.util.List;

public class WizardExam {
    private List<String> requiredSpells;

    public WizardExam(List<String> requiredSpells){
        this.requiredSpells = requiredSpells;
    }

    public boolean pass(HogwartsStudent student){
        return requiredSpells.stream().allMatch(student ::knowsSpell);
    }

    public void evaluate(HogwartsStudent student){
        System.out.println(student.getName() + (pass(student) ? "Passed from the exam." : "Failed from the exam."));
    }
}
