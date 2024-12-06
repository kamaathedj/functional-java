public class Comparators {

    private static void printChar(int c) {
        System.out.print((char)c);
    }
    public static void main(String[] args) {
        final String str = "w00t";

        str.chars()
                .filter(Character::isDigit)
                .forEach(Comparators::printChar);
    }
}
