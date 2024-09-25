public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        Device radio = new Radio();

        RemoteControl basicRemote = new BasicRemoteControl(tv);
        RemoteControl advancedRemote = new AdvancedRemoteControl(radio);

        System.out.println("Using basic remote on TV:");
        basicRemote.togglePower();
        basicRemote.setVolume(40);

        System.out.println("\nUsing advanced remote on Radio:");
        advancedRemote.togglePower();
        advancedRemote.setVolume(60);
        ((AdvancedRemoteControl) advancedRemote).mute();
    }
}
