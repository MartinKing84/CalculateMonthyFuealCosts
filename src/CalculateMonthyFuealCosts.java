public class CalculateMonthyFuealCosts {

    public static float calculateMonthyFuealCosts(String name, float fuelprice, float drivenkilometers, float averageConsumptionOfFuelPer100km) {

        if (fuelprice <= 0) {
            System.out.println("Fuela Price is "+ fuelprice);
            return -1;
        } else if (drivenkilometers <= 0) {
            System.out.println("To calcuate driven 0 kilometers makes no sense. " +
                    "Please provide a real number of driven kilometers");
            return -1;
        }
      return ((drivenkilometers/100)*(fuelprice*averageConsumptionOfFuelPer100km));
    }

}
