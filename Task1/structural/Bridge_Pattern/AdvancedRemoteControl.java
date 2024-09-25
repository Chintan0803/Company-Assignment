public class AdvancedRemoteControl extends RemoteControl {

    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Advanced remote: setting volume.");
        device.setVolume(volume);
    }

    public void mute() {
        System.out.println("Advanced remote: muting the device.");
        device.setVolume(0);
    }
}
