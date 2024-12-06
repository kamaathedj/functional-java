import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FlatMapping {

    static Function<Person,Stream<String>> getEmails =  person -> person.emails().stream();
    public static void main(String[] args) {
        Person kamaa = new Person("kamaa",31, List.of("kamaudavikiruku@gmail.com","kamaudavi@outlook.com"));
        Person njoroge = new Person("njoroge",31, List.of("njoro@gmail.com","peternj@outlook.com","pj@gmail.com"));
        Person godi = new Person("godi",31, List.of("godi@gmail.com"));

        List<Person> people = List.of(kamaa, njoroge, godi);
        var pips = people.stream()
//                .flatMap(p ->p.emails().stream())
                .flatMap(getEmails)
                .toList();

        System.out.println(pips);
    }
}
