public class TVset {

    private int channel = 1;
    private boolean isOn; //по-умолчанию false
    private Remote pult = new Remote();

    public Remote getPult() {
        return pult;
    }

    @Override
    public String toString() {
        if (!isOn) {
            return "Телевизор выключен";
        }
        return "Канал " + channel + " включён сейчас";
    }


    class Remote {

        //переключаем каналы на тв
        public void setChannel(int number) {
            channel = number;
        }

        //включаем тв
        public void turnOn() {
            isOn = true;
        }

        //выключаем тв
        public void turnOff() {
            isOn = false;
        }
    }
}
