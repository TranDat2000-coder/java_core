package structural_patterns.adapter_patterns2;

public class AudioPlayer implements MusicLayer{

    private MusicPlayerAdapter musicPlayerAdapter;

    @Override
    public void play(String audioType, String filename) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing MP3 file name: " + filename);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            musicPlayerAdapter = new MusicPlayerAdapter(audioType);
            musicPlayerAdapter.play(audioType, filename);
        }else{
            System.out.println("Invalid audio type: " + audioType + ". Supported types are mp3, mp4.");
        }
    }
}
