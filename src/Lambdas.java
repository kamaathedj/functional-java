import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lambdas {

     static List<String> mList = List.of("kamaa","margot","john","jane","godi");

    static Consumer<String> consumer = System.out::println;
    static Function<String,String> function2 = String::toUpperCase;
    static Function<String,String> function3 = function2.andThen(String::toLowerCase);

    static final Function<String,Predicate<String>> starts=
            letter->name -> name.startsWith(letter);

    public static void main(String[] args) {
        mList.stream()
                .filter(starts.apply("k"))
                .map(function3)
                .forEach(consumer);
        pickFirstLetter();
    }

    public static void pickFirstLetter(){
        mList.stream().filter(starts.apply("x")).findFirst().ifPresent(consumer);
    }
}
