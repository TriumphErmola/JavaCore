package MasterClass.Debug;

public class StringUtilities {
    private StringBuilder stringBuilder = new StringBuilder();
    private int charAdd = 0;

    public void addChar(StringBuilder stringBuilder, char c) {
        stringBuilder.append(c);
        charAdd++;

    }

    public String upperAndPrefix(String str) {
        String upper = str.toUpperCase();
        return "Prefix_" + upper;
    }

    public String addSuffix(String str) {
        return str + "_suffix";
    }

}
