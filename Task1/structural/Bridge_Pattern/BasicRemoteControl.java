public class BasicRemoteControl extends RemoteControl {

    public BasicRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Basic remote: setting volume.");
        device.setVolume(volume);
    }
}
