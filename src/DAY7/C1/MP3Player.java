package DAY7.C1;

public class MP3Player extends AudioPlayer{
    private String name;
    public MP3Player(int volumeControl,String name) {
        super(volumeControl);
        this.name=name;
    }
    public void setName(String newName){
        System.out.println();
    }
    public String getName() {
        return name;
    }

    @Override
    public void pause() {
        System.out.println("pause the audio :,volume: "+volumeControl);

    }

    @Override
    public void stop() {
        System.out.println("stop the audio :,volume: "+volumeControl);

    }

    @Override
    public void play() {
        System.out.println("play the audio: ,volume: "+volumeControl);

    }
}
