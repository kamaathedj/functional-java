import java.util.List;

public class AnyMatchHOD {

    public static void main(String[] args) {
        Person kamaa = new Person("kamaa",31, List.of("kamaudavi1kiruku@gmail.com","kamaudavi@outlook.com"));
        Person njoroge = new Person("njoroge",31, List.of("njoro@gmail.com","peternj@outlook.com","pj@gmail.com"));
        Person godi = new Person("godi",31, List.of("godi@gmail.com"));

        List<Person> people = List.of(kamaa, njoroge, godi);

        var p2 = people.stream()
                .anyMatch(p -> p.emails().size()>=10);

        System.out.println("has anyone got 10 and  more email addresses " + p2);


    }
}
