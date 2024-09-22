package structural.facade.homeTheaterSystem;

public class SurroundedSoundSystem {
    public void on() {
        System.out.println("Surround Sound System is on.");
    }

    public void setVolume(int level) {
        System.out.println("Setting volume to " + level);
    }

    public void off() {
        System.out.println("Surround Sound System is off.");
    }
}
