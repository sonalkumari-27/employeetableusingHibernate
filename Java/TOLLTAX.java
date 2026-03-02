public class TOLLTAX {
    private int carsCrossed;
    private double totalAmountCollected;
    private String tollMode;    
    public TOLLTAX() {
        carsCrossed = 0;
        totalAmountCollected = 0.0;
        tollMode = "Prepaid";
    }
    public void receiveToll(int carType) {
        double tollAmount = calculateToll(carType);
        totalAmountCollected += tollAmount;
        carsCrossed++;
        System.out.println("Toll received for car type " + carType + ": " + tollAmount);
    }
    private double calculateToll(int carType) {
        switch (carType) {
            case 2:
                return 50.0;
            case 3:
                return 100.0;
            case 4:
                return 150.0;
            default:
                return 0.0;
        }
    }
    public int displayCarsCrossed() {
        return carsCrossed;
    }
    public double displayAmountCollected() {
        return totalAmountCollected;
    }
    public String displayTollMode() {
        return tollMode;
    }
    public static void main(String[] args) {
        TOLLTAX tollTax = new TOLLTAX();
        tollTax.receiveToll(2);
        tollTax.receiveToll(3);
        tollTax.receiveToll(4);
        System.out.println("Number of cars crossed: " + tollTax.displayCarsCrossed());
        System.out.println("Total amount collected: " + tollTax.displayAmountCollected());
        System.out.println("Toll mode: " + tollTax.displayTollMode());
    }
}
