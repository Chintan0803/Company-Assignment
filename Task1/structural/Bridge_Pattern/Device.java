public interface Device {
    void turnOn();
    void turnOff();
    boolean isOn();
    void setVolume(int volume);
    int getVolume();
}
