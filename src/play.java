import java.util.List;
import java.util.function.Predicate;

public class play {

    public static void main(String[] args) {
        var mlist = List.of(11,23,32,23,24,15,21);
        System.out.println(getEven(mlist,e->true));
        System.out.println(getEven(mlist,e->e%2==0));
        System.out.println(getEven(mlist,e->e%2!=0));

        combineBothOddAndEven();
    }


    private static int getEven(List<Integer> integers, Predicate<Integer> predicate) {
        int result = 0;
        for (Integer i : integers) {
            if (predicate.test(i)) {
                result+=i;
            }
        }
        return result;
    }

    private static void combineBothOddAndEven() {
        var mlist = List.of(11,23,32,23,24,15,21);
        Predicate<Integer> evenpredicate = a -> a% 2 == 0;
        Predicate<Integer> oddpredicate = a -> a% 2 != 0;
        Predicate<Integer> predicate = evenpredicate.or(oddpredicate);

        mlist.stream().filter(predicate).reduce(Integer::sum).ifPresent(System.out::println);
    }
}
