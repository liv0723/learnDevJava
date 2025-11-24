package getting.know.language.obj.clas.inter.pack;

public class BicycleDemo {
    public static void main(String[] args) {

        // Create two different
        // Bicycle objects
        ACMEBicycle bike1 = new ACMEBicycle();
        ACMEBicycle bike2 = new ACMEBicycle();

        // Invoke methods on
        //those objects
        bike1.changeCadence(50);
        bike1.chanceGear(2);
        bike1.speedUp(4);
        bike1.applyBreaks(4);
        bike1.printStates();

        bike2.changeCadence(23);
        bike2.applyBreaks(3);
        bike2.chanceGear(45);
        bike2.printStates();
    }
}
