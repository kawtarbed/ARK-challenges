package DAY7.C1;

import java.util.ArrayList;
public class MusicLibrary {
    private ArrayList<AudioPlayer> audio = new ArrayList<>();

    public MusicLibrary() {

        audio.add(new MP3Player(85,"Hello"));
        audio.add(new MP3Player(70,"My name "));
        audio.add(new CDPlayer(50,"Documentary"));



    }


    public void pause() {
        for (Playable audio : audio) {
            audio.pause();
            System.out.println();
        }
    }
    public void stop() {
        for (Playable audio : audio) {
            audio.stop();
            System.out.println();
        }

    }
    public void play() {
        for (Playable audio : audio) {
            audio.play();
            System.out.println();
        }
    }

}

