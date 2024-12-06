import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortComparator {

    static Comparator<Integer> comparator = (a, b) -> a - b;
    static Comparator<Integer> reversed = comparator.reversed();
    static List<Integer> mlist = Arrays.asList(
            23,2,12,76,84,24,67
    );

    public static void main(String[] args) {
        List<Integer> list = mlist.stream().sorted(comparator).toList();
        System.out.println(list);

        List<Integer> rlist = mlist.stream().sorted(reversed).toList();
        System.out.println(rlist);
    }
}
