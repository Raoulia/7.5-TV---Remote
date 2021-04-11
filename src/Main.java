public class Main {
    public static void main(String[] args) {
        TVset tv = new TVset();
        TVset.Remote pult = tv.getPult();
        System.out.println(tv);
        pult.turnOn();
        System.out.println(tv);
        pult.setChannel(3);
        System.out.println(tv);
        pult.turnOff();
        System.out.println(tv);
    }
}
