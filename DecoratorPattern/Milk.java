package DecoratorPattern;

public class Milk extends Coffee {
    Coffee coffee;

    public Milk(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int cost() {
        return this.coffee.cost() + 20;
    }
}
