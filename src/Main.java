public class Main {
    public static void main(String[] args) {
        TVset tv = new TVset();
        Remote pult = new Remote();
        pult.setTV(tv);
        System.out.println(tv);
        pult.turnOn();
        System.out.println(tv);
        pult.setChannel(7);
        System.out.println(tv);
        pult.turnOff();
        System.out.println(tv);
    }
}
