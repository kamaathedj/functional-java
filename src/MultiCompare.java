import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;


public class MultiCompare {
    public static void main(String[] args) {
        Person p  = new Person("kamaa",31, List.of(""));
        Person p2  = new Person("garvin",32,List.of(""));
        Person z  = new Person("godi",30,List.of(""));
        Person r  = new Person("rage",25,List.of(""));
        Person m  = new Person("mark",25,List.of(""));
        Person n  = new Person("mary",25,List.of(""));

        final Function<Person, Integer>byAge = Person::age;
        final Function<Person, String>byName = Person::name;

        var mlist = Arrays.asList(p,z,r,p2,m,n);

        var mMap  = mlist.stream()
                .sorted(Comparator.comparing(byAge).thenComparing(byName))
                .collect(Collectors.groupingBy(Person::age,mapping(Person::name,toList())));

//        System.out.println(mMap);

        var first =  mlist.stream()
                .collect(groupingBy(ps->ps.name().charAt(0),reducing(BinaryOperator.maxBy(Comparator.comparing(Person::age)))));
        System.out.println(first);

        play();

    }

    public static void add(){
        var arr = new int[]{1,2,3,4,5,6,7,8,9,10};

        Arrays.stream(arr).reduce(Integer::sum).ifPresent(System.out::println);

    }

    public static void play(){
        var arr = new String[]{"kamaa","garvin","godi","rage"};

        var b = (Integer) Arrays.stream(arr).mapToInt(String::length).sum();
        System.out.println(b);
    }

}
