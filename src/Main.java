public class Main {

    public static void main(String[] args) {

        String name = "Marcin";

        float result = CalculateMonthyFuealCosts.calculateMonthyFuealCosts("Marcin",
                2.00F,3402,9.00F );
        System.out.println(name + ": Monthly fuel cost are - "+ result);
    }
}