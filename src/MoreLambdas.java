import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

import static java.util.stream.Collectors.joining;

public class MoreLambdas {
    static List<String> mList =Arrays.asList("kamaa","margot","john","jane","godi");

    static ToIntFunction<String> getLength(){
        return String::length;
    }

    public static void main(String[] args) {
        int sum = mList.stream()
                .mapToInt(getLength())
                .sum();
        System.out.println(sum);
        findLongestName();
        joinElements();
    }

    public static void findLongestName(){
        mList.stream()
                .reduce((name1,name2) -> name1.length() > name2.length() ? name1 : name2)
                .ifPresent(System.out::println);
    }

    public  static void joinElements(){
       String list =  mList.stream()
                .map(String::toUpperCase)
                .collect(joining(",         "));

        System.out.println(list);
    }
}


