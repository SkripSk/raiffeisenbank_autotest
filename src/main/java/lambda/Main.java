package lambda;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {


    interface PersonFactory<P extends Person>{
        P create(String firstName, String lastName);
    }

    public static void main(String[] args) {
        PersonFactory<Person> personPersonFactory = Person::new;
        Person pers = personPersonFactory.create("Name", "Fam");
        System.out.println(pers.firstName + " " + pers.lastName);

        List<Person> personList = new ArrayList<>();
        personList.add(personPersonFactory.create("1","A"));
        personList.add(personPersonFactory.create("2","B"));
        personList.add(personPersonFactory.create("3","C"));
        personList.add(personPersonFactory.create("4","D"));

        Map<String, String> mp = personList.stream().collect(Collectors.toMap(Person::getFirstName,
                                                                              Person::getLastName));


        /*List<String> strings = new ArrayList<>();
        strings.add("q1");
        strings.add("q2243");
        strings.add("q234");
        strings.add("q354345");
        strings.add("q2344");
        strings.add("qet");
        strings.add("q465");
        strings.add("qgfdd");
        strings.add("qdfhh");
        strings.add("qdd");
        strings.add("q2");

        strings.stream().filter(s -> s.contains("q2")).forEach(System.out::println);*/

    }
}
