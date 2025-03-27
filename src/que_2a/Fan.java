package que_2a;

// Subclass of Appliance
class Fan extends Appliance {
    @Override
    void turnOn() {
        System.out.println("Fan is turning on...");
    }
}
