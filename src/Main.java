import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        String input = "hello world  david";

        //var characters = name.split("");

        String reversed = input.chars()
                .mapToObj(c->(char)c)
                .collect(Collectors.collectingAndThen(Collectors.toList(),list->{
                    java.util.Collections.reverse(list);
                    return list.stream();
                }))
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println("Reversed string: " + reversed);


    }

}