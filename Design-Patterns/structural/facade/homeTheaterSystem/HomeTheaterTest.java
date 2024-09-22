package structural.facade.homeTheaterSystem;


/*
Imagine you have a home theater system with various components
like a DVD player, projector, surround sound system, and lights.
Turning on each component individually to watch a movie can be tedious.
Instead, you can use a facade (Interface) that simplifies this process and you can use any system (subclasses) runtime (mentioned in FACADE interface).

- DVDPlayer
- SurroundSoundSystem
- Lights
- Projector

- HomeTheatreFacade

- HomeTheatreTest

 */
public class HomeTheaterTest {

    public static void main(String[] args) {
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        SurroundedSoundSystem soundSystem = new SurroundedSoundSystem();
        Lights lights = new Lights();

        HomeTheatreFacade homeTheatreFacade = new HomeTheatreFacade(dvdPlayer, soundSystem, projector, lights);
        homeTheatreFacade.setVolume(7);
        homeTheatreFacade.setBrightness(20);

        homeTheatreFacade.watchMovie("Inception");

        // Change the volume and brightness during the movie
        homeTheatreFacade.setVolume(10);
        homeTheatreFacade.setBrightness(15);

        // Later...
        homeTheatreFacade.endMovie();

    }
}
