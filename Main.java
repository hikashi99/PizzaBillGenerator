public class Main {

    public static void main(String[] args) {
        Pizza basePizza = new Pizza(false);
        basePizza.addExtraTopping();
        basePizza.addExtreCheese();
        basePizza.takeAway();
        basePizza.getBill();
    }
}