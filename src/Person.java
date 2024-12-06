import java.util.List;
import java.util.Objects;

public record Person(String name, int age, List<String> emails) {

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", emails=" + emails +
                '}';
    }
}
