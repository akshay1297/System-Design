package structural.facade.homeTheaterSystem;

public class HomeTheatreFacade {
    private DVDPlayer dvdPlayer;
    private SurroundedSoundSystem surroundedSoundSystem;
    private Projector projector;
    private  Lights lights;

    public HomeTheatreFacade(DVDPlayer dvdPlayer, SurroundedSoundSystem surroundedSoundSystem, Projector projector, Lights lights) {
        this.dvdPlayer = dvdPlayer;
        this.surroundedSoundSystem = surroundedSoundSystem;
        this.projector = projector;
        this.lights = lights;
    }

    public  void watchMovie(String movie){
        System.out.println("Get ready to watch a movie...");
        lights.dim(10); // Default dimming when watching a movie
        projector.on();
        surroundedSoundSystem.on();
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        dvdPlayer.stop();
        dvdPlayer.off();
        surroundedSoundSystem.off();
        projector.off();
        lights.on();
    }

    public void setVolume(int level) {
        surroundedSoundSystem.setVolume(level);
        System.out.println("Volume set to " + level);
    }

    public void setBrightness(int level) {
        lights.dim(level);
        System.out.println("Brightness set to " + level + "%");
    }

}
