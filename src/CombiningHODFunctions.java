import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.averagingDouble;
import static java.util.stream.Collectors.summarizingDouble;

public class CombiningHODFunctions {
    static List<String> mList = Arrays.asList("kamaa","margot","john","jane","godi");

    public static void main(String[] args) {
        var av = mList.stream()
                .mapToDouble(String::length)
                .average()
                .orElse(0);

        var av2 = mList.stream()
                        .collect(averagingDouble(String::length));

        var sumar = mList.stream()
                        .collect(summarizingDouble(String::length));



        System.out.println("get  average " + sumar.getAverage());
        System.out.println("get  min " + sumar.getMin());
        System.out.println("get  max " + sumar.getMax());
        System.out.println("get  sum " + sumar.getSum());
        System.out.println("get  count " + sumar.getCount());


    }
}
