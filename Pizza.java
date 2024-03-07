public class Pizza {
    private int price;
    private Boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppingPrice = 150;
    private int takeAwayFee = 20;

    public Pizza (Boolean veg) {
        this.veg = veg;
        if(this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
    }

    public void getPizzaPrice() {
        System.out.println(this.price);
    }
     
    public void addExtreCheese(){
        System.out.println("Extra cheese added");
        this.price += extraCheesePrice;

    }

    public void addExtraTopping() {
        System.out.println("Extra topping added");
        this.price += extraToppingPrice;

    }

    public void takeAway() {
        System.out.println("Delivery added");
        this.price += takeAwayFee;

    }

    public void getBill() {
        System.out.println("Your bill is " + this.price);
        

    }
}

