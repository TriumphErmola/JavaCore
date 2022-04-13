package MasterClass.FirstSteps;

public class PrimitiveTypes1 {
    public static void main(String[] args) {

        float myFloatMinValue = Float.MIN_VALUE;
        float myFloatMaxValue = Float.MAX_VALUE;
        System.out.println("minValue" + myFloatMinValue);
        System.out.println("maxValue" + myFloatMaxValue);
        System.out.println("==========================");

        double myDoubleMinValue = Double.MIN_VALUE;
        double myDoubleMaxValue = Double.MAX_VALUE;
        System.out.println("minValue" + myDoubleMinValue);
        System.out.println("maxValue" + myDoubleMaxValue);
        System.out.println("==========================");

        int myIntValue = 5/3;
        int myIntValue1 = 5%3;
        float myFloatValue = 5f/3;
        double myDoubleValue = 5d/3;

        System.out.println("myIntValue "+myIntValue);
        System.out.println("myIntValue% "+myIntValue1);
        System.out.println("myFloatValue "+myFloatValue);
        System.out.println("myDoubleValue "+myDoubleValue);
    }
}
