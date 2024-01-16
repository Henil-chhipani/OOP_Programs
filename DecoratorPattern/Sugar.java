package DecoratorPattern;

public class Sugar extends Coffee {
    Coffee coffee;

    public Sugar(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int cost() {
        return this.coffee.cost() + 10;
    }
}
