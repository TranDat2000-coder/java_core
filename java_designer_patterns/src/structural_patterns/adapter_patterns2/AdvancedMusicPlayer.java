package structural_patterns.adapter_patterns2;

public class AdvancedMusicPlayer {

    public void playMP4(String filename){
        System.out.println("Playing MP4 file name: " + filename);
    }

    public void playVLC(String filename){
        System.out.println("Playing VLC file name: " + filename);
    }
}
