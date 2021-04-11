public class TVset {

    int channel = 1;
    boolean isOn; //по-умолчанию false

    @Override
    public String toString() {
        if (!isOn) {
            return "Телевизор выключен";
        }
        return "Канал " + channel + " включён сейчас";
    }
}


class Remote {
    //ссылка на тв, которым управляем
    private TVset tv;

    //связываем тв с пультом
    public void setTV(TVset tv) {
        this.tv = tv;
    }

    //переключаем каналы на тв
    public void setChannel(int number) {
        tv.channel = number;
    }

    //включаем тв
    public void turnOn() {
        tv.isOn = true;
    }

    //выключаем тв
    public void turnOff() {
        tv.isOn = false;
    }
}