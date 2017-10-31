package by.playtika.Coffee;

public class InstantPacks extends Coffee {
    private String CoffeeCond = "InstantPacks";
    private String country;


    private GroundCoffee (String sort, int value, int weight, String country) {
        super(sort, value, weight);
        this.CoffeeCond;
    }

    public String getCountry() {
        return this.country;
    }
    public void setCountry(int c) {
        this.country = c;
    }

}
