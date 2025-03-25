package week5;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        HogwartsStudent harry = new HogwartsStudent("Harry", "Gryffindor", 3);
        HogwartsStudent draco = new HogwartsStudent("Draco", "Slytherin", 3);
        HogwartsStudent hermione = new HogwartsStudent("Hermione", "Gryffindor", 3);

        System.out.println(harry.learnSpell("Expelliarmus"));
        System.out.println(draco.learnSpell("Avada kedavra"));
        System.out.println(hermione.learnSpell("Alohomora"));

        Spellbook spellbook = new Spellbook();
        spellbook.addSpell("Expelliarmus");
        spellbook.addSpell("Avada kedavra");
        spellbook.addSpell("Alohomora");

        System.out.println(spellbook.getSpellsByPrefix("A"));

        MagicClassroom classroom = new MagicClassroom();
        classroom.addStudent(harry);
        classroom.addStudent(draco);
        classroom.addStudent(hermione);

        System.out.println(classroom.findStudent("Harry").getName());

        WizardExam exam = new WizardExam(Arrays.asList("Expelliarmus", "Alohomora"));
        exam.evaluate(harry);

        Duel.start(harry, draco, "Expelliarmus");
        Duel.start(harry, draco, "Avada Kedavra");

    }
}
