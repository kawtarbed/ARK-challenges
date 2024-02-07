package DAY7.C1;

public class CDPlayer extends AudioPlayer{
    private String type;
    public CDPlayer(int volumeControl,String type) {
        super(volumeControl);
        this.type=type;
    }

    @Override
    public void pause() {
        System.out.println("pause the video" +type+",volume: "+volumeControl);
    }

    @Override
    public void stop() {
        System.out.println("stop the video: " +type+",volume:  "+volumeControl);

    }

    @Override
    public void play() {
        System.out.println("play the video: "+type+",volume: "+volumeControl);

    }
}
