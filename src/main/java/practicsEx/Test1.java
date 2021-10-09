package practicsEx;

public class Test1 {
    public static void main(String[] args) {
        CountingRepeatedCharacters test = new CountingRepeatedCharacters();
        String s = "Pppppppprivet kak dela kak pogoda azaza";
        System.out.println(test.countDuplicateCharacters(s));

        firstNonRepeatedCharacter fnr = new firstNonRepeatedCharacter();
        System.out.println(firstNonRepeatedCharacter.firstNonRepeatedCharacterfunc(s));

    }
}
