package practicsEx;

public class Test1 {
    public static void main(String[] args) {
        CountingRepeatedCharacters test = new CountingRepeatedCharacters();
        String s = "Privet kak dela kak pogoda azaza";
        System.out.println(test.countDuplicateCharacters(s));

        firstNonRepeatedCharacter fnr = new firstNonRepeatedCharacter();
        System.out.println(fnr.firstNonRepeatedCharacterfunc(s));

    }
}
