package structural_patterns.adapter_patterns2;

public class MusicPlayerAdapter implements MusicLayer{

    private AdvancedMusicPlayer advancedMusicPlayer;

    public MusicPlayerAdapter(String audioType){
        if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new AdvancedMusicPlayer();
        }
    }

    @Override
    public void play(String audioType, String filename) {
        if(audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer.playMP4(filename);
        } else {
            System.out.println("Invalid audio type: " + audioType + ". Supported types are mp4.");
        }
    }
}
