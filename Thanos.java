import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Thanos {

    public static void main(String[] args) {

        List<Hero> heroes = new ArrayList<>();
        heroes.add(new Hero("Hulk", 49));
        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Captain America", 100));
        heroes.add(new Hero("Thor", 1501));

        // TODO 1 : Modify Hero to implements Comparable and sort by name (ascending)

        Comparator<Hero> heroNameComparator = new Comparator<Hero>() {
            @Override
            public int compare(Hero hero1, Hero hero2) {
                return hero1.getName().compareTo(hero2.getName());
            }
        };

        System.out.println("\nOrder by name:");
        Collections.sort(heroes, heroNameComparator);
        showList(heroes);


        // TODO 2: Add a Comparator and sort by age (descending)


        System.out.println("\nOrder by age:");
        Collections.sort(heroes);
        showList(heroes);
    }

    private static void showList(List<Hero> heroes) {
        for (Hero heroe : heroes) {
            System.out.println(heroe.getName() + ", " + heroe.getAge());
        }
    }


}