package DAY7.C1;

public abstract class AudioPlayer implements Playable{
    public int volumeControl;
    public AudioPlayer(int volumeControl){
        this.volumeControl=volumeControl;
    }

}
