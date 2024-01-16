package FurnitureShopFactoryMethod;

// Abstract Product: Chair
interface Chair {
    void sitOn();
}

// Concrete Product 1: ModernChair
class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a modern chair.");
    }
}

// Concrete Product 2: VictorianChair
class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a Victorian chair.");
    }
}

// Abstract Product: Sofa
interface Sofa {
    void lieOn();
}

// Concrete Product 1: ModernSofa
class ModernSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("Lying on a modern sofa.");
    }
}

// Concrete Product 2: VictorianSofa
class VictorianSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("Lying on a Victorian sofa.");
    }
}

// Abstract Factory: FurnitureFactory
interface FurnitureFactory {
    Chair createChair();

    Sofa createSofa();
}

// Concrete Factory 1: ModernFurnitureFactory
class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}

// Concrete Factory 2: VictorianFurnitureFactory
class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}

// Client: FurnitureShop
public class FurnitureShop {
    private FurnitureFactory furnitureFactory;

    public FurnitureShop(FurnitureFactory furnitureFactory) {
        this.furnitureFactory = furnitureFactory;
    }

    public void orderFurniture() {
        Chair chair = furnitureFactory.createChair();
        Sofa sofa = furnitureFactory.createSofa();

        System.out.println("Received new furniture:");
        chair.sitOn();
        sofa.lieOn();
    }

    public static void main(String[] args) {
        // Order Modern Furniture
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        FurnitureShop modernShop = new FurnitureShop(modernFactory);
        modernShop.orderFurniture();

        System.out.println();

        // Order Victorian Furniture
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        FurnitureShop victorianShop = new FurnitureShop(victorianFactory);
        victorianShop.orderFurniture();
    }
}
