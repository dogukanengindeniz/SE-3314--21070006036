package week4;

public class Main {
    public static void main(String[] args) {

        Mentor gandalf = new Mentor("Gandalf", "The Grey");

        Quest ringQuest = new Quest("Destroy the One Ring", "Very Hard");
        Quest helmDeep = new Quest("Defend Helm's Deep", "Hard");

        gandalf.overseeQuest(ringQuest);
        gandalf.overseeQuest(helmDeep);

        Advanturer frodo = new Advanturer("Frodo Baggins", "Ring Bearer", "Hobbit");
        Advanturer aragorn = new Advanturer("Aragorn", "King of Gondor", "Man");
        Advanturer legolas = new Advanturer("Legolas", "Prince of Mirkwood", "Elf");
        Advanturer gimli = new Advanturer("Gimli", "Son of Gloin", "Dwarf");

        frodo.joinQuest(ringQuest);
        aragorn.joinQuest(helmDeep);
        legolas.joinQuest(helmDeep);
        gimli.joinQuest(helmDeep);

        System.out.println("week4.Quest: " + ringQuest.getName());
        System.out.println("week4.Mentor: " + ringQuest.getMentor().getName());
        System.out.println("Advanturers: ");
        for (Advanturer a : ringQuest.getAdvanturers()){
            System.out.println("- " + a.getName());
        }

        System.out.println("\nweek4.Quest: " + helmDeep.getName());
        System.out.println("week4.Mentor: " + helmDeep.getMentor().getName());
        System.out.println("Advanturers: ");
        for (Advanturer a : helmDeep.getAdvanturers()){
            System.out.println("- " + a.getName());
        }
    }
}
