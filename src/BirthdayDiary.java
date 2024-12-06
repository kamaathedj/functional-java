import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class BirthdayDiary {
    private Map<String, LocalDate> birthdays;

    public BirthdayDiary() {
        birthdays = new HashMap<>();
    }

    public void addBirthday(String name, int year, int month, int day) {
        LocalDate birthday = LocalDate.of(year, month, day);
        birthdays.put(name, birthday);
    }

    public LocalDate getBirthdayFor(String name) {
        return birthdays.get(name);
    }
    public int getAgeInYears(String name,int year) {
        Period period = Period.between(birthdays.get(name),birthdays.get(name).withYear(year));
        return period.getYears();
    }
    public int getAgeInDays(String name) {
        Period period = Period.between(birthdays.get(name),LocalDate.now());
        return period.getDays() ;
    }

    public int getDayUntilBirthday(String name) {
        LocalDate birthday = birthdays.get(name);
        Period period = Period.between(LocalDate.now(),birthday);
        return period.getDays();
    }

    public boolean findIfBornLeapYear(String name, Predicate<Integer> leap) {
        int year = birthdays.get(name).getYear();
        return leap.test(year);
    }

    public static void main(String[] args) {
        BirthdayDiary birthdayDiary = new BirthdayDiary();
        birthdayDiary.addBirthday("kamaa",1993,3,23);
        System.out.println(birthdayDiary.getBirthdayFor("kamaa"));
        System.out.println(birthdayDiary.findIfBornLeapYear("kamaa",a->a%4==0));
        System.out.println(birthdayDiary.getDayUntilBirthday("kamaa"));
        System.out.println(birthdayDiary.getAgeInDays("kamaa"));
    }
}
